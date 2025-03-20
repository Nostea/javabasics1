package de.home.playgrounds.javabasics.lecture3_collections_and_more_about_classes;

public class Person {

    public final static char GENDER_MALE = 'M';
    public final static char GENDER_FEMALE = 'F';
    private static int personCounter = 0;

    private String firstName;
    private String lastName;
    private char gender;
    private int age;
    private Address address;

    public Person(String firstName, String lastName, char gender, int age, Address address) {
        Person.personCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return this.address;
    }

    public void move(Address oldAddress, Address newAddress) {
        System.out.println("Person moves from " + oldAddress.getCity() + " to " + newAddress.getCity());
        this.address = newAddress;
    }

    public static int getPersonCounter() {
        return Person.personCounter;
    }
}
