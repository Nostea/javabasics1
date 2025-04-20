package de.home.playgrounds.javabasics.lecture11_vererbung_basics;


public class Dog extends RealPet {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayAbstractHello() {
        System.out.println("Hello I dog.");
    }

    @Override
    public void sayHello() {
        System.out.println("Hihihiihihihihihi ich bin doggy hihihihih");
    }
}
