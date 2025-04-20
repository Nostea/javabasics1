package de.home.playgrounds.javabasics.lecture11_vererbung_exercise;

import java.util.ArrayList;

public class Student extends Person {

    private String studentNumber;
    private int currentSemester;
    private ArrayList<Course> courses;

    public Student(String firstName, String lastName, String phoneNumber, String emailAddress, String studentNumber) {
        super(firstName, lastName, phoneNumber, emailAddress);
        this.studentNumber = studentNumber;
        currentSemester = 1;
        courses = new ArrayList<>();
    }

    public void printTakenCourses() {
        for (Course course : courses) {
            System.out.println(course.getName() + "(" + course.getCategory() + "): " + course.getDifficulty());
        }
    }

    public void enroll(Course course) {
        if (!course.isFull()) {
            this.courses.add(course);
            course.addStudent(this);
        } else {
            System.out.println("Kurs ist voll");
        }
    }

    public void printStudentProfile() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(this.firstName + " " + this.lastName);
        System.out.println("Phone number: " + this.phoneNumber);
        System.out.println("Email address: " + this.emailAddress);
        System.out.println("Student number: " + this.studentNumber);
        System.out.println("Current semester: " + this.currentSemester);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
