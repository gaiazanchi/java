package it.develhope.entities;

public class Giraffe extends AbstractAnimal {

    public Giraffe (){
        this.type = "Giraffe";
    }

    @Override
    public void eat() {
        //super.eat(); se lo tolgo questo sovrascrive la madre senza riprendere quello che fa lei
        System.out.println("I am eating leaf");
    }

    @Override
    public void talk() {
        System.out.println("Talk Giraffe");
    }

    @Override
    public void drink() {
        System.out.println("Drink Giraffe");
    }
}
