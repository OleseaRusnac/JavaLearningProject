package com.olesearusnac.zooclubservice;

public class Cat extends Animal implements AnimalInterface {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat " + getName() + " says: Hi!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating fish.");
    }
}