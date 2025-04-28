package de.home.playgrounds.javabasics.lecture13_interfaces_intro;

public class Teacher
        extends Person
        implements Teachable
{

    private int licenseId;

    public void teach() {
        System.out.println("i teach");
    }

    @Override
    public void study() {
        System.out.println("I need more money, so I need more brain, so I study more");
    }
}
