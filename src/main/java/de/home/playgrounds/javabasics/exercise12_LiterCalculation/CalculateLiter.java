package de.home.playgrounds.javabasics.exercise12_LiterCalculation;

import java.util.Scanner;

public class CalculateLiter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gebe eine Flüssigkeitmenge in Litern als Kommazahl ein");
        double number = scanner.nextDouble();

        if (number >= 1.0) {
            System.out.println((int)number + " Liter");
        } else if (number >= 0.1) {
            System.out.println((int)(number*100) + " cl");
        } else if (number >= 0.001) {
            System.out.println((int)(number*1000) + " ml");
        } else if (number <= 0.0001) {
            System.out.println(" Wert zu klein um es darzustellen.");
        }
    }
}
