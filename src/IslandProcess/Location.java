package IslandProcess;

import Animals.Animal;
import Plants.Plant;

import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class Location {
    private final List<Animal> animals = new CopyOnWriteArrayList<>();
    private final List<Plant> plants = new CopyOnWriteArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void addPlant(Plant plant){
        plants.add(plant);
    }

    public void removePlant(Plant plant) {
        plants.remove(plant);
    }

    public List<Animal> getAnimals(){
        return animals;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    // Метод для перемещения животного из одной локации в другую
    public void moveAnimal(Animal animal, Location newLocation) {
        removeAnimal(animal);
        newLocation.addAnimal(animal);
    }


    public void growPlants() {
        Random random = new Random();
        if (random.nextInt(100) < 30) { // 30% шанс роста новых растений
            plants.add(new Plant(1.0, 0.1));
        }
    }

    public void update(Island island) {
        growPlants(); // Растения растут
        for (Animal animal : animals) {
            animal.move(island);  // Двигаем животное
            animal.eat(this);  // Животное ест
            animal.reproduce(this);  // Проверяем размножение
            animal.checkHealth(this);  // Проверяем здоровье (умирает ли оно от голода)
        }
    }
}
