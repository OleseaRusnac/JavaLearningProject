package com.olesearusnac.operationsandcyclicfunctions;

public class LogicalOperationsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        //And logic
        boolean andResult = a && b;
        System.out.println("\nAnd logic: " + andResult);

        //Or login
        boolean orResult = a || b;
        System.out.println("Or logic: " + orResult);

        //Negation
        boolean notResult = !a;
        System.out.println("Negation of expression: " + notResult);
    }
}
