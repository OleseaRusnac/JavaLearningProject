package com.olesearusnac.operationsandcyclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        System.out.println();
        int a = 200;
        int limit = 200;
        while (a > 0) {
            System.out.print(a + ", ");
            a = a - 1;
            a -= 1;
            a--;
        }

        //The value of 'a' after being out of while cycle is 0

        System.out.println();
        System.out.println();

        do {
            System.out.print(a + ", ");
            a = a + 1;
            a++;
        } while (a < limit);

        System.out.println();
        System.out.println();

        for (int i = 1; i <= limit; i++) {
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= limit; i++) {
            if ((i % 2) == 0) {
                System.out.print(i + ", ");
            } else {
                System.out.print("[], ");
            }
        }
    }
}
