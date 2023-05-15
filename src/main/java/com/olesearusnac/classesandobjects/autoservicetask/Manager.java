package com.olesearusnac.classesandobjects.autoservicetask;

public class Manager {
    String name;
    int age;
    int yearsOfExperience;

    public Manager(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println ("A new object 'manager' has been created.");
    }
    public Manager(int yearsOfExperience){
        this.yearsOfExperience = yearsOfExperience;
        System.out.println ("A new object 'manager' has been created.");
    }
}

