package Animals.HerbivoresClasses;

import Animals.Animal;
import Animals.Herbivore;

public class Hamster extends Herbivore {
    public Hamster(int x, int y) {
        super(x, y, 0.1, 500, 1, 0.03);
    }

    @Override
    public Animal clone() {
        return new Hamster(x, y);
    }
}
