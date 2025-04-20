package de.home.playgrounds.javabasics.lecture11_vererbung_basics;

public class Chameleon extends RealPet {

    private boolean isColdBlooded;
    private double scaleDensity;

    public Chameleon(String name, int age, boolean isColdBlooded, double scaleDensity) {
        super(name, age);
        this.isColdBlooded = isColdBlooded;
        this.scaleDensity = scaleDensity;
    }

    public void camouflage() {
        System.out.println("Now you see me, now you dont");
    }

    public void findWarmth() {
        System.out.println("Ich wärme mich jetzt auf");
    }

    @Override
    public void sayAbstractHello() {
        System.out.println("Hi I am a chameleon! ...");
    }
}
