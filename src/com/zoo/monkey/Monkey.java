package com.zoo.monkey;

import com.zoo.Animal;

//klasa
public class Monkey extends Animal {
    private String eyeColour;
    private double lengthOfTail;

    //konstruktor
    public Monkey(String newEyeColour, double newLengthOfTail, String newName, int newHeight) {
        super(newName, newHeight);
        this.eyeColour = newEyeColour;
        this.lengthOfTail = newLengthOfTail;
    }
    //metody
    public void jump() {
        System.out.println("Hop hop hop");
    }

    @Override
    public String giveVoice() {
        return "uhuhuhuu";
    }

    //gettery

    public double getLengthOfTail() {
        return this.lengthOfTail;
    }

    public String getEyeColour() {
        return this.eyeColour;
    }


    // settery

    public void setEyeColour(String newEyeColour) {
        this.eyeColour = newEyeColour;
    }

    public void setLengthOfTail(double newLengthOfTail) {
        this.lengthOfTail = newLengthOfTail;
    }

}
