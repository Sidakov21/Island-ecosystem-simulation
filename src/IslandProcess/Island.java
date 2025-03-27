package IslandProcess;

import Animals.Animal;

import java.util.ArrayList;

public class Island {
    private final Location[][] locations;
    private final int width;
    private final int height;

    public Island(int width, int height)
    {
        this.width = width;
        this.height = height;
        locations = new Location[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                locations[i][j] = new Location();
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Location getLocation (int x, int y){
        return locations[x][y];
    }

    public void update(){
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Location location = locations[i][j];

                // Передвижение
                for (Animal animal : new ArrayList<>(location.getAnimals())) {
                    animal.move(this);
                }

                // Поедание
                for (Animal animal : new ArrayList<>(location.getAnimals())) {
                    animal.eat(location);
                }

                // Размножение
                for (Animal animal : new ArrayList<>(location.getAnimals())) {
                    animal.reproduce(location);
                }

                // Проверка здоровья
                for (Animal animal : new ArrayList<>(location.getAnimals())) {
                    animal.checkHealth(location);
                }
            }
        }
        printStatistics(); //Состояние острова после обновления
    }

    public void printStatistics() {
        int totalAnimals = 0;
        int totalPlants = 0;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                totalAnimals += locations[i][j].getAnimals().size();
                totalPlants += locations[i][j].getPlants().size();
            }
        }
        System.out.println("Текущее состояние острова:");
        System.out.println("Всего животных: " + totalAnimals);
        System.out.println("Всего растений: " + totalPlants);
    }
}
