package com.zoo;

public class Parrot {
    private String colour;
    private String name;
    private int height;

    public Parrot(String newColour, String newName, int newHeight){
        this.colour = newColour;
        this.name = newName;
        this.height = newHeight;
    }
//    metody
    public String fly() {
        return "fru fru fru";
    }
    public String giveVoice(){
        return "ara ara";
    }
//    gettery
    public String getColour(){
        return this.colour;
    }
    public String getName(){
        return this.name;
    }
    public int getHeight(){
        return this.height;
    }
//    settery
    public void setColour(String newColour){
        this.colour = newColour;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setHeight(int newHeight){
        this.height = newHeight;
    }
}
