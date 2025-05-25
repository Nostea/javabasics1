package de.home.playgrounds.javabasics.example7_ArraySort;

import java.util.Arrays;

public class ArrayMismatch {
    public static void main(String[] args) {
        // geben den Index auf das erste Element zurück, das ungleich ist. Sind beide Arrays gleich, ist die Rückgabe –1.
        int[] a = {1,2,3,4};
        int[] b = {1,4,3,2};
        System.out.println(Arrays.mismatch(a, b));

    }
}
