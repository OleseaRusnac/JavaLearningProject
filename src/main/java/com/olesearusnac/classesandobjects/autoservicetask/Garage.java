package com.olesearusnac.classesandobjects.autoservicetask;

public class Garage {
    String address;
    int phoneNumber;
    int carCapacity;
    String stateOfTheGarage;

public Garage(String address, int phoneNumber, int carCapacity) {
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.carCapacity = carCapacity;
    System.out.println ("A new object 'garage' has been created.");
}

    public Garage(String stateOfTheGarage){
        this.stateOfTheGarage = stateOfTheGarage;
    }
}









