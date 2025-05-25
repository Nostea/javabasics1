package de.home.playgrounds.javabasics.example7_ArraySort;

import java.util.Arrays;

public class ArrayEquals_DeepEquals {
    public static void main(String[] args) {
        System.out.println("--- equals vergleich ---");
        int[] array1 = { 1, 2, 3, 4 };
        int[] array2 = { 1, 2, 3, 4 };
        int[] array3 = { 9, 9, 2, 3, 9 };

        System.out.println( Arrays.equals( array1, array2 ) );              // true
        System.out.println( Arrays.equals( array2, 1, 3, array3, 2, 4 ) );  // true

        System.out.println("*** unterschied equals vs deepequals ***");

        int[][] a1 = { { 0, 1 }, { 1, 0 } };
        int[][] a2 = { { 0, 1 }, { 1, 0 } };

        System.out.println( Arrays.equals( a1, a2 ) );     // false   vergleicht nur Verweise zum speicherort der arrays, die nicht identisch sind sind
        System.out.println( Arrays.deepEquals( a1, a2 ) ); // true   schaut in die inneren Arrays und vergleicht diese
        System.out.println( a1[0] );                       // zum Beispiel [I@10b62c9
        System.out.println( a2[0] );                       // zum Beispiel [I@82ba41
    }
}
