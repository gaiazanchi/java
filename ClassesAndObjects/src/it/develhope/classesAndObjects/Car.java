package it.develhope.classesAndObjects;

public class Car {
    public String model;
    //non lo inizializzo, non lo so, meglio che non ci siano piuttosto che averne in abbondanza e inutili
    public int wheelsNumber;
    public String color;
    //porte anteriori
    public Door frontDoorLeft;
    /*
    se le inizializzo qui (mettendo = new Door();), non ci sarà più null point reception ma errore perchè la classe inizia
    a diventare grossa, non mi interessano info, non serve instanziarle, le devo instanziare solo se so che mi servono
    */
    public Door frontDoorRight;
    //porte posteriori
    public Door rearDoorLeft;
    public Door rearDoorRight;
    public boolean isCabrio;
    public String print(){
        return model + " - " + wheelsNumber + " - " + color + " - " + isCabrio;
    }
}
