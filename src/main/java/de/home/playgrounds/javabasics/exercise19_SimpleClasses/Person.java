package de.home.playgrounds.javabasics.exercise19_SimpleClasses;

import java.util.Scanner;

public class Person {

    public int age;
    public String firstName;
    public String lastName;
    public String fullName;
    public boolean isHungry;
    public int weight;
    public int height;
    public int distanceWalked;
    public int exerciseTime;
    public boolean isFit;

    public Person(int age, String firstName, String lastName, int weight, int height, int distanceWalked, int exerciseTime, boolean isFit) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.isHungry = false;
        this.weight = weight;
        this.height = height;
        this.distanceWalked = distanceWalked;
        this.exerciseTime = exerciseTime;
        this.isFit = isFit;
    }

    public void eat(){
        if(!this.isHungry) {
            System.out.println("I'm full, I don't feel like eating");
        } else {
            System.out.println("I'm snacking on some food");
            this.isHungry = false;
        }
    }

    public void growTaller(int amountCM) {
        System.out.println("Oh wow, I am growing taller!");
        this.height += amountCM;
        System.out.println("I grew by " + amountCM + " and I'm " + height + "cm tall now");
    }

    public void greet() {
        System.out.println("Hello, I am " + fullName + ".");
        Scanner scanner = new Scanner(System.in);
        String userTalking = scanner.nextLine();
        System.out.println(userTalking);

    }

    public void walk(int distanceWalkedInCM) {
        this.distanceWalked+= distanceWalkedInCM;
        System.out.println("I walked " + this.distanceWalked);

    }
}


