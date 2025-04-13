package de.home.playgrounds.javabasics.exercise5_ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class SortPersons {

    public static void sortByFirstName(ArrayList<Person> arrayListOfPersons) {
        //sortedPersons.sort(Comparator<?super E> ); // hier muss die spezifische weise wie sortiert wird noch geschrieben werden
        arrayListOfPersons.sort(Comparator.comparing(Person::getFirstName));
    }

    public static void sortByLastName(ArrayList<Person> arrayListOfPersons) {
        arrayListOfPersons.sort(Comparator.comparing(Person::getLastName));
    }

    public static void sortByAge(ArrayList<Person> arrayListOfPersons) {
        arrayListOfPersons.sort(Comparator.comparing(Person::getAge));
    }

}
