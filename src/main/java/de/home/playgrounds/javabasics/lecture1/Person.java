package de.home.playgrounds.javabasics.lecture1;

public class Person {
    // Eine Klasse besteht aus:
    // Konstruktoren: Eine spezielle "Funktion" zum Erzeugen von Objektinstanzen mit was auch immer im Konstruktor definiert ist
    //                Jede Klasse bringt einen nicht sichtbaren Default-Konstruktor mit, damit man Instanzen erzeugen kann
    // "Definition" von Eigenschaften/Attributen
    public int age; // Eigenschaft age
    public String firstName; // Eigenschaft firstName
    public boolean isHungry; // Eigenschaft isHungry

    // "Definition" von Objekt-Verhalten Ã¼ber Funktionen/Methoden
    public void eat() {
        if (!isHungry) {
            System.out.println("I dont wanna eat anymore, Mr. Stark!");
        } else {
            System.out.println("I am eating now...");
            isHungry = false;
            System.out.println("I am done eating and not hungry anymore!");
        }
    }

    // Custom constructor mit Erzeugungsverhalten
    public Person(int age, String firstName, boolean isHungry) {
        this.age = age;
        this.firstName = firstName;
        this.isHungry = isHungry;
    }

    // Sobald ein eigener custom constructor existiert, gibt es keinen impliziten Default mehr
    // WILL man diesen haben, muss man ihn dann selbst schreiben
    public Person() {}

    public Person(int birthYear, String firstName) {
        int currentYear = 2025;
        this.firstName = firstName;
        this.age = currentYear - birthYear;
        this.isHungry = true;
    }
}
