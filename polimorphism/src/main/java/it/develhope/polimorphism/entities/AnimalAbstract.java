package it.develhope.polimorphism.entities;

import it.develhope.polimorphism.interfaces.Animal;
import it.develhope.polimorphism.interfaces.Drinkable;
import it.develhope.polimorphism.interfaces.Food;

public abstract class AnimalAbstract implements Animal {

    private double strength;

    @Override
    public boolean fightAgainst(Animal animal) {
        return this.getStrength() - animal.getStrength() > 0;
    }
    //se animale vince vale true, se perde false

    @Override
    public void drink(Drinkable drinkable) {
        System.out.println("The animal is drinking " + drinkable.getName());
    }

    protected void printFood(Food food){

        System.out.println("The " + this.getClass().getName() + " is eating " + food.getName());
        System.out.println("Nutrition - Carbs: " + food.getCarbsGrams() + " grams.");
        System.out.println("Fat: " + food.getFatGrams() + " grams.");
        System.out.println("Vitamins: " + food.getVitaminsGrams() + " grams.");
        System.out.println("Proteins: " + food.getProteinsGrams() + " grams.");

    }

}
