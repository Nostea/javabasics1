package de.home.playgrounds.javabasics.exercise22_ArrayMethodsLoopsRevision;

public class OutputNumbersLoops {

    public static void printNumbers (int n) {
        //print all numbers n from 1 to 20
        for(int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    public static void printMultiplicationTable (int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d x %2d = %4d %n", i, i, i * i);
        }
    }

    public static void printPrimes (int lowerLimit, int upperLimit) {

        for(int i = lowerLimit; i <= upperLimit; i++) {
            isPrimeChecker(i);

        }

    }

    // primes: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, ...
    public static boolean isPrimeChecker(int number) {
        if (number <= 1) {
            //System.out.println(number + " not prime");
            return false;
        }

        if (number == 2) {
            System.out.println(number + " is prime");
            return true;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                //System.out.println(number + " not prime");
                return false;
            }
        }

        System.out.println(number + " is prime");
        return true;
    }


    public static void main(String[] args) {
        printNumbers(20);

        System.out.println();
        System.out.println();

        printMultiplicationTable(10);

        System.out.println();
        System.out.println();

        printPrimes(2,50);

    }
}
