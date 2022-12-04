package it.develhope.entities;

public class Penguin extends AbstractAnimal {

    public Penguin (){
        this.type = "Penguin";
    }

    @Override
    public void eat() {
        //super.eat(); se lo tolgo questo sovrascrive la madre senza riprendere quello che fa lei
        System.out.println("I am eating fish");
    }

    @Override
    public void talk() {
        System.out.println("Talk Penguin");
    }

    @Override
    public void drink() {
        System.out.println("Drink Penguin");
    }
}
