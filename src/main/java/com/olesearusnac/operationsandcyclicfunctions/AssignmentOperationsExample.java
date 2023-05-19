package com.olesearusnac.operationsandcyclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        //Simple assignment
        int result = a;
        System.out.println("\nSimple assignment: " + result);

        //Assignment with sum
        result += b;
        System.out.println("Assignment with sum: " + result);

        //Assignment with subtraction
        result -= b;
        System.out.println("Assignment with subtraction: " + result);

        //Assignment with multiplication
        result *= b;
        System.out.println("Assignment with multiplication: " + result);

        //Assignment with division
        result /= b;
        System.out.println("Assignment with division: " + result);

        //Assignment with Division with reminder;
        result %= b;
        System.out.println("Assignment with Division with reminder: " + result);
    }
}
