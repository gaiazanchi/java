package it.develhope.accessibility.businessLogic;

import it.develhope.accessibility.entities.User;

public class SuperUserFromDifferentPackage extends User {
    //siamo in un pacchetto diverso ma stiamo estendendo User quindi
    //il protected che deve proteggere ma non troppo mi permette di
    //accedere mentre private no

    //mi serve per rendere estendbile la classe, pesco il costruttore pubblico
    public SuperUserFromDifferentPackage (String name, String surname, String type){
        super(name, surname, type);
    }

    public void doOtherStuff(){
        this.type = "ADMIN";
    }

    //Proprio solo di questa e non della classe madre, ho modificato visibilità con Override
    @Override
    public void doStuffProtected(){
        super.doStuffProtected();
    }

    //ben distinto da quello della classe madre
    private void auxiliaryUser(){

    }

    /*
    @Override
    public void auxiliaryMethod(){
    }
    non me lo legge perchè in origine è private
    */

}
