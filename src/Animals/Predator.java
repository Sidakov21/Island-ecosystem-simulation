package Animals;

public abstract class Predator extends Animal {
    public Predator(int x, int y, double weight, int maxCountPerCell, int speed, double maxFood) {
        super(x, y, weight, maxCountPerCell, speed, maxFood);
    }
}