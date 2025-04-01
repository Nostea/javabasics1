package de.home.playgrounds.javabasics.example2_NullPointerException_and_Reference;


import java.awt.*;

public class Reference {
    public static void main(String[] args) {
        Point p = new Point();
    // Verweisen zwei Objektvariablen auf dasselbe Objekt = über zwei Wege können Objektzustände ausgelesen und modifiziert werden
        Point q = p;
        p.x = 10;
        System.out.println( q.x ); // 10
        q.y = 5;
        System.out.println( p.y ); // 5
    }
}
