package com.zoo;

public class Animal {
    private String name;
    private int height;

    public Animal(String name, int height) {
        this.name = name;
        this.height = height;
    }
    public String giveVoice(){
        return "grrrrrr";
    }
}
