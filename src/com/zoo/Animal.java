package com.zoo;

public abstract class Animal {

    private AnimalDetails animalDetails;

    public Animal(AnimalDetails animalDetails) {
        this.animalDetails = animalDetails;
    }


    public abstract String giveVoice();
}
