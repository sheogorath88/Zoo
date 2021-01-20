package com.zoo.monkey;

import com.zoo.AnimalDetails;
import com.zoo.monkey.Monkey;

public class HomoErectus extends Monkey {

    public HomoErectus(AnimalDetails animalDetails, String eyeColour, double lengthOfTail) {
        super(animalDetails, eyeColour, lengthOfTail);
    }


    public void walk(){
        System.out.println("walk, walk, walk");
    }

    @Override
    public String giveVoice() {
        return "Mama, tata, Krzyś";
    }
}
