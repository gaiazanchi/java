package it.develhope.polimorphism.entities;

import it.develhope.polimorphism.interfaces.Animal;

public abstract class FishAbstract implements Animal {

    @Override
    public boolean fightAgainst(Animal animal) {
        //zebra non sarà istanze di FishAbstract --> non possono combattere
        if(animal instanceof FishAbstract){
            System.out.println("The can fight");
            return this.getStrength() - animal.getStrength() > 0;
        }else{
            System.out.println("They cannot fight");
            return false;
        }
    }
}
