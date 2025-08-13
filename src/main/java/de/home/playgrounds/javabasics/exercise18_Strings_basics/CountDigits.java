package de.home.playgrounds.javabasics.exercise18_Strings_basics;

public class CountDigits {
    public static void main(String[] args) {


        String inputText = "banana";
        char letter = 'a';
        int count = 0;

        for(int i = 0; i < inputText.length(); i++) {
            if(inputText.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println("count: " + count);
    }
}
