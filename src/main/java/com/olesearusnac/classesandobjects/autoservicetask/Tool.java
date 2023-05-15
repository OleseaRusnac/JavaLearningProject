package com.olesearusnac.classesandobjects.autoservicetask;

public class Tool {
    String name;
    String stateOfTool;
    int price;
    String powerMode;

    public Tool(String name, String stateOfTool){
        this.name = name;
        this.stateOfTool = stateOfTool;
        System.out.println ("A new object 'tool' has been created.");
    }

    public Tool(int price, String powerMode){
        this.price = price;
        this.powerMode = powerMode;
    }
}
