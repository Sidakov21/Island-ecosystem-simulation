package Animals.PredatorsClasses;

import Animals.Animal;
import Animals.HerbivoresClasses.*;
import Animals.Predator;

import java.util.HashMap;
import java.util.Map;

public class Snake extends Predator {
    private final Map<Class<? extends Animal>, Integer> huntProbabilities = new HashMap<>();

    public Snake(int x, int y) {
        super(x, y, 15, 30, 1, 3);
        huntProbabilities.put(Rabbit.class, 20);
        huntProbabilities.put(Snake.class, 0);
        huntProbabilities.put(Fox.class, 15);
        huntProbabilities.put(Bear.class, 0);
        huntProbabilities.put(Eagle.class, 10);
        huntProbabilities.put(Horse.class, 0);
        huntProbabilities.put(Deer.class, 0);
        huntProbabilities.put(Mouse.class, 40);
        huntProbabilities.put(Goat.class, 0);
        huntProbabilities.put(Sheep.class, 0);
        huntProbabilities.put(Duck.class, 10);
        huntProbabilities.put(Caterpillar.class, 0);
    }

    @Override
    public Animal clone() {
        return new Snake(x, y);
    }
}
