package de.home.playgrounds.javabasics.exercise18_Strings_basics;

import java.util.Arrays;

public class CountWords {
    public static void main(String[] args) {
        String text = "The small frog jumped across the street";


        String[] splitText = text.split(" ");
        int wordCounter = splitText.length;
        System.out.println(Arrays.toString(splitText));
        System.out.println("Wordcount: " + wordCounter);
    }
}
