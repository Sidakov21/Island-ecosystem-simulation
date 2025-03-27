package Animals.HerbivoresClasses;

import Animals.Animal;
import Animals.Herbivore;

public class Horse extends Herbivore {
    public Horse(int x, int y) {
        super(x, y, 70, 140, 3, 15);
    }

    @Override
    public Animal clone() {
        return new Horse(x, y);
    }
}
