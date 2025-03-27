package IslandProcess;

import Animals.Animal;
import Plants.Plant;

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
}
