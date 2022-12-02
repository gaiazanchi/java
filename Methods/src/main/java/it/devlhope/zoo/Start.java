package it.devlhope.zoo;

public class Start {
    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("We are creating the zoo!");
        System.out.println("----------------------");

        /*
        Avrei anche potuto scrivere
        Animal giraffe, lion;
        giraffe = new Animal();
        lion = new Animal();
        Non consigliato, incappo in null point reception
        */
        System.out.println("---Declared three animals");
        Animal giraffe = new Animal("Valentina", "Giraffe");
        Animal lion = new Animal("Leo");
        Animal penguin = new Animal(false);
        System.out.println("---Created three animals");

        //Now all the missing characteristics
        giraffe.hasFur = true;
        lion.type = "Lion";
        penguin.name = "Giovanni";
        penguin.type = "Penguin";

        //mi da problemi poichè metodo costruttore inserito ha un argomento
        Zookeeper Marco = new Zookeeper("Marco");
        Marco.surname = "Rossi";
        //Extracting the complete name
        String marcoCompleteName = Zookeeper.getCompleteName(Marco);
        // String marcoCompleteName = Marco.getCompleteName(); nell'altro modo

        System.out.println("Zookeper name is: " + marcoCompleteName);
        System.out.println("Zookeper name is: " + Marco.getCompleteNameV2());

        System.out.println("----------------------");

        //Creating food
        Food meat = new Food("T-bone", 500);
        Food green = new Food("Grass", 200);
        Food leaf = new Food("Leaf",100);
        // Food leaf = null; --> errore null point reception
        // Food leaf; troverò errore in giraffeCalories e mi dice che leaf potrebbe non essere inizializzata

        int giraffeCalories = Marco.feedAnimal(giraffe, leaf);
        int lionCalories = Marco.feedAnimal(lion, meat);
        int penguinCalories = Marco.feedAnimal(penguin, green);

        int totalCalories = giraffeCalories + lionCalories + penguinCalories;

        System.out.println("All animals are fed with " + totalCalories + " kcal");

    }
}
