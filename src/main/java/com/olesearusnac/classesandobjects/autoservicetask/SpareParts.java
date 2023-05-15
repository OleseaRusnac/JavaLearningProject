package com.olesearusnac.classesandobjects.autoservicetask;

public class SpareParts {
    String stateOfSpareParts;
    boolean areOriginal;

    public SpareParts(String stateOfSpareParts, boolean areOriginal) {
        this.stateOfSpareParts = stateOfSpareParts;
        this.areOriginal = areOriginal;
        System.out.println("A new object 'spare parts' has been created. Known details about the spare parts: state of spare parts, are original or not.");
    }
}
