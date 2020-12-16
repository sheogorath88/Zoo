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
    public String fly() {
        return "fru fru fru";
    }
    public String giveVoice(){
        return "ara ara";
    }
    public String getColour(){
        return this.colour;
    }
}
