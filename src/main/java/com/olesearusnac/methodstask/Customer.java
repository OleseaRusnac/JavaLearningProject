package com.olesearusnac.methodstask;

public class Customer {
    private String name;
    private int age;
    private String emailAddress;

    public Customer(String name, int age, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;

        if ((age <= 1) || (age > 127)) {
            System.out.println("The age is invalid");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public void setAge(int newAge) {
        if ((newAge <= 1) || (newAge > 127)) {
            System.out.println("The age is invalid");
        } else {
            this.age = newAge;
        }
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    @Override
    public String toString(){
        return "Customer{" +
                "name=' " + name + '\'' +
                ", age" + age +
                ", email address=' " + emailAddress + '\'' +
                '}';
    }
}