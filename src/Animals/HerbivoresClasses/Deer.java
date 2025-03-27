package Animals.HerbivoresClasses;

import Animals.Animal;
import Animals.Herbivore;


public class Deer extends Herbivore {
    public Deer(int x, int y) {
        super(x, y, 300, 20, 4, 50);
    }

    @Override
    public Animal clone() {
        return new Deer(x, y);
    }
}
