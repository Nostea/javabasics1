package de.home.playgrounds.javabasics.lecture13_interfaces_intro;

public class Student
        extends Person
        implements Teachable, PartyEligable, Comparable<Student>
{
    private int studentId;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public void study() {
        System.out.println("Hello i study, since i am a student");
    }

    @Override
    public int partyHaaaard() {
        long countOfBeers = Math.round(Math.random()  * 10);
        return (int) countOfBeers;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.name.compareTo(otherStudent.name);
    }
}
