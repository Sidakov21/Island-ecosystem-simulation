package Animals.HerbivoresClasses;

import Animals.Animal;
import Animals.Herbivore;
import IslandProcess.Island;
import IslandProcess.Location;

public class Horse extends Herbivore {
    public Horse(int x, int y) {
        super(x, y, 70, 140, 3, 15);
    }

    @Override
    public Animal clone() {
        return new Horse(x, y);
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
