package com.zoo;

public class Elephant extends Animal {
    private int mass;
    private int bodyLength;


    public Elephant(AnimalDetails animalDetails, int mass, int bodyLength) {
        super(animalDetails);
        this.mass = mass;
        this.bodyLength = bodyLength;
    }

    public String eat() {
        return "mniam mniam mniam";
    }

    @Override
    public String giveVoice() {
        return "tru-turu-tu";
    }
}