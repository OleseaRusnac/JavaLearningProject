package com.olesearusnac.operationsandcyclicfunctions;

public class DayOfTheWeeksService {
    public static void main(String[] args) {
        int dayNumber;
        String dayName = "Monday";

        String dayName2 = new String("Sunday");
        String dayName2UpperCase = dayName2.toUpperCase();

        System.out.println();
        System.out.println(dayName.toUpperCase());
        System.out.println("Lungimea string-ului dayName2 este " + dayName2.length());
        switch (dayName2UpperCase){
            case "MONDAY":
                dayNumber = 1;
                break;
            case "TUESDAY":
                dayNumber = 2;
                break;
            case "WEDNESDAY":
                dayNumber = 3;
                break;
            case "THURSDAY":
                dayNumber = 4;
                break;
            case "FRIDAY":
                dayNumber = 5;
                break;
            default:
                dayNumber = 0;
                System.out.println("There is displayed a day that has not been defined");
        }
        System.out.println("The day number " + dayName + " is " + dayNumber);
    }
}
