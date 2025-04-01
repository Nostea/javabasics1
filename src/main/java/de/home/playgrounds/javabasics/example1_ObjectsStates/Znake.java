package de.home.playgrounds.javabasics.example1_ObjectsStates;

public class Znake {



    public static void main( String[] args ) {

        // TODO : Spieler, Schlange und Gold sollen jede Runde eine neue Koordinate erhalten
        // TODO : 2 Schlangen
        // TODO : Das Programm soll in mehrere Methoden aufgespaltet werden

        int playerMoveCounter = 0;
        java.awt.Point playerPosition = new java.awt.Point( 10, 9 );
        java.awt.Point snakePosition  = new java.awt.Point( 30, 2 );
        java.awt.Point goldPosition   = new java.awt.Point( 6, 6 );
        java.awt.Point goldPosition2   = new java.awt.Point( 4, 4 );
        java.awt.Point doorPosition   = new java.awt.Point( 0, 5 );
        boolean rich = false;

        while ( true ) {
            // Raster mit Figuren zeichnen
            //40x10 grid zeichnen
            for ( int y = 0; y < 10; y++ ) {
                for ( int x = 0; x < 40; x++ ) {
                    java.awt.Point p = new java.awt.Point( x, y );
                    if ( playerPosition.equals( p ) )
                        System.out.print( '&' );
                    else if ( snakePosition.equals( p ) )
                        System.out.print( 'S' );
                    else if ( goldPosition.equals( p ) || goldPosition2.equals(p) )
                        System.out.print( '$' );
                    else if ( doorPosition.equals( p ) )
                        System.out.print( '#' );
                    else System.out.print( '.' );
                }
                System.out.println();
            }

            // Status feststellen
            if ( rich && playerPosition.equals( doorPosition ) ) {
                System.out.println( "Gewonnen!" );
                return;
            }

            if ( playerPosition.equals( snakePosition ) ) {
                System.out.println( "ZZZZZZZ. Die Schlange hat dich!" );
                return;
            }

            if ( playerPosition.equals( goldPosition )  ) {
                rich = true;
                goldPosition.setLocation( -1, -1 );
            }

            if ( playerPosition.equals(goldPosition2)) {
                rich = true;
                goldPosition2.setLocation(-1,-1);
            }


            // Konsoleneingabe und Spielerposition verändern
            /*
               Hätte man an dieser Stelle int playerMoveCounter = 0; initialisiert, dann würde wegen der WHILE Schleife in der sich der gesamte Code befindet,
               die variable nach jedem Zug/Schleifeniteration auf 0 zurückgesetzt. Der Counter erfüllt die Bedingung >= 5 nie
                playerMoveCounter muss außerhalb der WHILE schleife deklariert werden.
             */
            switch ( new java.util.Scanner(System.in).next() ) {
                // Spielfeld ist im Bereich 0/0 .. 39/9
                case "h" : playerPosition.y = Math.max(  0, playerPosition.y - 1 ); playerMoveCounter++; break;
                case "t" : playerPosition.y = Math.min(  9, playerPosition.y + 1 ); playerMoveCounter++; break;
                case "l" : playerPosition.x = Math.max(  0, playerPosition.x - 1 ); playerMoveCounter++; break;
                case "r" : playerPosition.x = Math.min( 39, playerPosition.x + 1 ); playerMoveCounter++; break;
                default:
                    System.out.println("Ungültiger Zug! Verwende h, t, l, oder r.");
                    break;
            }

            System.out.println(playerMoveCounter);


            if (playerMoveCounter >= 5) {
                // Schlange bewegt sich in Richtung Spieler
                if ( playerPosition.x < snakePosition.x )
                    snakePosition.x--;
                else if ( playerPosition.x > snakePosition.x )
                    snakePosition.x++;
                if ( playerPosition.y < snakePosition.y )
                    snakePosition.y--;
                else if ( playerPosition.y > snakePosition.y )
                    snakePosition.y++;
            }


        } // end while
    }
}

