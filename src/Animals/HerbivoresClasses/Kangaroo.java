package Animals.HerbivoresClasses;

import Animals.Animal;
import Animals.Herbivore;

public class Kangaroo extends Herbivore {
    public Kangaroo(int x, int y) {
        super(x, y, 300, 70, 4, 40);
    }

    @Override
    public Animal clone() {
        return new Kangaroo(x, y);
    }
}
