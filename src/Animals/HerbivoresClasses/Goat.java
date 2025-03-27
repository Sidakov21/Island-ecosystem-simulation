package Animals.HerbivoresClasses;

import Animals.Animal;
import Animals.Herbivore;

public class Goat extends Herbivore {
    public Goat(int x, int y) {
        super(x, y, 60, 140, 3, 10);
    }

    @Override
    public Animal clone() {
        return new Goat(x, y);
    }
}
