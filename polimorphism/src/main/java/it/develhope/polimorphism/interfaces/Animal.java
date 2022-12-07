package it.develhope.polimorphism.interfaces;

//definisco animale attraverso interfacce
public interface Animal {

    double eat (Food food);
    //returna le calorie totali acquisite dall'animale

    void drink(Drinkable drinkable);

    void run();

    double getStrength();

    boolean fightAgainst(Animal animal);

}
