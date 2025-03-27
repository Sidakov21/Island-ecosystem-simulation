package Animals.PredatorsClasses;

import Animals.Animal;
import Animals.HerbivoresClasses.*;
import Animals.Predator;

import java.util.HashMap;
import java.util.Map;

public class Wolf extends Predator {
    private final Map<Class<? extends Animal>, Integer> huntProbabilities = new HashMap<>();

    public Wolf(int x, int y) {
        super(x, y, 50, 30, 3, 8);
        huntProbabilities.put(Rabbit.class, 60);
        huntProbabilities.put(Snake.class, 0);
        huntProbabilities.put(Fox.class, 0);
        huntProbabilities.put(Bear.class, 0);
        huntProbabilities.put(Eagle.class, 0);
        huntProbabilities.put(Horse.class, 10);
        huntProbabilities.put(Deer.class, 15);
        huntProbabilities.put(Mouse.class, 80);
        huntProbabilities.put(Goat.class, 60);
        huntProbabilities.put(Sheep.class, 70);
        huntProbabilities.put(Duck.class, 40);
        huntProbabilities.put(Caterpillar.class, 0);
    }

    @Override
    public Animal clone() {
        return new Wolf(x, y);
    }
}
