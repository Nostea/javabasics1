package de.home.playgrounds.javabasics.exercise18_Strings_basics;

import java.util.List;

public class MoveLettersBy3Alphabet {
    public static void main(String[] args) {
        // String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","o","p","q","r","s","t","u","v","w","x","y","z"};

        String letters = "ABC";
        String result = "";
        
        char[] resultCharArray = letters.toCharArray();


        for(int i = 0; i < letters.length(); i++) {
            resultCharArray[i] = (char) (resultCharArray[i] + 3);
        }

        System.out.println(resultCharArray); // DEF

        //TODO: edgecase behandlung einbauen, XYZ -> ergibt sonderzeichen (wegen ASCII tabelle values)
    }
}
