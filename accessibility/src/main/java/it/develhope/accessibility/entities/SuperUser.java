package it.develhope.accessibility.entities;

public class SuperUser extends User{

    //Costruttore che richiama il costruttore della madre
    public SuperUser(String name, String surname, String type){
        super(name, surname, type);
    }

    public void doStuffForSuperUser(){
        // this.type; qui ci posso accedere
    }

}
