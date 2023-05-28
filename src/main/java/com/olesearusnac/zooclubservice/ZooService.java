package com.olesearusnac.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        System.out.println();
        Animal dog = new Dog("Rex");
        Cat cat = new Cat("Brownie");
        Cat secondCat = new Cat("Cookie");

        dog.eat();
        cat.eat();
        cat.makeSound();
    }
}