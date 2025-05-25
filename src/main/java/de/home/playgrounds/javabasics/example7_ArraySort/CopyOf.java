package de.home.playgrounds.javabasics.example7_ArraySort;

import java.util.Arrays;

public class CopyOf {
    public static void main(String[] args) {
        String[] snow = { "Neuschnee", "Altschnee", "Harsch", "Firn" };
        String[] snow1 = Arrays.copyOf( snow, 2 ); // [Neuschnee, Altschnee]
        String[] snow2 = Arrays.copyOf( snow, 5 ); // [Neuschnee, Altschnee, Harsch, Firn, null]

        for ( String item : snow1) {
            System.out.println(item);
        }

        System.out.println("***");

        for ( String item : snow2) {
            System.out.println(item);
        }
        System.out.println("###");

        String[] snow3 = Arrays.copyOfRange( snow, 2, 4 ); // [Harsch, Firn]
        for ( String item : snow3) {
            System.out.println(item);
        }
        System.out.println("---");

        String[] snow4 = Arrays.copyOfRange( snow, 2, 5 ); // [Harsch, Firn, null]

        for ( String item : snow4) {
            System.out.println(item);
        }

    }
}
