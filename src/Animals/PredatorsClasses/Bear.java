package Animals.PredatorsClasses;

import Animals.Animal;
import Animals.HerbivoresClasses.*;
import Animals.Predator;

import java.util.HashMap;
import java.util.Map;

public class Bear extends Predator {
    private final Map<Class<? extends Animal>, Integer> huntProbabilities = new HashMap<>();

    public Bear(int x, int y) {
        super(x, y, 500, 5, 2, 80);
        huntProbabilities.put(Rabbit.class, 80);
        huntProbabilities.put(Snake.class, 80);
        huntProbabilities.put(Fox.class, 50);
        huntProbabilities.put(Eagle.class, 0);
        huntProbabilities.put(Horse.class, 40);
        huntProbabilities.put(Deer.class, 80);
        huntProbabilities.put(Mouse.class, 90);
        huntProbabilities.put(Goat.class, 70);
        huntProbabilities.put(Sheep.class, 70);
        huntProbabilities.put(Duck.class, 10);
        huntProbabilities.put(Caterpillar.class, 0);
    }

    @Override
    public Animal clone() {
        return new Bear(x, y);
    }
}
