package com.zoo;

public class Parrot extends Animal{
    private String colour;

    public Parrot(String newColour, String newName, int newHeight, int newAge){
        super(newName, newHeight, newAge);
        this.colour = newColour;
    }
//    metody
    public String fly() {
        return "fru fru fru";
    }
    @Override
    public String giveVoice(){
        return "ara ara";
    }
//    gettery
    public String getColour(){
        return this.colour;
    }

//    settery
    public void setColour(String newColour){
        this.colour = newColour;
    }

}
