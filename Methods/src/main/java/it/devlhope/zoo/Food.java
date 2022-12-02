package it.devlhope.zoo;

public class Food {
    public String name;
    //Metto unità di misura nel java doc perchè per il mio software non è molto importante
    /**
     * Energy of the food [kcal]
     */
    public int energy;
    public Food(String name, int energy){
        this.name = name;
        this.energy = energy;
    }
}
