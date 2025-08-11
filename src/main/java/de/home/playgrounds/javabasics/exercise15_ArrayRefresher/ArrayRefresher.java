package de.home.playgrounds.javabasics.exercise15_ArrayRefresher;

import java.util.Arrays;

public class ArrayRefresher {
    public static void main(String[] args) {
        int [] beispielArray = { 1,2,3,4,5,6};

        for(int i= 0; i < beispielArray.length; i++) {
            System.out.println(beispielArray[i]);
        }

        System.out.println("--------");

        double [] randomArray = {Math.random()*10, Math.random()*10,Math.random()*10};
        int sumRandom = 0;

        for(int j= 0; j < randomArray.length; j++) {
            System.out.println((int)randomArray[j]);
            sumRandom += (int)randomArray[j];
        }

        System.out.println("Finale summe: " + sumRandom);

        System.out.println("--------");

        int [] reverseArray = {3,5,9,14};

        int [] reverseArrayResult = new int[reverseArray.length]; // array der laenge des ersten arrays

        for(int i = 0; i < reverseArray.length ; i++) {
            int j = reverseArray.length - 1 - i;   // j index durchiteriert:  4-1-0=3, 4-1-1=2, 4-1-2=1, 4-1-3=0
                reverseArrayResult[j] = reverseArray[i];
            }
        System.out.println(java.util.Arrays.toString(reverseArrayResult));

        }



    }

