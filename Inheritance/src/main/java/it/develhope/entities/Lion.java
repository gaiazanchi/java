package it.develhope.entities;

public class Lion extends AbstractAnimal {

    public Lion (){
        this.type = "Lion";
    }

    @Override
    public void eat() {
        //super.eat(); se lo tolgo questo sovrascrive la madre senza riprendere quello che fa lei
        System.out.println("I am eating meat");
    }

    @Override
    public void talk() {
        System.out.println("Talk Lion");
    }

    @Override
    public void drink() {
        System.out.println("Drink Lion");
    }
}
