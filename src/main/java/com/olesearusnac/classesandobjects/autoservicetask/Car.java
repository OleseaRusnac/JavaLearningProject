package com.olesearusnac.classesandobjects.autoservicetask;

public class Car {
    String licencePlate;
    String color;
    String transmissionSystem ;
    String make;

    public Car(String licencePlate, String make, String transmissionSystem){
        this.licencePlate = licencePlate;
        this.make = make;
        this.transmissionSystem = transmissionSystem;
        System.out.println ("\nA new object 'car' has been created.");
    }

    public Car(String color){
      this.color = color;
    }
}

