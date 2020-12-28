package com.zoo;

//klasa
public class Monkey {
    private String eyeColour;
    private double lengthOfTail;
    private String name;
    private int height;

    //konstruktor
    public Monkey(String newEyeColour, double newLengthOfTail, String newName, int newHeight) {
        this.eyeColour = newEyeColour;
        this.lengthOfTail = newLengthOfTail;
        this.name = newName;
        this.height = newHeight;
    }

    //metody
    public void jump() {
        System.out.println("Hop hop hop");
    }

    public String talk() {
        return "uhuhuhuu";
    }

    //gettery
    public String getName() {
        return this.name;
    }

    public double getLengthOfTail() {
        return this.lengthOfTail;
    }

    public String getEyeColour() {
        return this.eyeColour;
    }

    public int getHeight() {
        return this.height;
    }

    // settery
    public void setName(String newName) {
        this.name = newName;
    }

    public void setEyeColour(String newEyeColour) {
        this.eyeColour = newEyeColour;
    }

    public void setLengthOfTail(double newLengthOfTail) {
        this.lengthOfTail = newLengthOfTail;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }
}
