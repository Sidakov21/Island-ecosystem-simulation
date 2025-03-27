package Animals.HerbivoresClasses;

import Animals.Animal;
import Animals.Herbivore;
import IslandProcess.Island;
import IslandProcess.Location;

public class Kangaroo extends Herbivore {
    public Kangaroo(int x, int y) {
        super(x, y, 300, 70, 4, 40);
    }

    @Override
    public Animal clone() {
        return new Kangaroo(x, y);
    }

    @Override
    public void move(Island island) {
        // Реализация передвижения волка
    }

    @Override
    public void eat(Location location) {
        // Реализация питания волка
    }

    @Override
    public void reproduce(Location location) {
        // Реализация размножения волка
    }
}
