package de.home.playgrounds.javabasics.exercise5_ReadAndWriteFile;

public class Person {

    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private String city;
    private boolean isAtParty;


    public Person(String id, String firstName, String lastName, int age, String city, boolean isAtParty){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.isAtParty = isAtParty;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isAtParty() {
        return isAtParty;
    }

    public void setAtParty(boolean atParty) {
        isAtParty = atParty;
    }



}
