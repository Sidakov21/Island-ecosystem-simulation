package Animals.HerbivoresClasses;

import Animals.Animal;
import Animals.Herbivore;

public class Cow extends Herbivore {
    public Cow(int x, int y) {
        super(x, y, 500, 20, 3, 100);
    }

    @Override
    public Animal clone() {
        return new Cow(x, y);
    }
}
