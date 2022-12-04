package it.develhope;

import it.develhope.entities.*;
//mi ha importato delle cose da un altro package, x vedere pacchetti nei sottolivelli li devo importare

public class Start {

    public static void main(String[] args) {

        System.out.println("------Start the zoo");

        Giraffe giraffe = new Giraffe();
        //System.out.println(giraffe.type);
        //puoi vederlo anche così ma meglio con breakpoint

        Lion lion = new Lion();

        Penguin penguin = new Penguin();

        Eagle eagle = new Eagle();


        //manca implementazione di eat in Animal, non lòo posso istanziare
        AbstractAnimal animal = new AbstractAnimal(){
            @Override
            public void talk() {
                System.out.println("Talk animal");
            }

            @Override
            public void drink() {
                System.out.println("Drink animal");
            }

            @Override
            public void eat() {
                System.out.println("This animal eats all the stuff");
            }
        };
        //animal.name = "zebra";

        //type sarà undefined ma non importa
        //System.out.println("Animal name: " + animal.name);

        Zookeeper zookeeper = new Zookeeper();

        zookeeper.feedAnimal(animal); //null perchè la zebra non aveva type
        zookeeper.feedAnimal(giraffe);
        zookeeper.feedAnimal(lion);
        zookeeper.feedAnimal(penguin);

        zookeeper.talkWithAnimal(animal);
        zookeeper.talkWithAnimal(giraffe);
        zookeeper.talkWithAnimal(lion);
        zookeeper.talkWithAnimal(penguin);

        //zookeeper.makeAnimalFly(lion); no perchè leone non rispetta quel contratto
        zookeeper.makeAnimalFly(eagle);

    }

}
