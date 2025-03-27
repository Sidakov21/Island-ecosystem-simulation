package Plants;

import Interfaces.Etable;

public class Plant implements Etable {
    private double weight;  // Вес растения
    private double growthRate; //скорость роста
    private boolean wilted = false;

    public Plant (double weight, double growthRate){
        this.weight = weight;
        this.growthRate = growthRate;
    }

    public double getWeight() {
        return weight;
    }

    public void grow() {
        if (!wilted) {
            weight += growthRate;  // Растение может расти
        }
    }

    public void wilt(){
        wilted = true;
    }

    public boolean isWilted(){
        return wilted;
    }

    @Override
    public void beEaten(){
        wilt(); // Растение умирает после поедания
    }
}
