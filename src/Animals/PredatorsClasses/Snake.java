package Animals.PredatorsClasses;

import Animals.Predator;
import IslandProcess.*;

public class Snake extends Predator {
    public Snake(int x, int y)
    {
        super(x, y, 15, 30, 1, 3);
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
