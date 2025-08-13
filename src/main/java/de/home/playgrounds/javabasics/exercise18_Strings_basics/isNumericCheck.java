package de.home.playgrounds.javabasics.exercise18_Strings_basics;

public class isNumericCheck {
    /**
     * Returns {@code true} if the String contains only Unicode digits.
     * An empty string or {@code null} leads to {@code false}.
     *
     * @param string Input String.
     * @return {@code true} if string is numeric, {@code false} otherwise.
     */
    public static boolean isNumeric( String string ) {
        if ( string == null || string.isEmpty())
            return false;
        for ( int i = 0; i < string.length(); i++ )
            if ( ! Character.isDigit( string.charAt( i ) ) )
                return false;
        return true;
    }
    public static void main( String[] args ) {
        System.out.println( isNumeric( "1234" ) ); // true, nur ziffern
        System.out.println( isNumeric( "12.4" ) ); // false, der Punkt ist keine ziffer
        System.out.println( isNumeric( "-123" ) ); // false, - ist keine ziffer
    }
}
