package it.develhope.entities;

public abstract class AbstractAnimal implements IAnimal {
    //l'animale astratto dve rispettare questo contratto

    //anzichè ripetere questi nelle singole classi specifiche (evito duplicazione codice)
    //per questo esiste EXTENDS
    public String name;
    public String type;
    boolean hasFur;

    public abstract void eat();
    //se tolgo metodo eat da qua e lo metto nei singoli lo zookeeper non riuscirà ad accedervi

    @Override
    public void run() {

    }

}
