package de.home.playgrounds.javabasics.example1_ObjectsStates;

import java.awt.*;

public class Distances {
    public static void main(String[] args) {

            java.awt.Point player = new java.awt.Point();
            player.setLocation( 10, 10 );

            java.awt.Point door = new java.awt.Point();
            door.setLocation( 10, 10 );

            java.awt.Point snake = new java.awt.Point();
            snake.setLocation( 20, 10 );

            System.out.println( player.distance( door ) );             // 0.0
            System.out.println( player.distance( snake ) );            // 10.0
            System.out.println( player.distance( snake.x, snake.y ) ); // 10.0


        // 3 Arten punkte zu erstellen.
        Point po = new Point();
        po.setLocation(1,2);

        Point qu = new Point(1,2);
        Point r = new Point(qu);

    }
}
