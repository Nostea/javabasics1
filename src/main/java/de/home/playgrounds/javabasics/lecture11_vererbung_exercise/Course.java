package de.home.playgrounds.javabasics.lecture11_vererbung_exercise;

import java.util.ArrayList;

public class Course {
    private String name;
    private String category;
    private String difficulty;
    private int maxStudentCount;
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;

    public Course(String name, String category, String difficulty, int maxStudentCount) {
        this.name = name;
        this.category = category;
        this.difficulty = difficulty;
        this.maxStudentCount = maxStudentCount;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    public void listStudents() {
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }

    public void listProfessors() {
        for (Professor professor : professors) {
            System.out.println(professor.getFirstName() + " " + professor.getLastName());
        }
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public boolean isFull() {
        if (students.size() >= maxStudentCount) {
            return true;
        } else {
            return false;
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getDifficulty() {
        return difficulty;
    }
}
