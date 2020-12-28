package com.zoo;

public class HomoSapiens extends HomoErectus{
    String beard;
    public HomoSapiens(String newEyeColour, double newLengthOfTail, String newName, int newHeight, String newBeard) {
        super(newEyeColour, newLengthOfTail, newName, newHeight);
        this.beard = newBeard;
    }
    public void think(){
        System.out.println("I am a thinking human");
    }

    @Override
    public String talk() {
        return "I can say in complete sentences";
    }
}
