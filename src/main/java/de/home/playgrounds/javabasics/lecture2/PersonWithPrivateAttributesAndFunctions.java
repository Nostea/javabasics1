package de.home.playgrounds.javabasics.lecture2;

public class PersonWithPrivateAttributesAndFunctions {
    private String hairColor;
    private int age;
    private String name;

    private static int personCounter = 0;


    public PersonWithPrivateAttributesAndFunctions(String hairColor, int age, String name) {
        this.hairColor = hairColor;
        this.age = age;
        this.name = name;
        PersonWithPrivateAttributesAndFunctions.personCounter++;
    }

    public static int getPersonCounter() {
        return PersonWithPrivateAttributesAndFunctions.personCounter;
    }

    public void dyeHair(String newHairColor) {
        this.hairColor = newHairColor;
    }

    public String getHairColor() {
        return this.hairColor;
    }

    public String getName() {
        return this.name;
    }
}
