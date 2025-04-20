package de.home.playgrounds.javabasics.lecture11_vererbung_exercise;

public class Application {

    public static void main(String[] args) {
        Student student1 = new Student("Constantine", "Schröter", "1111", "c.s@g.de", "1111");
        Student student2 = new Student("Ange", "Goldberg", "2222", "a.g@g.de", "2222");
        Student student3 = new Student("Bertram", "Holdenmaid", "3333", "alex.g@g.de", "3333");

        student1.printBaseProfile();
        student2.printBaseProfile();
        student3.printBaseProfile();

        student1.printStudentProfile();
        student2.printStudentProfile();
        student3.printStudentProfile();

        Address a1 = new Address("BD", "111", "11111", "Berlin", "DE");
        Address a2 = new Address("DS", "222", "22222", "Berlin", "DE");
        Address a3 = new Address("KD", "333", "33333", "Köln", "DE");

        student1.setAddress(a1);
        student2.setAddress(a2);
        student3.setAddress(a3);

        a1.printAsLetterLabel(false);
        a2.printAsLetterLabel(true);
        a3.printAsLetterLabel(true);

        Professor p1 = new Professor("Severus", "Snape", "---", "halfbloodprince@hogwarts.uk");
        Professor p2 = new Professor("Albus", "Dumbledore", "---", "fresh.d@bueroeingang.uk");

        Address a4 = new Address("Hogwarts", "1", "1", "Hogwarts", "UK");
        Address a5 = new Address("Hogwarts HeadOffice", "1a", "1", "Hogwarts", "UK");

        p1.setAddress(a4);
        p2.setAddress(a5);

        p1.printBaseProfile();
        p2.printBaseProfile();

        p1.printProfessorProfile();
        p2.printProfessorProfile();

        a4.printAsLetterLabel(false);
        a5.printAsLetterLabel(true);

        Course c1 = new Course("Verteidigung gegen die dunklen Künste", "Magic", "Schwer", 2);
        Course c2 = new Course("Verwandlungen", "Magic", "Mittel", 1);
        Course c3 = new Course("Zaubertränke", "Magic", "Super schwer, wenn du nicht weißt, woher ein Beozarstein kommt", 3);

        student1.enroll(c1);
        student1.enroll(c2);

        System.out.println("------------");

        student1.printTakenCourses();
        System.out.println("--");
        c1.listStudents();
        System.out.println("--");
        c2.listStudents();

        student2.enroll(c1);
        student2.enroll(c2);

        System.out.println("--");
        c1.listStudents();
        System.out.println("--");
        c2.listStudents();

        p1.enrollAsProfessor(c3);
        p1.enrollAsProfessor(c1);

        p2.enrollAsProfessor(c2);
        p2.enrollAsProfessor(c1);

        System.out.println("+++++++");
        p1.printTeachedCourses();
        System.out.println("---");
        p2.printTeachedCourses();
        System.out.println("------");
        c1.listProfessors();
        System.out.println("---");
        c2.listProfessors();
        System.out.println("---");
        c3.listProfessors();
    }
}
