package it.devlhope.zoo;

public class Zookeeper {
    public String name;
    public String surname;
    //posso mettere in input solo il nome e richiamerò questo metodo
    public Zookeeper(String name){
        this.name = name;
    }
    //oppure posso mettere 2 input e richiamare questo
    public int feedAnimal (Animal animal, Food food){
        //this.feedAnimal(animal, food);
        this.callAnimal(animal);
        System.out.println(name + " is feeding " + animal.name + " with food: " + food.name);

        return food.energy;
    }

    public void callAnimal(){
        System.out.println("Calling the animal!");
    }

    public void callAnimal(Animal animal){
        System.out.println("Calling " + animal.name);
    }

    /**
     * Gets the complete name of the zookeeper
     * @deprecated Moving on getCompleteNameV2
     * @return The zookeeper complete name
     */
    public String getCompleteName(){
        return name + " " + surname;
    }

    public String getCompleteNameV2(){
        return Zookeeper.getCompleteName(this);
    }

    /**
     * Extract the zookeeper complete name (name and surname)
     * @param zookeeper The zookeeper to work on
     * @return The zookeeper complete name
     */
    public static String getCompleteName(Zookeeper zookeeper){
        return zookeeper.name + " " + zookeeper.surname;
    }
    //Ne ho due uguali, o ne cancello una, di solito si tiene quella statica
    //oppure faccio in modo che una richiami l'altra
}
