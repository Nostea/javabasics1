package de.home.playgrounds.javabasics.loops;

public class Loops {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.print("\t" + i);
            i++;
        }
        System.out.println(); // für den Zeilenumbruch nach der Zahlenreihe

        int j = 0;
        do {
            System.out.print("\t" + j);
            j++;
        } while (j < 10);
        System.out.println();
    }
}
