package it.develhope.polimorphism.entities;

import it.develhope.polimorphism.interfaces.Drinkable;
import it.develhope.polimorphism.interfaces.Food;
import jdk.jfr.DataAmount;

@DataAmount
public class Dolphin extends FishAbstract{

    private double speed;

    @Override
    public double eat(Food food) {
        //this.printFood(food);
        //l'ho perso perchè stava in animal abstract
        System.out.println("The dolphin is eating " + food.getName());
        return food.getCalories() * 0.87;
    }

    @Override
    public void drink(Drinkable drinkable) {

    }

    @Override
    public void run() {
        System.out.println("The dolphin does not run");
    }

    @Override
    public double getStrength() {
        return 56;
    }

}
