package Animals.PredatorsClasses;

import Animals.Predator;
import IslandProcess.*;

public class Wolf extends Predator {
    public Wolf(int x, int y) {
        super(x, y, 50, 30, 3, 8);
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
