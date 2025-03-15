package de.home.playgrounds.javabasics.exercise1;

public class Person {

    public int age;
    public int birthYear;
    public String firstName;
    public String lastName;
    public String streetName;
    public int houseNumber;
    public String favHobby;
    public String gender;
    public int height;
    public int stepsPerDay;
    public int weight;


    public Person(int age, int birthYear, String firstName, String lastName, String streetName, int houseNumber, String favHobby, String gender, int height, int stepsPerDay, int weight) {
        this.age = age;
        this.birthYear = birthYear;
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.favHobby = favHobby;
        this.gender = gender;
        this.height = height;
        this.stepsPerDay = stepsPerDay;
        this.weight = weight;

    }

    public void celebrateBirthday() {
        System.out.println("I am one year older now!");
        this.age++;
    }

    public void walk(int stepsWalked) {
        System.out.println(this.firstName + " is going for a short walk to lose weight.");
        this.stepsPerDay = this.stepsPerDay + stepsWalked;
        this.weight = this.weight - stepsWalked / 100;
        System.out.println(this.firstName + " came back and now weighs " + this.weight);
        System.out.println();
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getAddress() {
        return this.streetName + " " + this.houseNumber;
    }
}
