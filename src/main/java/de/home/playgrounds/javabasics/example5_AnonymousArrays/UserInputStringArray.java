package de.home.playgrounds.javabasics.example5_AnonymousArrays;

import java.util.Scanner;

public class UserInputStringArray {
    public static void main(String[] args) {
        String[] validInputs = {"Banana", "Apple", "Cherry"};

        String input = null;
        boolean found = false;

        System.out.println("Type a Fruit to see if it's yummy:");

        while ( ! found ) {
            input = new Scanner (System.in).nextLine();

            for (String s : validInputs) {
                if (s.equalsIgnoreCase(input)) {
                    found = true;
                    break;
                }
            }
        }
        System.out.println("Yummy " + input);
    }

}
