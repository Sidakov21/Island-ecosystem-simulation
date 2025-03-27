package Animals;

import IslandProcess.Island;
import IslandProcess.Location;

import java.util.HashMap;
import java.util.Map;

public abstract class Predator extends Animal {
    protected final Map<Class<? extends Animal>, Integer> huntProbabilities = new HashMap<>();

    public Predator(int x, int y, double weight, int speed, int maxFood, double currentFood) {
        super(x, y, weight, speed, maxFood, currentFood);
    }

    @Override
    public void eat(Location location) {
        if (!alive) return;
        for (Animal prey : location.getAnimals()) {
            if (prey instanceof Herbivore) {
                int probability = huntProbabilities.getOrDefault(prey.getClass(), 0);
                if (Math.random() * 100 < probability) {
                    location.removeAnimal(prey);
                    currentFood = Math.min(maxFood, currentFood + prey.weight);
                    return;
                }
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