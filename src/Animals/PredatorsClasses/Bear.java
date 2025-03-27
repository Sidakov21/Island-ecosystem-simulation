package Animals.PredatorsClasses;

import Animals.Predator;
import IslandProcess.Island;
import IslandProcess.Location;

public class Bear extends Predator {
    public Bear(int x, int y)
    {
        super(x, y, 500, 5, 2, 80);
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
