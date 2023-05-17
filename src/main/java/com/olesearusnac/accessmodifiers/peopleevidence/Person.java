package com.olesearusnac.accessmodifiers.peopleevidence;

public class Person {
    private String firstName;
    private String lastName;
    public int age;
    private int ID;
    public String sex;
    public boolean isMarried;
    public boolean isRetired;
    public boolean hasChildren;
    public String occupation;
    protected String address;
    protected String phone;

    public Person(String firstName, String lastName, int age, int ID, String sex, boolean isMarried, boolean isRetired,
                  boolean hasChildren, String occupation, String address, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ID = ID;
        this.sex = sex;
        this.isMarried = isMarried;
        this.isRetired = isRetired;
        this.hasChildren = hasChildren;
        this.occupation = occupation;
        this.address = address;
        this.phone = phone;
        System.out.println("\nAn object of Person type has been created, using a constructor with 11 formal parameters.");
    }

    public Person(String firstName, String lastName, int ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        System.out.println("\nAn object of Person type has been created, using a constructor with 3 formal parameters.");
    }
}
