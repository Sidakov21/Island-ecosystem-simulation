package Animals.HerbivoresClasses;

import Animals.Animal;
import Animals.Herbivore;
import IslandProcess.Island;
import IslandProcess.Location;

public class Rabbit extends Herbivore {
    public Rabbit(int x, int y) {
        super(x, y, 2, 150, 2, 0.45);
    }
    @Override
    public Animal clone() {
        return new Rabbit(x, y);
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
