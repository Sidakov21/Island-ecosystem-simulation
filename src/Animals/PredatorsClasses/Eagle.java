package Animals.PredatorsClasses;

import Animals.Animal;
import Animals.HerbivoresClasses.*;
import Animals.Predator;

import java.util.HashMap;
import java.util.Map;

public class Eagle extends Predator {
    private final Map<Class<? extends Animal>, Integer> huntProbabilities = new HashMap<>();

    public Eagle(int x, int y) {
        super(x, y, 6, 20, 3, 1);
        huntProbabilities.put(Rabbit.class, 90);
        huntProbabilities.put(Snake.class, 50);
        huntProbabilities.put(Fox.class, 10 );
        huntProbabilities.put(Bear.class, 0);
        huntProbabilities.put(Horse.class, 0);
        huntProbabilities.put(Deer.class, 0);
        huntProbabilities.put(Mouse.class, 90);
        huntProbabilities.put(Goat.class, 0);
        huntProbabilities.put(Sheep.class, 0);
        huntProbabilities.put(Duck.class, 80);
        huntProbabilities.put(Caterpillar.class, 0);
    }

    @Override
    public Animal clone() {
        return new Eagle(x, y);
    }
}
