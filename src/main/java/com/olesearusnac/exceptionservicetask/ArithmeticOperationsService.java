package com.olesearusnac.exceptionservicetask;

public class ArithmeticOperationsService {
    public static int devideIntExpectionHandling(int a, int b) {
        return a / b;
    }

    public static int devideIntExpectionHandlingWithTryCatchFinally(int a, int b) {
        try {
            int result = a / b;
            return result;
        } catch (ArithmeticException exceptionObject) {
            System.out.println("An exception has occurred: " + exceptionObject.getMessage());
            return 0;
        }
    }
}