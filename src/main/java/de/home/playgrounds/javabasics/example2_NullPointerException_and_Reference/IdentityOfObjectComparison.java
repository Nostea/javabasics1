package de.home.playgrounds.javabasics.example2_NullPointerException_and_Reference;

import java.awt.*;

public class IdentityOfObjectComparison {

    public static void main(String[] args) {

        /*
        == testet bei Referenzen ob sie übereinstimmen, das heißt: auf dasselbe Objekt verweisen.
        p und q sind dasselbe Point objekt, r ist ein anderes Objekt des typs Point

        es geht bei Referenztypen beim == Vergleich darum ob es um dieselbe Referenz geht.
        Die Werte vergleicht man, indem auf die werte spezifisch zugegriffen wird, zB p.x p.y  und r.x r.y
         */
        Point p = new Point( 10, 10 );
        Point q = p;
        Point r = new Point( 10, 10 );
        System.out.println( p == q ); // true, da p und q dasselbe Objekt referenzieren
        System.out.println( p == r ); // false, da p und r zwei verschiedene Punkt-

        // Objekte referenzieren, die zufällig dieselben

        // Koordinaten haben
    }
}
