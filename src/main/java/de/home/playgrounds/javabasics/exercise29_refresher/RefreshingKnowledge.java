package de.home.playgrounds.javabasics.exercise29_refresher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RefreshingKnowledge {

    public static void fizzBuzz(int lowerBoundary, int highestBoundary) {
        for(int i = lowerBoundary; i <= highestBoundary; i++) {
            if( i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

    public static void arrayManipulation(int arrayLength) {
        int[] numArray = new int[arrayLength];
        int sum = 0;
        for(int i = 0; i < arrayLength; i++) {
            numArray[i] = (int) (Math.random() * 100);
            sum += numArray[i];
        }
        double average = (double) sum / arrayLength;
        System.out.println(Arrays.toString(numArray) + " | Sum: " + sum +  " | average: " + average);
    }

    public static void palindromeChecker(String word) {
        // Schreibe ein Programm, das überprüft, ob eine Zeichenkette ein Palindrom ist (z. B. "radar" oder "otto").
        boolean isPalindrome = true;
        String[] characterArray = word.split("");
        List<String> characterList = Arrays.asList(characterArray);
        ArrayList<String> reversedWord = new ArrayList<>();

        for(int i = characterList.size() - 1; i >= 0; i--) {
            reversedWord.add(characterList.get(i));
        }

        for(int i = 0; i < characterList.size(); i++ ) {
            if(characterList.get(i).equals(reversedWord.get(i))) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println(word + " is a palindrome");
        }

        if(!isPalindrome) {
            System.out.println("The word " + word + " isn't a palindrome");
        }
    }

    public static void exceptionHandling(int divisor1, int divisor2) {
        if(divisor1 == 0 || divisor2 == 0) {
            throw new ArithmeticException("You can't divide by 0");
        }
        double result = (double) divisor1 / (double) divisor2;
        System.out.println(divisor1 + " / " + divisor2 + " = " + result);
    }

    public static void main(String[] args) {
        fizzBuzz(1,20);
        //arrayManipulation(10);
        //palindromeChecker("palindrome");
        //palindromeChecker("otto");
        //palindromeChecker("radar");
        //exceptionHandling(4,2);
        //exceptionHandling(4,0);
    }
}
