package com.zoo;

public abstract class Animal {

    private AnimalDetails animalDetails;

    public Animal (String newName, int newHeight, int newAge){
        AnimalDetails animalDetails = new AnimalDetails(newName, newHeight, newAge);
        this.animalDetails = animalDetails;

    }

    public abstract String giveVoice();
}
