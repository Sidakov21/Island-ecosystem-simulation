package Animals.PredatorsClasses;

import Animals.Predator;
import IslandProcess.Island;
import IslandProcess.Location;

public class Fox  extends Predator {
    public Fox(int x, int y)
    {
        super(x, y, 80, 30, 2, 2);
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
