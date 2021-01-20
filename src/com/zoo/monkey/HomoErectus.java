package com.zoo.monkey;

import com.zoo.monkey.Monkey;

public class HomoErectus extends Monkey {

    public HomoErectus(String newEyeColour, double newLengthOfTail, String newName, int newHeight) {
        super(newEyeColour, newLengthOfTail, newName, newHeight);
    }
    public void walk(){
        System.out.println("walk, walk, walk");
    }

    @Override
    public String giveVoice() {
        return "Mama, tata, Krzyś";
    }
}
