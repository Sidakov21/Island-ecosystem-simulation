package Animals.HerbivoresClasses;

import Animals.Animal;
import Animals.Herbivore;
import IslandProcess.Island;
import IslandProcess.Location;

public class Hamster extends Herbivore {
    public Hamster(int x, int y) {
        super(x, y, 0.1, 500, 1, 0.03);
    }

    @Override
    public Animal clone() {
        return new Hamster(x, y);
    }

    @Override
    public void move(Island island) {
        // Реализация передвижения хомяка
    }

    @Override
    public void eat(Location location) {
        // Реализация питания хомяка
    }

    @Override
    public void reproduce(Location location) {
        // Реализация размножения хомяка
    }
}
