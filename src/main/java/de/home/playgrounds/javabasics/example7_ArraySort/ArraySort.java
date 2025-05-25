package de.home.playgrounds.javabasics.example7_ArraySort;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = { -1, 3, -10, 9, 3 };
        String[] names = { "Xanten", "Alpen", "Wesel" };
        Arrays.sort( numbers );
        Arrays.sort( names );
        System.out.println( Arrays.toString( numbers ) ); // [-10, -1, 3, 3, 9]
        System.out.println( Arrays.toString( names ) );   // [Alpen, Wesel, Xanten]
    }
}
