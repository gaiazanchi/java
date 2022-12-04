package it.develhope.entities;

public class Eagle extends AbstractAnimal implements IAnimal, IAnimalWhoFlies, IAnimalWhoEats{
    //la posso implementare nei diversi modi, a seconda del pezzo di codice che giro la posso trattare in modi diversi

    @Override
    public void eat() {

    }

    @Override
    public void talk() {

    }

    @Override
    public void run() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void fly() {
        System.out.println("Eagle - I'm flying");
    }

}
