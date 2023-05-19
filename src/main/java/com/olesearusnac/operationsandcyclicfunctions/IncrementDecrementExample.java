package com.olesearusnac.operationsandcyclicfunctions;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int a = 6;

        //Increment
        a++;
        System.out.println("\nValue after increment: " + a);

        //Prefixed increment
        ++a;
        int b = ++a;
        int a1 = a;
        int c = a++;
        System.out.println("Value after prefixed increment: " + a);
        System.out.println("Display b = " + b +  ", a1 = " + a1 + ", c = " + c + ", a2 = " +a);

        //Decrement
        a--;
        System.out.println("Value after decrement: " + a);

        //Prefixed decrement
        --a;
        System.out.println("Value after decrement: " + a);
    }
}
