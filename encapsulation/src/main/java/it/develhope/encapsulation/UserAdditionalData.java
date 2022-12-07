package it.develhope.encapsulation;

public class UserAdditionalData {

    //avendo spostato qui questi dati (prima erano in User) ho rotto il software
    //se uso encapsulation però tutto okay
    private String name;
    private String surname;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
