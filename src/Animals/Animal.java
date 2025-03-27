package Animals;

import IslandProcess.*;

import java.util.Random;

public abstract class Animal {
    protected int x, y;
    public double weight;
    protected int maxCountPerCell;
    protected int speed;
    protected double maxFood;
    protected double currentFood = maxFood / 2;
    protected boolean alive = true;
    protected Random random = new Random();

    public Animal(int x, int y, double weight, int maxCountPerCell, int speed, double maxFood) {
        this.x = x;
        this.y = y;
        this.weight = weight;
        this.maxCountPerCell = maxCountPerCell;
        this.speed = speed;
        this.maxFood = maxFood;
    }

    protected void logAction(String action) {
        System.out.println(this.getClass().getSimpleName() + " (" + x + ", " + y + ") " + action);
    }

    public abstract void move(Island island);
    public abstract void eat(Location location);
    public abstract void reproduce(Location location);
    public abstract Animal clone();
    public abstract void checkHealth(Location location);
}