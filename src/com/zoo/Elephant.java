package com.zoo;

public class Elephant {
    private int mass;
    private int bodyLength;
    private int height;
    private String name;

    public Elephant(int newMass, int newBodyLength, int newHeight, String newName){
        this.mass = newMass;
        this.bodyLength = newBodyLength;
        this.height = newHeight;
        this.name = newName;
    }
    public String eat(){
        return "mniam mniam mniam";
    }
    public String makeSound(){
        return "tru-turu-tu";
    }
//    gettery
    public int getBodyLength(){
        return this.bodyLength;
    }
    public int getMass(){
        return this.mass;
    }
    public int getHeight(){
        return this.height;
    }
    public String getName(){
        return this.name;
    }
//settery
    public void setMass(int newMass){
        this.mass = newMass;
    }
    public void setBodyLength(int newBodyLength){
        this.bodyLength = newBodyLength;
    }
    public void setHeight(int newHeight){
        this.height = newHeight;
    }
    public void setName(String newName){
        this.name = newName;
    }
}
