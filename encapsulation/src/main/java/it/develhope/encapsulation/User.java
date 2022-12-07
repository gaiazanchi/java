package it.develhope.encapsulation;

public class User {

    private String id;
    private String email;
    //se lo elimini non cambia nulla sistemo qua dentro quello che non va mettendo null o insieme vuoto
    private String password;
    private UserAdditionalData useradditionalData = new UserAdditionalData();

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + getId() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }
    //qui non mi servono i getter e setter, sono dentro la classe quindi le vedo le mie variabili

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return useradditionalData.getName();
    }

    public void setName(String name) {
        useradditionalData.setName(name);
    }

    public String getSurname() {
        return useradditionalData.getSurname();
    }

    public void setSurname(String surname) {
        useradditionalData.setSurname(surname);
    }

    public String getAddress() {
        return useradditionalData.getAddress();
    }

    public void setAddress(String address) {
        useradditionalData.setAddress(address);
    }
}
