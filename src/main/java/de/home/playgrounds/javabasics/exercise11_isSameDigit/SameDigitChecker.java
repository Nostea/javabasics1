package de.home.playgrounds.javabasics.exercise11_isSameDigit;

import java.util.Scanner;

public class SameDigitChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gebe 2 Zahlen ein (bis 5 Ziffern länge)");

        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        int num1raw = Integer.parseInt(num1);
        int num2raw = Integer.parseInt(num2);
        boolean hasSameDigit = false;

        String last2digits = "";

        if (num1raw <= 9) {
            num1 = "0" + num1;
        }

        if (num2raw <= 9) {
            num2 = "0" + num2;
        }

        if (num1raw >= 100) {
            System.out.println(num1);
            last2digits = num1.substring(num1.length() - 2);
            num1 = last2digits;
            System.out.println(num1);
        }

        if (num2raw >= 100) {
            System.out.println(num2);
            last2digits = num2.substring(num2.length() - 2);
            num2 = last2digits;
            System.out.println(num2);
        }


        for (int i = 0; i < 10; i++) {
            String comparisonValue = Integer.toString(i); // der iterator ist zum vergleich da 0,1,2,3,4,5,6,7,8,9

            if (num1.contains(comparisonValue) && num2.contains(comparisonValue)) {
                hasSameDigit = true;
                break;
            }
        }
        System.out.println("Result: " + hasSameDigit);

    }
}
