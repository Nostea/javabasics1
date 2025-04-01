package de.home.playgrounds.javabasics.example2_NullPointerException_and_Reference;

public class NullPointerException {
    public static void main(String[] args) {
        java.awt.Point p = null;
        String s = null;
/* uncomment to see NullPointer Exceptions
        p.setLocation( 1, 2 ); // NullPointerException
        s.length();

        var text = null;  // inline image Cannot infer type for local variable initialized to 'null'

        if ( object == null ){
            // Variable referenziert nichts, ist aber gültig mit null initialisiert
        } else {
            // Variable referenziert ein Objekt
        }
*/
        String str = javax.swing.JOptionPane.showInputDialog( "Eingabe" );
        if ( str != null && ! str.isEmpty() )
            System.out.println( "Eingabe: " + str );
        else
            System.out.println( "Abbruch oder keine Eingabe" );
    }
}
