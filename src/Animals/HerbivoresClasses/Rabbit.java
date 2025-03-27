package Animals.HerbivoresClasses;

import Animals.Animal;
import Animals.Herbivore;

public class Rabbit extends Herbivore {
    public Rabbit(int x, int y) {
        super(x, y, 2, 150, 2, 0.45);
    }
    @Override
    public Animal clone() {
        return new Rabbit(x, y);
    }
}
