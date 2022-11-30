package it.develhope.classesAndObjects;

public class Preferences {
    private static Preferences preferences = new Preferences();
    //ci posso accedere solo dentro a questa classe
    //ho creato un oggetto preferences

    public int maxPlacesInGarage = 100;
    public String garageName = "My garage";

    private Preferences(){}
    //evita nuove istanze di Preferences, questa classe può essere istanziata solo dentro sè stessa

    public static Preferences getInstance(){
        return preferences;
    }
}
