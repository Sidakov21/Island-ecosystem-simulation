package Animals.HerbivoresClasses;

import Animals.Animal;
import Animals.Herbivore;
import IslandProcess.Island;
import IslandProcess.Location;

public class Deer extends Herbivore {
    public Deer(int x, int y) {
        super(x, y, 300, 20, 4, 50);
    }

    @Override
    public Animal clone() {
        return new Deer(x, y);
    }

    @Override
    public void move(Island island) {
        // Реализация передвижения оленя
    }

    @Override
    public void eat(Location location) {
        // Реализация питания оленя
    }

    @Override
    public void reproduce(Location location) {
        // Реализация размножения оленя
    }
}
