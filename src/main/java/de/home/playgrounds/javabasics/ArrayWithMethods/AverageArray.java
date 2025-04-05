package de.home.playgrounds.javabasics.ArrayWithMethods;

public class AverageArray {

    static double avg( double[] array ) {

        double sum = 0;

        if ( array == null || array.length == 0 )

            throw new IllegalArgumentException( "Array null oder leer" );
        for ( int i = 0; i < array.length; i++ )
            sum += array[ i ];

        return sum / array.length;

    }



    public static void main( String[] args ) {

        double[] numbers =  { 2, 3, 4 };

        System.out.println( avg( numbers ) );            // 3.0

    }
}
