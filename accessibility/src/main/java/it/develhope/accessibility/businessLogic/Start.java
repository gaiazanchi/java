package it.develhope.accessibility.businessLogic;

import it.develhope.accessibility.entities.User;
import it.develhope.accessibility.utility.UserUtility;

public class Start {
    public static void main(String[] args) {

        Start myClass = new Start();

        //lo posso fare se il metodo costruttore è pubblico, se è privato mi da' errore
        User user = new User("", "", "");

        user.name = "Lucia";
        user.surname = "Tomaselli";
        user.doStuff();
        //user.type; non esiste, protected agisce a livello di package

        //user.isAdmin = true; non si può fare

        String completeName = UserUtility.getCompleteName(user);
        String type = new UserUtility().getType(user);

    }
}
