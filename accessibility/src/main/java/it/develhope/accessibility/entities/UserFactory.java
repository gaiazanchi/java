package it.develhope.accessibility.entities;

public class UserFactory {
    public void createUser(){
        User user = new User("", "", "");

        //posso accedervi perchè siamo nello stesso package
        user.type = "ADMIN";

    }
}
