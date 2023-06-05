package com.olesearusnac.exceptionservicetask;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int result2 = ArithmeticOperationsService.devideIntExpectionHandling(10, 0);
        System.out.println(result2);
        System.out.println("The program is running till the end");

        String stringValue = "Rick";
        String stringValue2 = null;

        System.out.println(TextManager.getTheTextLengthWithTryCatchFinally(stringValue2));
        System.out.println(TextManager.getTheTextLength(stringValue));
        System.out.println(TextManager.getTheTextLengthIfElse(stringValue2));

        String filePath = "src/main/java/com/olesearusnac/expectionservicetask/test.txt";
        try {
            ReadDataManager.readDataFromFileWithoutTryAndCatch(filePath);
        } catch (IOException exceptionObject) {
            System.out.println("The file doesn't exist, the execution of the program is not interrupted");
        } finally {
            System.out.println("The block is executed");
        }
        System.out.println("The program is running");
        ReadDataManager.readDataFromFileWithTryAndCatch(filePath);
        System.out.println("The program is running");
    }
}