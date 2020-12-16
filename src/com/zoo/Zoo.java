package com.zoo;

public class Zoo {

    public static void main(String[] args) {

        Monkey george = new Monkey("green", 0.5, "George",1);
        george.jump();
        String voice = george.uhuhu();
        System.out.println(voice);
        System.out.println("Imię małpki to " + george.getName());
        george.setName("Benek");
        System.out.println("Nowe imię małpki to " + george.getName());
    }
}
