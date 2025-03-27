package Animals.HerbivoresClasses;

import Animals.Animal;
import Animals.Herbivore;
import IslandProcess.Island;
import IslandProcess.Location;

public class Goat extends Herbivore {
    public Goat(int x, int y) {
        super(x, y, 60, 140, 3, 10);
    }

    @Override
    public Animal clone() {
        return new Goat(x, y);
    }

    @Override
    public void move(Island island) {
        // Реализация передвижения козы
    }

    @Override
    public void eat(Location location) {
        // Реализация питания козы
    }

    @Override
    public void reproduce(Location location) {
        // Реализация размножения козы
    }
}
