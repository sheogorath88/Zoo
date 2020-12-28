package com.zoo;

public class Zoo {

    public static void main(String[] args) {

        Monkey george = new Monkey("green", 0.5, "George",1);
        george.jump();
        String voice = george.talk();
        System.out.println(voice);
        System.out.println("Imię małpki to " + george.getName());
        george.setName("Benek");
        System.out.println("Nowe imię małpki to " + george.getName());

        Parrot ara = new Parrot("green", "Ara",30);
        System.out.println(ara.fly());

        Elephant adam = new Elephant(250,2,2,"Adam");
        System.out.println(adam.getName());


        HomoErectus homoErectus = new HomoErectus("brown",0,"Ala",2);
        System.out.println(homoErectus.talk());
        homoErectus.jump();

        HomoSapiens homoSapiens = new HomoSapiens("green",0,"Paweł",2, "dark");
        System.out.println(homoSapiens.talk());
        homoSapiens.jump();
    }
}
