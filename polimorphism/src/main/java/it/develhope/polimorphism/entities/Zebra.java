package it.develhope.polimorphism.entities;

import it.develhope.polimorphism.interfaces.Food;
import jdk.jfr.DataAmount;

@DataAmount
public class Zebra extends  AnimalAbstract{

    public int numberOfStrings;

    @Override
    public double eat(Food food) {
        this.printFood(food);
        return food.getCalories() * 0.35;
    }

    @Override
    public void run() {
        System.out.println("The zebra is running");
    }

    @Override
    public double getStrength() {
        return 37;
    }
}
