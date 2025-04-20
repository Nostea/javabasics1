package de.home.playgrounds.javabasics.lecture11_vererbung_basics;

public class PetWithoutVererbung {
    private PetType type;
    private String name;
    private int age;

    public PetWithoutVererbung(PetType type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public PetType getType() {
        return type;
    }

    public void sayHello() {
        System.out.println("Hello I am a " + type.name() + ". My name is " + name + " and i am " + age + " years old.");
    }

    public void meow(int count) {
        if (type == PetType.CAT) {
            for (int i = 0; i < count; i++) {
                System.out.println("Meow");
            }
        } else {
            System.out.println("I am not a cat, i cant meow D:");
        }
    }

    public void camouflage() {
        if (type == PetType.CHAMELEON) {
            System.out.println("Now you see me, now you dont");
        } else {
            System.out.println("Now you see me, now you..... oh wait D: ");
        }
    }
}
