package de.home.playgrounds.javabasics.example3_Array_averagePrice;

public class PrintAverage {
    public static void main( String[] args ) {

        // arithmetischen Mittelwert berechnen
        double[] numbers = { 2.7, 6.5, 8.9, 1.3 };
        double sum = 0;

        for ( int i = 0; i < numbers.length; i++ )
            sum += numbers[ i ];

        double avg = sum / numbers.length;

        double avgRounded = Math.round(avg);

        System.out.println( avg );  // 4.8500000000000005
        System.out.println("avg rounded: " + avgRounded);

    }
}
