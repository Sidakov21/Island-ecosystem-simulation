package Animals.HerbivoresClasses;

import Animals.Animal;
import Animals.Herbivore;
import IslandProcess.Island;
import IslandProcess.Location;

public class Duck extends Herbivore {
    public Duck(int x, int y) {
        super(x, y, 1, 200, 1, 0.15);
    }

    @Override
    public Animal clone() {
        return new Duck(x, y);
    }

    @Override
    public void move(Island island) {
        // Реализация передвижения утки
    }

    @Override
    public void eat(Location location) {
        // Реализация питания утки
    }

    @Override
    public void reproduce(Location location) {
        // Реализация размножения утки
    }
}
