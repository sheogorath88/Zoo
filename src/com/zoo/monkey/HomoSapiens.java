package com.zoo.monkey;

public class HomoSapiens extends HomoErectus {
    private String beard;
    public HomoSapiens(String newEyeColour, double newLengthOfTail, String newName, int newHeight, String newBeard, int newAge) {
        super(newEyeColour, newLengthOfTail, newName, newHeight, newAge);
        this.beard = newBeard;
    }
    public void think(){
        System.out.println("I am a thinking human");
    }

    @Override
    public String giveVoice() {
        return "I can say in complete sentences";
    }
}
