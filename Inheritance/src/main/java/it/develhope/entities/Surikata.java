package it.develhope.entities;

public class Surikata extends AbstractAnimal {

    @Override
    public void eat() {
        System.out.println("Do not know what to eat");
    }

    @Override
    public void talk() {
        System.out.println("Talk surikata");
    }

    @Override
    public void drink() {
        System.out.println("I am the Surikata and I'm drinking");

    }

}
