package de.home.playgrounds.javabasics.example7_ArraySort;

import java.util.Arrays;

public class ArrayConcatinate2Arrays {
    public static <T> T[] concat( T[] first, T[] second ) {
        T[] result = Arrays.copyOf( first, first.length + second.length );
        System.arraycopy( second, 0, result, first.length, second.length );

        return result;

    }
}
