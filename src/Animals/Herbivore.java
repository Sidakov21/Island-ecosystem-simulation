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

        int newX = Math.max(0, Math.min(island.getWidth() - 1, x + random.nextInt(speed * 2 + 1) - speed));
        int newY = Math.max(0, Math.min(island.getHeight() - 1, y + random.nextInt(speed * 2 + 1) - speed));

        x = newX;
        y = newY;
    }

    @Override
    public void reproduce(Location location) {
        if (!alive) return;
        long count = location.getAnimals().stream().filter(a -> a.getClass().equals(this.getClass())).count();
        if (count >= 2 && random.nextInt(100) < 50) { // 50% шанс размножения
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
