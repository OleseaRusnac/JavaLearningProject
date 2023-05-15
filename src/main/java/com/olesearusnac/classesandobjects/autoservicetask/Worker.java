package com.olesearusnac.classesandobjects.autoservicetask;

public class Worker {
    String name;
    int age;
    int salary;
    int yearsOfExperience;

    public Worker (String name, int age, int yearsOfExperience){
        this.name = name;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
        System.out.println ("A new object 'worker' has been created.");
    }

    public Worker(int salary){
        this.salary=salary;
    }
}
