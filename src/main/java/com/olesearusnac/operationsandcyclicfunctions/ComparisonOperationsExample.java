package com.olesearusnac.operationsandcyclicfunctions;

public class ComparisonOperationsExample {
    public static void main(String[] args) {
        int a = 20;
        int b = 3;

        //Equal to
        boolean isEqual = a == b;
        System.out.println("\nEqual to: " + isEqual);

        //Different from
        boolean isNotEqual = a != b;
        System.out.println("Different from: " + isNotEqual);

        //Greater than
        boolean isGreaterThan = a > b;
        System.out.println("Greater than: " + isGreaterThan);

        //Less than
        boolean isLessThan = a < b;
        System.out.println("Less than: " + isLessThan);

        //Greater than or equal to
        boolean isGreaterThanOrEqual = a >= b;
        System.out.println("Greater than or equal to: " + isGreaterThanOrEqual);

        //Less than or equal to
        boolean isLessThanOrEqual = a <= b;
        System.out.println("Less than or equal to: " +isLessThanOrEqual);
    }
}
