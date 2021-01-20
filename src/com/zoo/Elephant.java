package com.zoo;

public class Elephant extends Animal{
    private int mass;
    private int bodyLength;


    public Elephant(int newMass, int newBodyLength, int newHeight, String newName, int newAge){
        super(newName, newHeight, newAge);
        this.mass = newMass;
        this.bodyLength = newBodyLength;
    }
    public String eat(){
        return "mniam mniam mniam";
    }
    @Override
    public String giveVoice(){
        return "tru-turu-tu";
    }
//    gettery
    public int getBodyLength(){
        return this.bodyLength;
    }
    public int getMass(){
        return this.mass;
    }

//settery
    public void setMass(int newMass){
        this.mass = newMass;
    }
    public void setBodyLength(int newBodyLength){
        this.bodyLength = newBodyLength;
    }

}
