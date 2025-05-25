package de.home.playgrounds.javabasics.example7_ArraySort;

import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {

        // value im Array drin
        int[] numbers = { 1, 10, 100, 1000 };
        System.out.println( Arrays.binarySearch( numbers, 100 ) ); // 2

        // value NICHT im Array drin
        int[] numbers2 = { 1, 10, 100, 1000 };
        System.out.println( Arrays.binarySearch( numbers2, 101 ) ); // -4

        // vor binary Search muss das Array zwingend sortiert sein, deswegen davor Arrays.sort()
        int[] numbers3 = { 10, 100, 1000, 1 };
        Arrays.sort( numbers );
        System.out.println( Arrays.toString( numbers3  ) ); // [1, 10, 100, 1000]
        System.out.println( Arrays.binarySearch( numbers3, 100 ) );   // 2
    }
}
