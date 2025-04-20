package de.home.playgrounds.javabasics.lecture11_vererbung_basics;

// Basisklasse für reale Vererbung
public abstract class RealPet {
    private String name;
    private int age;

    public RealPet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void sayHello() {
        System.out.println("Hello my name is " + name + " and i am " + age + " years old.");
    }

    public abstract void sayAbstractHello();
}
