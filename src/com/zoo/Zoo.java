package com.zoo;

import com.zoo.monkey.HomoErectus;
import com.zoo.monkey.HomoSapiens;
import com.zoo.monkey.Monkey;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        Animal elephant = new Elephant(50,1,1,"Dumbo", 10);
        Animal parrot = new Parrot("white", "Ara", 30, 3);
        Animal monkey = new Monkey("green", 50, "George", 1, 5);
        Animal human = new HomoSapiens("brown",0,"Paweł",2,"dark", 18);
        animals.add(elephant);
        animals.add(parrot);
        animals.add(monkey);
        animals.add(human);


        for(int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i).giveVoice());
        }
        Animal homoErectus = new HomoSapiens("sd",3,"sa", 3,"da", 18);
        System.out.println(homoErectus.giveVoice());

    }

    private static void test() {
        Monkey george = new Monkey("green", 0.5, "George",1, 5);
        george.jump();
        String voice = george.giveVoice();
        System.out.println(voice);
//        System.out.println("Imię małpki to " + george.getName());
//        george.setName("Benek");
//        System.out.println("Nowe imię małpki to " + george.getName());

        Parrot ara = new Parrot("green", "Ara",30, 3);
        System.out.println(ara.fly());

//        Elephant adam = new Elephant(250,2,2,"Adam");
//        System.out.println(adam.getName());


        HomoErectus homoErectus = new HomoErectus("brown",0,"Ala",2, 20);
        System.out.println(homoErectus.giveVoice());
        homoErectus.jump();

        HomoSapiens homoSapiens = new HomoSapiens("green",0,"Paweł",2, "dark", 33);
        System.out.println(homoSapiens.giveVoice());
        homoSapiens.jump();
    }
}
