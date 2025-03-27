package Animals.PredatorsClasses;

import Animals.Predator;
import IslandProcess.Island;
import IslandProcess.Location;

public class Eagle extends Predator {
    public Eagle(int x, int y)
    {
        super(x, y, 6, 20, 3, 1);
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
