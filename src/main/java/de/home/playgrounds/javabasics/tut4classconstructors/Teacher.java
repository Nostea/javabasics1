package de.home.playgrounds.javabasics.tut4classconstructors;

public class Teacher extends Person {
    // zusätzliche Eigenschaft:
    private String subject;
    // Konstruktor:
    public Teacher(String lastName, String firstName, int age,
                   String subject) {
        super(lastName, firstName, age);
        this.subject = subject;
    }
    // neue Methode:
    public String getSubject() {
        return this.subject;
    }
}
