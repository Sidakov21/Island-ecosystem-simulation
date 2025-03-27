package Animals;

import IslandProcess.*;
import Plants.Plant;

import java.util.Random;

public abstract class Animal {
    protected int x, y;
    protected double weight;
    protected int maxCountPerCell;
    protected int speed;
    protected double maxFood;
    protected double currentFood = 0;
    protected boolean alive = true;
    protected Random random = new Random();

    public Animal(int x, int y, double weight, int maxCountPerCell, int speed, double maxFood) {
        this.x = x;
        this.y = y;
        this.weight = weight;
        this.maxCountPerCell = maxCountPerCell;
        this.speed = speed;
        this.maxFood = maxFood;
    }

    public void move(Island island){
        if (!alive){
            return;
        }

        int newX = Math.max(0, Math.min(island.getLocation(x, y).getAnimals().size() - 1, x + random.nextInt(speed * 2 + 1) - speed));
        int newY = Math.max(0, Math.min(island.getLocation(x, y).getAnimals().size() - 1, y + random.nextInt(speed * 2 + 1) - speed));
        this.x = newX;
        this.y = newY;
    }
    public void eat(Location location)
    {
        if (!alive) return;
        for (Plant plant : location.getPlants()) {
            if (currentFood < maxFood) {
                location.removePlant(plant);
                currentFood += maxFood;
                break;
            }
        }
    }

    public abstract Animal clone();

    public void reproduce(Location location)
    {
        if (!alive) return;
        long count = location.getAnimals().stream().filter(a -> a.getClass().equals(this.getClass())).count();
        if (count >= 2) {
            location.addAnimal(this.clone());
        }
    }

    public void checkHealth (Location location)
    {
        if (currentFood <= 0){
            alive = false;
            location.removeAnimal(this);

        }
        else {
            currentFood -= weight * 0.05;
        }
    }

}