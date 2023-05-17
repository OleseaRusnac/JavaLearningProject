package com.olesearusnac.accessmodifiers;

import com.olesearusnac.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {

        Person mihaiPerson = new Person("Mihai", "Cerga", 1234567890);
        mihaiPerson.isRetired = false;
        if (mihaiPerson.isRetired) {
            System.out.println("Mihai is retired.");
        } else {
            System.out.println("Mihai is an employee.");
        }


        Person alinaPerson = new Person("Alina", "Lungu", 30, 1234567809, "female",
                true, false, true, "fitness trainer", "Vasile Lupu 2",
                "373123456");
        alinaPerson.isRetired = false;
        if (alinaPerson.isRetired) {
            System.out.println("Alina is retired.");
        } else {
            System.out.println("Alina is still working.");
        }


        Person mariaPerson = new Person("Maria", "Rosca", 68, 1234565789, "female",
                true, true, true, "teacher", "Dimitrie Cantemir 4",
                "37387946454");
        mariaPerson.isRetired = true;
        if (mariaPerson.isRetired) {
            System.out.println("Maria is retired.");
        } else {
            System.out.println("Maria is an employee.");
        }


        Person ionPerson = new Person("Ion", "Viteazu", 21, 123458760, "male",
                false, false, false, "med student", "31 august 6",
                "373785866965");
        if (ionPerson.isRetired) {
            System.out.println("Ion is retired.");
        } else {
            System.out.println("Ion is a student.");
        }


        Person mariusPerson = new Person("Marius", "Ceban", 70, 567824567, "male",
                true, true, true, "merchant", "Veronica Micle 3",
                "373872524153");
        mariusPerson.isRetired = true;
        if (mariusPerson.isRetired) {
            System.out.println("Marius is retired.");
        } else {
            System.out.println("Marius is still working.");
        }
    }
}
