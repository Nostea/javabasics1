package de.home.playgrounds.javabasics.exercise22_ArrayMethodsLoopsRevision;

public class MethodsRevision {

    // Schreibe eine Methode quadrat(int zahl), die das Quadrat einer ganzen Zahl zurückgibt.
    // Rufe die Methode in main() auf und gib das Ergebnis aus.
    public static void squared(int number) {
        int result = number * number;

        System.out.println(number + " squared is: " + result);
    }

    // Write method for maximum of 2 given numbers
    public static void maximum(int num1, int num2) {
        int maximum = Math.max(num1, num2);
        System.out.println("Maximum from given numbers " + num1 + ", " + num2 + " is: " + maximum);
    }

    //Währungsumrechnung
    //Schreibe eine Methode euroZuDollar(double betrag), die einen Euro-Betrag in US-Dollar umrechnet (Kurs: 1 EUR = 1.08 USD).
    // Schreibe außerdem eine Methode dollarZuEuro(double betrag) für die Gegenrichtung.
    // Gib in main() beide Umrechnungen formatiert aus.
    public static void euroToDollar(double euroValue) {
        double dollarValue = euroValue * 1.16;
        System.out.printf("%.2f EUR --> %.2f $ %n", euroValue, dollarValue);
    }

    public static void dollarToEuro(double dollarValue) {
        double euroValue = dollarValue * 0.86;
        System.out.printf("%.2f $ --> %.2f EUR %n", dollarValue, euroValue);
    }

    // Schreibe eine Methode fizzBuzz(int number), die alle Zahlen von 1 bis n durchläuft und folgendes ausgibt
    // Zahl durch 3 teilbar --> Fizz
    // Zahl durch 5 teilbar --> Buzz
    // Ist die Zahl durch 3 und 5 teilbar --> FizzBuzz
    // Sonst --> die Zahl selbst
    public static void fizzBuzz(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        squared(4);
        maximum(23, 3);
        maximum(4, 25);
        euroToDollar(100.44);
        dollarToEuro(100.44);
        System.out.println();
        fizzBuzz(15);

    }

}
