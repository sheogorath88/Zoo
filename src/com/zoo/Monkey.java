package com.zoo;

public class Monkey {
    private String eyeColour;
    private double lengthOfTail;
    private String name;
    private int height;

    public Monkey(String newEyeColour, double newLengthOfTail, String newName, int newHeight){
        this.eyeColour = newEyeColour;
        this.lengthOfTail = newLengthOfTail;
        this.name = newName;
        this.height = newHeight;
    }

    public void jump(){
        System.out.println("Hop hop hop");
    }
    public String uhuhu(){
       return "uhuhuhuu";
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
}
