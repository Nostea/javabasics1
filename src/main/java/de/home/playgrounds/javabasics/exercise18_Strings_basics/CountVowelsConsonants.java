package de.home.playgrounds.javabasics.exercise18_Strings_basics;

import java.util.ArrayList;
import java.util.List;

public class CountVowelsConsonants {
    public static void main(String[] args) {

        String text = "The applepie tastes amazing";
        int countVowels = 0;
        int countConsonants = 0;

        List<Character> completeConsonantList = getCompleteConsonantList();
        List<Character> vowelsCharacterList =  List.of('a','e','i','o','u');

        for (int i = 0; i < text.length(); i++) {
            if (vowelsCharacterList.contains(text.charAt(i))) {
                countVowels++;

            } else if (completeConsonantList.contains(text.charAt(i))) {
                countConsonants++;
            }
        }

        System.out.println("vowel: " + countVowels);
        System.out.println("consonants: " + countConsonants);

    }

    private static List<Character> getCompleteConsonantList() {
        List<Character> consonantCharacterList1 = List.of('b','c','d','f','g','h','j','k');
        List<Character> consonantCharacterList2 = List.of('l','m','n','p','q','r','s','t');
        List<Character> consonantCharacterList3 = List.of('v','w','x','y','z');

        List<Character> completeConsonantList = new ArrayList<>();
        completeConsonantList.addAll(consonantCharacterList1);
        completeConsonantList.addAll(consonantCharacterList2);
        completeConsonantList.addAll(consonantCharacterList3);
        return completeConsonantList;
    }




    private static void checkContains() {
        List<String> stringList = new ArrayList<>();
        stringList.add("kuchen");
        stringList.add("cool");
        stringList.add("bananza");

        boolean containsKuchen = stringList.contains("kuchen");
        boolean containsAuto = stringList.contains("Auto");

        System.out.println(containsKuchen);
        System.out.println(containsAuto);
    }
}
