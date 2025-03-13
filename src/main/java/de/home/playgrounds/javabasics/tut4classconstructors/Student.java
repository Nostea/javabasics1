package de.home.playgrounds.javabasics.tut4classconstructors;

public class Student extends Person {
    // zusätzliche Eigenschaft:
    private int form;
    // Konstruktor:
    public Student(String lastName, String firstName, int age, int form) {
        super(lastName, firstName, age);
        this.form = form;
    }
    // neue Methoden:
    public int getForm() {
        return this.form;
    }
    public void promotion() {
        this.form++;
    }
}
