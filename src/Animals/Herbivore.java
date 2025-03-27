package Animals;

import IslandProcess.Island;
import IslandProcess.Location;
import Plants.Plant;

public abstract class Herbivore extends Animal {
    public Herbivore(int x, int y, double weight, int maxCountPerCell, int speed, double maxFood) {
        super(x, y, weight, maxCountPerCell, speed, maxFood);
    }

    @Override
    public void eat(Location location) {
        if (!alive) return;

        for (Plant plant : location.getPlants()) {
            if (currentFood < maxFood) {
                location.removePlant(plant);
                currentFood = Math.min(maxFood, currentFood + plant.getWeight());
                return;
            }
        }
    }

    @Override
    public void move(Island island) {
        if (!alive) return;
        x += random.nextInt(speed * 2 + 1) - speed;
        y += random.nextInt(speed * 2 + 1) - speed;
    }

    @Override
    public void reproduce(Location location) {
        if (!alive) return;
        long count = location.getAnimals().stream().filter(a -> a.getClass().equals(this.getClass())).count();
        if (count >= 2) {
            location.addAnimal(this.clone());
        }
    }

    @Override
    public void checkHealth(Location location) {
        if (currentFood <= 0) {
            alive = false;
            location.removeAnimal(this);
        } else {
            currentFood -= weight * 0.05;
        }
    }
}
