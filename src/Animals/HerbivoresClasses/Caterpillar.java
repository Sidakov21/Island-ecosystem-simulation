package Animals.HerbivoresClasses;

import Animals.Animal;
import Animals.Herbivore;
import IslandProcess.Island;
import IslandProcess.Location;

public class Caterpillar extends Herbivore {
    public Caterpillar(int x, int y) {
        super(x, y, 0.01, 1000, 0, 0.002);
    }

    @Override
    public Animal clone() {
        return new Caterpillar(x, y);
    }

    @Override
    public void move(Island island) {
        // Гусеница не двигается
    }

    @Override
    public void eat(Location location) {
        // Реализация питания гусеницы
    }

    @Override
    public void reproduce(Location location) {
        // Реализация размножения гусеницы
    }
}
