package it.develhope.overrideDefaultMethods;

import java.util.Objects;

public class Animal implements Cloneable {

    public String name;
    public String type;
    public AnimalLeg leftLeg = new AnimalLeg();
    public AnimalLeg rightLeg = new AnimalLeg();

    //per farmi accorgere se c'è qualche null
    @Override
    public String toString() {
        //return "Animal {" +
                //"name='" + name + '\'' +
                //", type='" + type + '\'' +
                //'}';
        //oppure
        return "Animal: " + type + " - " + name;
    }
    //dice cosa stampare in console quando faccio sout(animal)
    //con Animal animal = new Animal();


    //prende oggetto qualunque e restituisce booleano
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //se oggetto di input == oggetto che richiama metodo return true
        if (o == null || getClass() != o.getClass()) return false;
        //se la classe degli oggetti è diversa o o == null returna false
        //questi if sono i side effect
        Animal animal = (Animal) o;
        //casting, rendo l'oggetto o un animale
        return Objects.equals(this.name, animal.name) && Objects.equals(this.type, animal.type);
        //devono essere entrambi veri affinchè mi returni true
    }
    //implementazione la puoi modificare a tuo piacimento

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }
    //serve per mappe e insiemi per fare indicizzazioni e essere più veloci, genera un numero che rappresenta questo oggetto
    // se due elementi sono uguali in equals hanno lo stesso hash code, il viceversa non è vero
    //returna un intero

    //posso clonare a mano un Animal
    //returna Animal sennò non funziona, tanto tutte le classi implementano Object
    @Override
    public Animal clone() throws CloneNotSupportedException{
        Animal clonedAnimal = (Animal)super.clone();
        clonedAnimal.leftLeg = this.leftLeg.clone();
        clonedAnimal.rightLeg = this.rightLeg.clone();
        //Animal clonedAnimal = new Animal();
        //clonedAnimal.type = this.type;
        //clonedAnimal.name = this.name;
        return clonedAnimal;
    }
    //non molto top perchè se aggiungo variabili le devo aggiungere qua anche
    //se invece uso extends Clonable e poi il try catch in Start scrivo meno codice

}
