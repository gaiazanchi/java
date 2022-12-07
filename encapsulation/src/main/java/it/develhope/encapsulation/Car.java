package it.develhope.encapsulation;

import lombok.*;

@Data
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Car {

    private double power;
    private int doors;
    private double weight;
    private CarConsumption carConsumption = new CarConsumption();

    public void setDoors(int doors){
        if(this.doors > 5) return;
        this.doors = doors;
    }

    public Car(double power, int doors, double weight, double consumption){
        this(power, doors, weight, new CarConsumption());
        this.carConsumption.setFuel(consumption);
    }

    public double getConsumption(){
        return this.carConsumption.getFuel();
    }

    public void setConsumption(double consumption){
        this.carConsumption.setFuel(consumption);
    }

}
