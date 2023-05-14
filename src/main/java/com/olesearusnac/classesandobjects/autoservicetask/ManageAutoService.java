package com.olesearusnac.classesandobjects.autoservicetask;

import java.awt.*;

public class ManageAutoService {
    public static void main(String[] args) {
        //Declaration and initialization of the objects using all types of defined constructors

        //Object of the 'car' type
        Car toyotaPrius = new Car("ABC 123", "Toyota Prius", "manual");
        toyotaPrius.color = "black";
        System.out.println("The make of the car is " + toyotaPrius.make + " with the licence plate: "
                + toyotaPrius.licencePlate + ", and its color is "
                + toyotaPrius.color + ". The transmission system of the car is "
                + toyotaPrius.transmissionSystem + ".\n");


        //Object of the 'garage' type
        Garage newGarage = new Garage ("Happiness 34", 12345678, 200);
        newGarage.stateOfTheGarage = "new";
        System.out.println("The address of the garage is " + newGarage.address + ". The phone number is "
                + newGarage.phoneNumber + ", and the vehicle capacity of the garage is: "
                + newGarage.carCapacity + ". This garage is " + newGarage.stateOfTheGarage+ ".\n");

        //Object of the 'manager' type
        Manager firstManager = new Manager ("Mark Snow", 37);
        firstManager.yearsOfExperience = 10;
        System.out.println("The manager's name is " + firstManager.name + ", and he is "
                + firstManager.age + " and has an experience of " + firstManager.yearsOfExperience + " years.\n");

        //Object of the 'worker' type
        Worker firstWorker = new Worker ("John Summer", 30, 5);
        firstWorker.salary = 1500;
        System.out.println("People know that the worker's name is " + firstWorker.name + ". He is "
                + firstWorker.age + ", and he is working at the garage for already "
                + firstWorker.yearsOfExperience + " years. His salary is about " + firstWorker.salary + " euros.\n");

        //Object of the 'spare parts' type
        SpareParts all = new SpareParts("new", true);
        System.out.println("The spare parts which are used at the garage are "
                + all.stateOfSpareParts + " and they are original.\n");

        //Object of the 'tool' type
        Tool screwDriver = new Tool("screwdriver", "new");
        screwDriver.price = 10;
        screwDriver.powerMode = "manual";
        System.out.println("The tool " + screwDriver.name + " which is used in the garage is "
                + screwDriver.stateOfTool + ". Its power mode is the "
                + screwDriver.powerMode + " one and its price is " + screwDriver.price + " euros.\n");
    }

}
