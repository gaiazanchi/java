package it.develhope.classesAndObjects;

public class Car {
    public String model;
    public int wheelsNumber;
    public String color;
    public boolean isCabrio;
    public String print(){
        return model + " - " + wheelsNumber + " - " + color + " - " + isCabrio;
    }
}
