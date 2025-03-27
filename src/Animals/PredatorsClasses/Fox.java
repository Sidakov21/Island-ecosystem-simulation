package Animals.PredatorsClasses;

import Animals.Animal;
import Animals.HerbivoresClasses.*;
import Animals.Predator;

import java.util.HashMap;
import java.util.Map;

public class Fox extends Predator {
    private final Map<Class<? extends Animal>, Integer> huntProbabilities = new HashMap<>();

    public Fox(int x, int y) {
        super(x, y, 8, 30, 2, 2);
        huntProbabilities.put(Rabbit.class, 70);
        huntProbabilities.put(Snake.class, 0);
        huntProbabilities.put(Fox.class, 0);
        huntProbabilities.put(Bear.class, 0);
        huntProbabilities.put(Eagle.class, 0);
        huntProbabilities.put(Horse.class, 0);
        huntProbabilities.put(Deer.class, 0);
        huntProbabilities.put(Mouse.class, 90);
        huntProbabilities.put(Goat.class, 0);
        huntProbabilities.put(Sheep.class, 0);
        huntProbabilities.put(Duck.class, 60);
        huntProbabilities.put(Caterpillar.class, 40);
    }

    @Override
    public Animal clone() {
        return new Fox(x, y);
    }
}
