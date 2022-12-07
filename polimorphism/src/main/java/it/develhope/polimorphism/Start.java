package it.develhope.polimorphism;

import it.develhope.polimorphism.entities.*;
import it.develhope.polimorphism.interfaces.Animal;
import it.develhope.polimorphism.interfaces.Food;

import java.util.ArrayList;
import java.util.List;

public class Start {

    //deve essere static poichè main lo è
    static Food genericFood = new Food(){
        @Override
        public double getCalories() {
            return 500;
        }

        @Override
        public double getFatGrams() {
            return 10;
        }

        @Override
        public double getCarbsGrams() {
            return 50;
        }

        @Override
        public double getVitaminsGrams() {
            return 3;
        }

        @Override
        public double getProteinsGrams() {
            return 100;
        }

        @Override
        public String getName() {
            return "Generic food";
        }
    };

    public static void main(String[] args) {

        //stesso tipo di oggetto dichiarato in 3 modi diversi
        Animal lion = new Lion();
        AnimalAbstract lion1 = new Lion();
        Lion lion2 = new Lion();

        Animal zebra = new Zebra();
        AnimalAbstract zebra1 = new Zebra();
        Zebra zebra2 = new Zebra();

        Animal dolphin = new Dolphin();
        //AnimalAbstract dolphin1 = new Dolphin();
        //diventando pesce astratto perde animale astratto
        FishAbstract dolphin1 = new Dolphin();
        Dolphin dolphin2 = new Dolphin();

        //estendono a animal quindi possono stare nella lista
        List<Animal> zoo = new ArrayList<>();
        zoo.add(lion);
        zoo.add(zebra);
        zoo.add(dolphin);

        System.out.println("---------------------------------------");

        System.out.println("Lion vs zebra, does the lion win? " + lion.fightAgainst(zebra));

        System.out.println("Dolphin vs zebra, does the dolphin win? " + dolphin.fightAgainst(zebra));

        System.out.println("---------------------------------------");

        zoo.stream().forEach(animal ->{
            animal.run();
        });
        //chiamo run dall'interfaccia non so nulla di come l'animale sia implementato all'interno
        //poi sarà l'implementazione specifica a richiamare il run giusto

        System.out.println("---------------------------------------");

        double totalCalories = 0;

        //lista polimorfa
        zoo.stream().forEach(animal -> {
            //non gli posso dare nessun food perchè le interfaccie non sono implementabili
            // a meno che non istanzio sul posto tutti i metodi che mi servono
            double calories = animal.eat(genericFood);
            System.out.println("---------------------------------------");
        });


        for(int i = 0; i < zoo.size(); i++){
            Animal single = zoo.get(i);
            double totalCaloriesAnimal = single.eat(genericFood);
            System.out.println("---------------------------------------");
            totalCalories += totalCaloriesAnimal;
        }

        //l'ho castata a livello dell'interfaccia, avrà tutti i metodi dell'interfaccia
        Animal zebraAnimal = (Animal)zebra2;
        zebraAnimal.run();
        //invece zebra2 che è di tipo Zebra avrà i metodi di zebra o quelli di AnimalAbstract nel caso di fightAgainst
        Lion lionCast = (Lion)lion;
        // se non vale sollevo l'eccezione invalid cast exception

        System.out.println("All animal have eaten " + totalCalories + " calories.");

        System.out.println("---------------------------------------");

    }

}
