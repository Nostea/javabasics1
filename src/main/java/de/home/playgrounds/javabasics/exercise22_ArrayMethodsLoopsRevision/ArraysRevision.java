package de.home.playgrounds.javabasics.exercise22_ArrayMethodsLoopsRevision;

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



    public static void main(String[] args) {

        int[] array = {34, 7, 23, 32, 5, 62};
        findMaxVal(array);
        findMinVal(array);
        int[] avgArray =  {12, 45, 7, 3, 88, 56, 21};
        calcAverageFromArray(avgArray);
        reverseArray(array);
        multiplicationTable();

    }
}
