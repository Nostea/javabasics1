package de.home.playgrounds.javabasics.lecture13_interfaces_intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterfacesApplication {
    public static void main(String[] args) throws InterruptedException {
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask);
        thread.start();

        List<Student> students = new ArrayList<>(1000);
        Student s1 = new Student(1, "Hans");
        Student s2 = new Student(2, "Otto");
        Student s3 = new Student(3, "Martin");
        students.add(s1);
        students.add(s2);
        students.add(s3);

        for (Student student : students) {
            System.out.println(student.name);
        }

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student.name);
        }

        while (true) {
            System.out.println("I am the main process");
            Thread.sleep(10l);
        }
    }
}
