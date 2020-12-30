package com.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {

//
        List<Animal> animals = new ArrayList<>();
        Elephant elephant = new Elephant(50,1,1,"Dumbo");
        Parrot parrot = new Parrot("white", "Ara", 30);
        Monkey monkey = new Monkey("green", 50, "George", 1);
        animals.add(elephant);
        animals.add(parrot);
        animals.add(monkey);
        for(int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i).giveVoice());
        }
    }

    private static void test() {
        Monkey george = new Monkey("green", 0.5, "George",1);
        george.jump();
        String voice = george.giveVoice();
        System.out.println(voice);
//        System.out.println("Imię małpki to " + george.getName());
//        george.setName("Benek");
//        System.out.println("Nowe imię małpki to " + george.getName());

        Parrot ara = new Parrot("green", "Ara",30);
        System.out.println(ara.fly());

//        Elephant adam = new Elephant(250,2,2,"Adam");
//        System.out.println(adam.getName());


        HomoErectus homoErectus = new HomoErectus("brown",0,"Ala",2);
        System.out.println(homoErectus.giveVoice());
        homoErectus.jump();

        HomoSapiens homoSapiens = new HomoSapiens("green",0,"Paweł",2, "dark");
        System.out.println(homoSapiens.giveVoice());
        homoSapiens.jump();
    }
}
