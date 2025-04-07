package de.home.playgrounds.javabasics.lecture6_UML_part1;

public class Person {
    private String lastName;
    private String firstName;
    private int age;
    private Address address;

    public Person(String lastName, String firstName, int age, Address address) {
        if (address == null) {
            System.out.println("FEHLER! Kann nicht ohne Addresse!");
            System.exit(0);
        }
        if (address.getPerson() != null) {
            System.out.println("FEHLER! Addresse schon bei anderer Person in Benutzung!");
            System.exit(0);
        }

        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.address = address;
        this.address.setPerson(this);
    }

    public String greets() {
        return "Hello, I am " + firstName + " " + lastName + " and I am " + age + " years old.";
    }
}
