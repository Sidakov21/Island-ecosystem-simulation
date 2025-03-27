package Animals.HerbivoresClasses;

import Animals.Animal;
import Animals.Herbivore;

public class Sheep extends Herbivore {
    public Sheep(int x, int y) {
        super(x, y, 70, 140, 3, 15);
    }

    @Override
    public Animal clone() {
        return new Sheep(x, y);
    }
}
