import Animals.HerbivoresClasses.Deer;
import Animals.HerbivoresClasses.Rabbit;
import Animals.PredatorsClasses.Wolf;
import IslandProcess.Island;
import IslandProcess.Location;
import Plants.Plant;

import java.util.Random;

public class Main {

    private static void populateIsland(Island island) {
        Random random = new Random();

        // Добавляем животных
        for (int i = 0; i < 10; i++) {  // По 10 животных каждого типа
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            island.getLocation(x, y).addAnimal(new Wolf(x, y));
            island.getLocation(x, y).addAnimal(new Rabbit(x, y));
            island.getLocation(x, y).addAnimal(new Deer(x, y));
        }

        for (int i = 0; i < 50; i++) {  // Добавляем 50 растений
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            island.getLocation(x, y).addPlant(new Plant(1.0, 0.1));
        }
    }

    // Метод для отображения состояния острова после каждого шага
    private static void printIslandState(Island island) {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                Location location = island.getLocation(x, y);
                System.out.print("[" + location.getAnimals().size() + "A/" + location.getPlants().size() + "P] ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Создаем остров 10x10
        Island island = new Island(10, 10);

        // Заселяем остров животными и растениями
        populateIsland(island);

        // Запускаем симуляцию на несколько шагов
        for (int i = 0; i < 10; i++) {
            System.out.println("Шаг симуляции: " + (i + 1) + "\n");
            island.update();
        }
    }
}
