package de.home.playgrounds.javabasics.lecture11_vererbung_basics;

import java.util.Objects;

public class Application {
    public static void main(String[] args) {

        System.out.println("stuff ohne vererbung:");
        PetWithoutVererbung p1 = new PetWithoutVererbung(PetType.CAT, "Mieze", 3);
        PetWithoutVererbung p2 = new PetWithoutVererbung(PetType.CHAMELEON, "Nosferatu", 2);
        p1.sayHello();
        p2.sayHello();

        p1.meow(3);
        p2.meow(5);

        p1.camouflage();
        p2.camouflage();

        System.out.println("+++++++++++++++++");
        System.out.println("Nun mit Vererbung");
        // RealPet realPet = new RealPet("a pet", 10); // Da nun abstrakte Klasse, kann keine Instanz mehr davon erzeugt werden, sondern nur noch von den konkreten Unterklassen
        // realPet.sayHello();

        Cat cat = new Cat("Mieze 2", 3, "dreieckig", "Strich");
        cat.sayHello();
        System.out.println(cat.getAge());
        cat.meow(4);

        Chameleon chameleon = new Chameleon("Nosferatu der Dritte", 2, true, 1.0);
        chameleon.sayHello();
        System.out.println(chameleon.getAge());
        chameleon.camouflage();
        chameleon.findWarmth();

        cat.sayAbstractHello();
        chameleon.sayAbstractHello();

        Dog dog = new Dog("Doggy", 27);
        dog.sayHello();
        dog.sayAbstractHello();
        Dog dog2 = new Dog("Doggy", 27);

        // equals an Objekten
        System.out.println(dog.equals(dog2)); // false, weil nicht identisch, weil kein custom equals, daher object identity
        // equals aus Objects utility class
        System.out.println(Objects.equals(dog, dog2));
    }
}
