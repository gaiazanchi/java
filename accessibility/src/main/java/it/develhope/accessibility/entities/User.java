package it.develhope.accessibility.entities;

public class User {
    //se ci tolgo il public non sono accessibili nel main perchè di default sono protected
    public String name;
    public String surname;
    protected String type;
    //bad practise lo capiremo con encapsulation

    //variabile che modifica comportamenti classe a seconda di come è settata, la metto privata
    private boolean isAdmin = false;

    private User() {}

    //se me lo devi istanziare fallo con i parametri, altrimenti fuori da qui non puoi
    //
    public User(String name, String surname, String type){
        this.name = name;
        this.surname = surname;
        this.type = type;
    }

    public void doStuff(){
        String hey; //implicitamente private, non metto modificatori mai dentro i metodi
        this.auxiliaryMethod();
        //lo richiamo senza esporlo al pubblico perchè magari mi serve solo dentro la mia classe
    }

    public void doStuff2(){
        this.auxiliaryMethod();
    }

    //lo posso vedere solamente dentro la mia classe
    private void auxiliaryMethod(){
        //do stuff
    }

    protected void doStuffProtected(){
        /*
        metodo ausiliario per cancellare / fare update dei dati dell'utente
        */
    }

    public String evaluateType() {
        if(this.type == null) return "No type";
        return this.type;
    }

    private class UserAuxiliarydata{
        public String photo;
        public String address;
    }



}
