package com.zoo;

import com.zoo.monkey.HomoErectus;
import com.zoo.monkey.HomoSapiens;
import com.zoo.monkey.Monkey;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        Animal elephant = new Elephant(new AnimalDetails("Dumbo", 2, 10), 200, 3);
        Animal parrot = new Parrot(new AnimalDetails("Ara", 1, 3), "blue");
        Animal monkey = new Monkey(new AnimalDetails("George", 1, 4), "brown", 0.5);
        Animal human = new HomoSapiens(new AnimalDetails("Paweł", 2, 29), "green", 0, "dark");
        animals.add(elephant);
        animals.add(parrot);
        animals.add(monkey);
        animals.add(human);


        for(int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i).giveVoice());
        }
        Animal homoErectus = new HomoSapiens(new AnimalDetails("Kasia", 1, 23), "blue", 0, "null");
        System.out.println(homoErectus.giveVoice());

    }

    private static void test() {
        Monkey george = new Monkey(new AnimalDetails("Pinkie", 1, 3), "brown", 1);
        george.jump();
        String voice = george.giveVoice();
        System.out.println(voice);
//        System.out.println("Imię małpki to " + george.getName());
//        george.setName("Benek");
//        System.out.println("Nowe imię małpki to " + george.getName());

        Parrot ara = new Parrot(new AnimalDetails("Kara", 1, 5), "multicolour");
        System.out.println(ara.fly());

//        Elephant adam = new Elephant(250,2,2,"Adam");
//        System.out.println(adam.getName());


        HomoErectus homoErectus = new HomoErectus(new AnimalDetails("Bubu", 1, 23), "blue", 0.5);
        System.out.println(homoErectus.giveVoice());
        homoErectus.jump();

        HomoSapiens homoSapiens = new HomoSapiens(new AnimalDetails("Alma", 2, 30), "black", 0, "null");
        System.out.println(homoSapiens.giveVoice());
        homoSapiens.jump();
    }
}
