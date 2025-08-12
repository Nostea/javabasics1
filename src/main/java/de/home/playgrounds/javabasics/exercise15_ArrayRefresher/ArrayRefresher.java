package de.home.playgrounds.javabasics.exercise15_ArrayRefresher;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayRefresher {

    public static void findBiggestNum(int[] maxArray) {
        int maxNum = maxArray[0];

        for (int i = 1; i < maxArray.length; i++) {
            if (maxNum < maxArray[i]) {
                maxNum = maxArray[i];
            }
        }
        System.out.println("MaxNum is: " + maxNum);

    }

    public static void findString(String[] stringArray, String searchWord) {

        if (Arrays.asList(stringArray).contains(searchWord)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }

    public static List<Integer> findDuplicateInt(List<Integer> listOfNumbers) {
        Set<Integer> elements = new HashSet<Integer>();
        return listOfNumbers.stream().filter(n -> !elements.add(n)).collect(Collectors.toList());
    }


    public static void main(String[] args) {

        System.out.println(findDuplicateInt(Arrays.asList(1, 2, 4, 2, 6, 4, 4, 0, 5)));

        System.out.println("------");

        findString(new String[]{"Apfel", "Banane", "Pfirsich"}, "Apfel");

        System.out.println("------");

        int[] beispielArray = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < beispielArray.length; i++) {
            System.out.println(beispielArray[i]);
        }

        System.out.println("--------");

        double[] randomArray = {Math.random() * 10, Math.random() * 10, Math.random() * 10};
        int sumRandom = 0;

        for (int j = 0; j < randomArray.length; j++) {
            System.out.println((int) randomArray[j]);
            sumRandom += (int) randomArray[j];
        }

        System.out.println("Finale summe: " + sumRandom);

        System.out.println("--------");

        int[] reverseArray = {3, 5, 9, 14};

        int[] reverseArrayResult = new int[reverseArray.length]; // array der laenge des ersten arrays

        for (int i = 0; i < reverseArray.length; i++) {
            int j = reverseArray.length - 1 - i;   // j index durchiteriert:  4-1-0=3, 4-1-1=2, 4-1-2=1, 4-1-3=0
            reverseArrayResult[j] = reverseArray[i];
        }
        System.out.println(java.util.Arrays.toString(reverseArrayResult));

        System.out.println("--------");

        findBiggestNum(new int[]{1, 3, 5, 8});

        System.out.println("--------");

        double[] averageArray = {1.325, 5.2137, 39.98702, 27.07321};
        double average = 0.0;

        for (int i = 0; i < averageArray.length; i++) {
            average += averageArray[i];
        }
        average = average / averageArray.length;
        System.out.println("The average of " + java.util.Arrays.toString(averageArray) + " is: " + average);

        System.out.println("--------");
        /*

        int [][] matrix3x3 = new int[3][2]; // 2 dimensionale matrix, 3x3 matrix

        for (int i = 0; i < matrix3x3.length; i++) {
            //length returns number of rows
            System.out.print(i);
            for( int j = 0; j < matrix3x3[i].length; j++) {
                // in here length returns number of columns corresponding to current row
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

         */

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("--------");

        List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5,5,6,2));
        //Set<Integer> set1 = new HashSet<>(Set.of(1,2,3,4,5,5,6,2)); // funktioniert nicht wegen duplikate. Set ist eine Collection aus unique items.
        System.out.println(list1);

    }

}

