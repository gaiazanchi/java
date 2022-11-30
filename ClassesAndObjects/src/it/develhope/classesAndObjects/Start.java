package it.develhope.classesAndObjects;

public class Start {
    public static void main(String args[]){
        System.out.println("Start - main");
        Car Mini = new Car();
        Mini.color = "white";
        Mini.model = "Mini Cooper D";
        Mini.isCabrio = false;
        Mini.wheelsNumber = 4;

        Car Audi = new Car();
        Audi.color = "black";
        Audi.model = "A3";
        Audi.isCabrio = true;
        Audi.wheelsNumber = 4;

        System.out.println(Mini.print());
        System.out.println(Audi.print());

        //System.out.println("Mini" + " - " + Mini.color + " - " + Mini.model + " - " + Mini.isCabrio + " - " + Mini.wheelsNumber);
        //System.out.println("Audi" + " - " + Audi.color + " - " + Audi.model + " - " + Audi.isCabrio + " - " + Audi.wheelsNumber);

        //System.out.println("------------------");

        Audi.model = "A6";
        //System.out.println("Audi" + " - " + Audi.color + " - " + Audi.model + " - " + Audi.isCabrio + " - " + Audi.wheelsNumber);

    }
}
