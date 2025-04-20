package de.home.playgrounds.javabasics.lecture11_vererbung_basics;

public class Cat extends RealPet {

    private String catEarForm;
    private String irisShape;

    // Wenn Oberklasse einen Konstruktor hat, muss das die Subklasse matchen und den
    // Konstruktor der Oberklasse mittels super(parameterMenge) aufrufen
    public Cat(String name, int age, String catEarForm, String irisShape) {
        super(name, age);
        this.catEarForm = catEarForm;
        this.irisShape = irisShape;
    }

    public void meow(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Meow");
        }
    }

    @Override
    public void sayAbstractHello() {
        System.out.println("Hi I am a cat! ...");
    }
}
