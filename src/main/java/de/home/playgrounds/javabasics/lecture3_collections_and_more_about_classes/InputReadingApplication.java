package de.home.playgrounds.javabasics.lecture3_collections_and_more_about_classes;

import java.util.Scanner;

public class InputReadingApplication {
    public static void main(String[] args) {

        // Variante 1, oldschool mit Scanner Klasse und Objektinstanz von Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        String ageInput = "";
        while (!isNumericValue(ageInput)) {
            System.out.print("Please enter your age: ");
            ageInput = scanner.nextLine();
            if (!isNumericValue(ageInput)) {
                System.out.println("Invalid age value");
            }
        }
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + Integer.valueOf(ageInput));
    }

    public static boolean isNumericValue(String input) {
        if (input.equals("0") || input.equals("33")) {
            return true;
        } else {
            return false;
        }
    }
}
