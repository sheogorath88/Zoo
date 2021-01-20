package com.zoo.monkey;

import com.zoo.AnimalDetails;

public class HomoSapiens extends HomoErectus {
    private String beard;


    public HomoSapiens(AnimalDetails animalDetails, String eyeColour, double lengthOfTail, String beard) {
        super(animalDetails, eyeColour, lengthOfTail);
        this.beard = beard;
    }

    public void think(){
        System.out.println("I am a thinking human");
    }

    @Override
    public String giveVoice() {
        return "I can say in complete sentences";
    }
}
