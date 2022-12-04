package it.develhope.entities;

public class Zookeeper {

    public String name;

    //gli posso dare anche un'istanza di Giraffe perchè è figlia di Animal, quindi sempre a quel tipo appartiene
    //può essere una giraffa ma io lo tratto come un animale generico
    public void feedAnimal(AbstractAnimal animal){
        System.out.println("I'm feeding the animal " + animal.type);
        animal.eat();
    }
    //non sa a chi da' da mangiare ma sa che è un animale generico e dentro a questo animale generico deve cercare il type

    //deve sapere il meno delle cose possibili altrui, non conosce l'animale
    public void talkWithAnimal(IAnimal animal){
        animal.talk();
    }

    public void giveWater(IAnimal animal){
        animal.drink();
    }

    public void makeAnimalFly(IAnimalWhoFlies animal){
        animal.fly();
    }

}
