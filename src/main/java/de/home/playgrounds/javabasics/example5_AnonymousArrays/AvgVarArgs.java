package de.home.playgrounds.javabasics.example5_AnonymousArrays;

public class AvgVarArgs {
    static double avg(double... array) {
        if (array.length == 0) return 0;

        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main( String[] args ) {

        System.out.println( avg(1, 2, 9, 3) );     // 3.75

    }
}
