package de.home.playgrounds.javabasics.lecture9_maps_and_hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class Application {

    public static void main(String[] args) {
        HashMap<Integer, String> personNameMap = new HashMap<>(); // Initialisierung einer HashMap mit ints als Keys und Strings als Values
        personNameMap.put(1, "Anna"); // Hinzufügen eines Elements zur Map mit Key = 1, Value = Anna
        personNameMap.put(2, "Bob"); // Weiteres Element unter neuem Key hinzugefügt

        String personWithKey1 = personNameMap.get(1); // Holt uns den Value aus der map mit dem Key 1 ab
        System.out.println(personWithKey1);

        System.out.println(personNameMap.containsKey(2)); // sollte true sein, weil Bob den Key 2 hat
        System.out.println(personNameMap.containsKey(47)); // sollte false sein, weil kein Wert mit Key 47 enthalten

        String nonExistingPerson = personNameMap.get(5);
        System.out.println(nonExistingPerson);

        String nonExistingPersonWithDefaultFallback = personNameMap.getOrDefault(5, "Default Human");
        System.out.println(nonExistingPersonWithDefaultFallback);

        System.out.println(personNameMap.size());
        personNameMap.put(2, "Chris"); // Überschreibt Key=2 mit dem Wert Bob und setzt Chris als Wert
        personNameMap.putIfAbsent(2, "Foobar"); // Eintrag wird mit Key=2 nur angelegt, wenn der Key noch nicht existiert

        System.out.println("-----");

        for (Integer key : personNameMap.keySet()) { // Mit keySet kann auf die Keys (eine Art Liste) zugegriffen werden
            System.out.println(key + ": " + personNameMap.get(key));
        }

        System.out.println();
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        HashMap<String, ArrayList<String>> smallDictionary = new HashMap<>();
        ArrayList<String> aWords = new ArrayList<>();
        aWords.add("Anna");
        aWords.add("Aber");
        smallDictionary.put("A", aWords);

        ArrayList<String> bWords = new ArrayList<>();
        bWords.add("Biber");
        bWords.add("Brot");
        bWords.add("Brokkoli");
        smallDictionary.put("B", bWords);

        ArrayList<String> cWords = new ArrayList<>();
        cWords.add("Cool");
        cWords.add("Cello");
        cWords.add("Christopher");
        cWords.add("Christbaumkugelentsorgungsmaschinenentpacker");
        cWords.add("China");
        smallDictionary.put("C", cWords);

        for (String dictionaryKey : smallDictionary.keySet()) {
            System.out.println(dictionaryKey);
            ArrayList<String> wordsForKey = smallDictionary.get(dictionaryKey);
            for (String word : wordsForKey) {
                System.out.println(word);
            }
            System.out.println("++");
        }
    }

}
