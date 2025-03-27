package Animals.HerbivoresClasses;

import Animals.Animal;
import Animals.Herbivore;

public class Caterpillar extends Herbivore {
    public Caterpillar(int x, int y) {
        super(x, y, 0.01, 1000, 0, 0.002);
    }

    @Override
    public Animal clone() {
        return new Caterpillar(x, y);
    }
}
