package de.home.playgrounds.javabasics.lecture11_vererbung_exercise;

import java.util.ArrayList;

public class Professor extends Person {

    private double salary;
    private ArrayList<Course> courses;

    public Professor(String firstName, String lastName, String phoneNumber, String emailAddress) {
        super(firstName, lastName, phoneNumber, emailAddress);
        this.salary = 4000.15;
        courses = new ArrayList<>();
    }

    public void printTeachedCourses() {
        for (Course course : courses) {
            System.out.println(course.getName() + "(" + course.getCategory() + "): " + course.getDifficulty());
        }
    }

    public void enrollAsProfessor(Course course) {
        this.courses.add(course);
        course.addProfessor(this);
    }

    public void printProfessorProfile() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(this.firstName + " " + this.lastName);
        System.out.println("Phone number: " + this.phoneNumber);
        System.out.println("Email address: " + this.emailAddress);
        System.out.println("Monthly salary (brutto): " + this.salary);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
