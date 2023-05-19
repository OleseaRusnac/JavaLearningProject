package com.olesearusnac.operationsandcyclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {
        int testResult = 70;

        System.out.println();
        if (testResult >= 60) {
            System.out.println("Mark A");
        } else if (testResult >= 55) {
            System.out.println("Mark B");
        } else if (testResult >= 50) {
            System.out.println("Mark C");
        } else if (testResult >= 45) {
            System.out.println("Mark D");
        } else {
            System.out.println("Such a mark is not defined");
        }
        System.out.println("The program is done");
    }
}
