package Plants;

import Interfaces.Etable;

public class Plant implements Etable {
    private double growthRate; // Скорость роста
    private boolean wilted = false; //Увядание

    public Plant (double growthRate){
        this.growthRate = growthRate;
    }

    public void grow()
    {
        if (!wilted){
            // Логика роста
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
