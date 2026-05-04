package de.home.playgrounds.javabasics.exercise25_inheritance;

public class Car extends Vehicle {
    private int doorAmount;


    public Car(String brand, int speed, int doorAmount) {
        super(brand, speed);
        this.doorAmount = doorAmount;
    }

    @Override
    public void describeVehicle(){
        System.out.println("Brand: " + getBrand() + "   Speed: " + getSpeed() + " kmh/h");
    }

}
