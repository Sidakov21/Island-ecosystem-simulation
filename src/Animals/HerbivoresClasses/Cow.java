package Animals.HerbivoresClasses;

import Animals.Animal;
import Animals.Herbivore;
import IslandProcess.Island;
import IslandProcess.Location;

public class Cow extends Herbivore {
    public Cow(int x, int y) {
        super(x, y, 500, 20, 3, 100);
    }

    @Override
    public Animal clone() {
        return new Cow(x, y);
    }

    @Override
    public void move(Island island) {
        // Реализация передвижения коровы
    }

    @Override
    public void eat(Location location) {
        // Реализация питания коровы
    }

    @Override
    public void reproduce(Location location) {
        // Реализация размножения коровы
    }
}
