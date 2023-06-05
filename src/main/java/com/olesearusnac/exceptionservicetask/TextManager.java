package com.olesearusnac.exceptionservicetask;

public class TextManager {
    public static int getTheTextLength(String inputString) {
        return inputString.length();
    }

    public static int getTheTextLengthWithTryCatchFinally(String inputString) {

        try {
            return inputString.length();
        } catch (
                NullPointerException capturedExpectionInTryBlock) {
            System.out.println("An exception has been noticed with the following message: "
                    + capturedExpectionInTryBlock.getMessage());
            return 0;
        } finally {
            System.out.println("The block is executed without problems.");
        }
    }

    public static int getTheTextLengthIfElse(String inputString) {
        if (inputString == null) {
            System.out.println("Warning! The input string is a null value!");
            return 0;
        } else {
            return inputString.length();
        }
    }
}