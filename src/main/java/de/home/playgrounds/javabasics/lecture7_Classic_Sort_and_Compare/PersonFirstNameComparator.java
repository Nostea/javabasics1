package de.home.playgrounds.javabasics.lecture7_Classic_Sort_and_Compare;

import java.util.Comparator;

public class PersonFirstNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
       return person1.getFirstName().compareTo(person2.getFirstName());
    }
}
