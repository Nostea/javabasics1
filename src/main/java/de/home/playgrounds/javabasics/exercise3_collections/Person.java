package de.home.playgrounds.javabasics.exercise3_collections;


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

    public void move(Address oldAddress, Address newAddress) {
        System.out.println(this.firstName +  " moves from " + oldAddress.getStreetName() + " " + oldAddress.getHouseNumber() + " " + oldAddress.getCity() +  " to " +  newAddress.getStreetName() + " " + newAddress.getHouseNumber() + " " + newAddress.getCity());
        this.address = newAddress;
    }

    public static int getPersonCounter() {
        return personCounter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
