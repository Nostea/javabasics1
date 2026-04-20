package de.home.playgrounds.javabasics.exercise22_ArrayMethodsLoopsRevision;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysRevision {

    public static void findMaxVal (int[] array) {
        int max = 0;
        for (int i=0; i < array.length - 1; i++){
            if(array[i] > array[i+1]) {
                max = array[i];
            } else {
                max = array[i+1];
            }
        }
        System.out.println(max);
    }

    public static void findMinVal (int[] array) {
        int min = 0;
        for (int i=0; i < array.length - 1; i++){
            min = Math.min(array[i],array[i+1]);
            /*
            if(array[i] < array[i+1]) {
                min = array[i];
            } else {
                min = array[i+1];
            }
            */

        }
        System.out.println(min);
    }

    public static void calcAverageFromArray (int[] avgArray) {
        int sum = 0;
        for (int number : avgArray) {
            sum +=number;
        }
        double average = (double)(sum / avgArray.length);
        System.out.println(average);
    }

    public static void reverseArray (int[] array) {
        int[] reversedArray = new int[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i-- ) {
            reversedArray[j] = array[i];
            j++;
        }
        System.out.println(Arrays.toString(reversedArray));
    }

    public static void multiplicationTable() {

        for (int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    public static void calcMostNumberOccurence(int[] numbersArray) {
        // {3,7,3,1,3,9,3};
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        ArrayList<Integer> occurencesArray = new ArrayList<>();

        uniqueNumbers.add(numbersArray[0]);

        for (int i = 1; i < numbersArray.length; i++) {
            for (int j = i; j < numbersArray.length; j++) {
                if(numbersArray[i] == numbersArray[j] && !uniqueNumbers.contains(numbersArray [i])) {
                    uniqueNumbers.add(numbersArray[i]);
                }
            }
        }
        System.out.println(uniqueNumbers); // [3, 7, 1, 9]



        for (int i = 0; i < uniqueNumbers.size(); i++) {
            int counter = 0;
            for (int j = i; j < numbersArray.length; j++) {
                if(numbersArray[j] == uniqueNumbers.get(i)) {
                    counter++;
                }
            }
            occurencesArray.add(counter);
        }

        System.out.println(occurencesArray); // [4, 1, 1, 1]
        int index = findLargestNumberInListIndex(occurencesArray);
        System.out.println("Die Zahl " + uniqueNumbers.get(index) + " wiederholt sich am meisten: " + occurencesArray.get(index) + " mal");


    }

    public static int findLargestNumberInListIndex (ArrayList<Integer> occurencesArray) {
        int maxIndexAt = 0;
        for( int i = 0; i < occurencesArray.size() - 1; i++) {
            if(occurencesArray.get(i) < occurencesArray.get(i + 1)) {
                maxIndexAt = i + 1;
            }
            if(occurencesArray.get(i) > occurencesArray.get(i + 1)) {
                maxIndexAt = i;
            }
        }
        System.out.println(maxIndexAt);
        return maxIndexAt;
    }



    public static void main(String[] args) {

        int[] array = {34, 7, 23, 32, 5, 62};
        findMaxVal(array);
        findMinVal(array);
        int[] avgArray =  {12, 45, 7, 3, 88, 56, 21};
        calcAverageFromArray(avgArray);
        reverseArray(array);
        multiplicationTable();
        int[] numbersArray = {3,7,3,1,3,9,3};
        calcMostNumberOccurence(numbersArray);
    }
}
