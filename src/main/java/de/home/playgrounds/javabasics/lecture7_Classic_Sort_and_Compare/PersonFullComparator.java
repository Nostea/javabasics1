package de.home.playgrounds.javabasics.lecture7_Classic_Sort_and_Compare;

import java.util.Comparator;

public class PersonFullComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        System.out.println("I am now comparing two person");
        int firstNameCompareResult = person1.getFirstName().compareTo(person2.getFirstName());
        if (firstNameCompareResult != 0) {
            return firstNameCompareResult;
        } else {
            int lastNameCompareResult = person1.getLastName().compareTo(person2.getLastName());
            if (lastNameCompareResult != 0) {
                return lastNameCompareResult;
            } else {
                int ageCompareResult = person1.getAge() - person2.getAge();
                return ageCompareResult;
            }
        }
    }
}
