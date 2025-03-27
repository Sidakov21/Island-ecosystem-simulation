package Animals.HerbivoresClasses;

import Animals.Animal;
import Animals.Herbivore;
import IslandProcess.Location;

import java.util.HashMap;
import java.util.Map;

public class Mouse extends Herbivore {
    private final Map<Class<? extends Animal>, Integer> huntProbabilities = new HashMap<>();

    public Mouse(int x, int y) {
        super(x, y, 0.05, 500, 1, 0.01);
        huntProbabilities.put(Caterpillar.class, 90);
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
    public Animal clone() {
        return new Mouse(x, y);
    }
}
