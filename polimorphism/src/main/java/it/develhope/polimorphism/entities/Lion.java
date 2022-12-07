package it.develhope.polimorphism.entities;

import it.develhope.polimorphism.interfaces.Food;
import jdk.jfr.DataAmount;

@DataAmount
public class Lion extends  AnimalAbstract{

    private double weight;

    @Override
    public double eat(Food food) {
        this.printFood(food);
        return food.getCalories() * 0.58;
    }
    //il 58% del mangiato va in energia

    @Override
    public void run() {
        System.out.println("The lion is running");
    }

    @Override
    public double getStrength() {
        return 67;
    }

}
