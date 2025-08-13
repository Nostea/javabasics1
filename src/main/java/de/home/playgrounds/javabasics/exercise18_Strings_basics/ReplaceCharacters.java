package de.home.playgrounds.javabasics.exercise18_Strings_basics;

public class ReplaceCharacters {
    public static void main(String[] args) {
        String text = "Ich mag Java";

        String resultString = text.replace(" ", "_");

        System.out.println(resultString);
    }
}
