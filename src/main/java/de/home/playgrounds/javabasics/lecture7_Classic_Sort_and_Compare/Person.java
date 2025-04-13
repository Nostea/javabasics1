package de.home.playgrounds.javabasics.lecture7_Classic_Sort_and_Compare;

public class Person {

    public final static char GENDER_MALE = 'M';
    public final static char GENDER_FEMALE = 'F';

    private String firstName;
    private String lastName;
    private char gender;
    private int age;
    private Address address;

    public Person(String firstName, String lastName, char gender, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
