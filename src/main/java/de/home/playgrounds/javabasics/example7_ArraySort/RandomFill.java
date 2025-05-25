package de.home.playgrounds.javabasics.example7_ArraySort;

import java.util.Arrays;

public class RandomFill {
    public static void main(String[] args) {
        double[] randoms = new double[ 10 ];
        Arrays.setAll( randoms, v -> Math.random() );
        System.out.println( Arrays.toString( randoms ) );
    }
}
