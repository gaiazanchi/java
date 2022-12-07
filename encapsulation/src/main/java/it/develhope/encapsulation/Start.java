package it.develhope.encapsulation;

public class Start {

    public static void main(String[] args) {

        User u = new User();
        u.setId("123456");
        u.setEmail("123@gmail.com");
        u.setPassword("dhbwui-hdbdhb-hdbhb");
        u.setAddress("Via delle Palme, 15");
        u.setName("Lorenzo");
        u.setSurname("Zanchi");

        System.out.println(u);

        Car car = new Car(12.0, 12, 12.0, 12.0);
        //non ha peperoncino, non presa dalla libreria, è quella che ho fatto io
        car.setDoors(15);

    }

}
