package de.home.playgrounds.javabasics.lecture15_Collections_Sets;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        ArrayList<String> list = new ArrayList<>();
        String s = "Chris";

        // Ich kann identische Elemente beliebig oft in eine Liste packe
        list.add(s);
        list.add(s);

        for (String listElement : list) {
            System.out.println(listElement);
        }

        System.out.println("----------");
        // Bei Sets sieht das etwas anders aus:
        set.add(s);
        set.add(s);

        for (String setElement : set) {
            System.out.println(setElement);
        }

        if (set.add(s)) {
            System.out.println("Konnte "  + s + " dem Set hinzufügen");
        } else {
            System.out.println("Konnte "  + s + " NICHT dem Set hinzufügen");
        }

        System.out.println("----------------");
        ArrayList<String> userInput = new ArrayList<>();
        userInput.add("Chris");
        userInput.add("Konnte");
        userInput.add("Chris");
        userInput.add("Anna");
        userInput.add("Chris");
        userInput.add("Anna");
        userInput.add("Baum");
        HashSet<String> uniqueUserInput = new HashSet<>();
        for (String inputElement : userInput) {
            uniqueUserInput.add(inputElement);
        }
        for (String uniqueInputElement : uniqueUserInput) {
            System.out.println(uniqueInputElement);
        }

        System.out.println("-------------");
        // Offtopic
        // Statt so collection zu initialisieren:
        ArrayList<String> badInitialisedList = new ArrayList<>();
        List<String> goodInitialisedList = new ArrayList<>();
        Set<String> goodInitialisedSet = new HashSet<>();
        Map<String, String> goodInitialisedMap = new HashMap<>();
    }
}
