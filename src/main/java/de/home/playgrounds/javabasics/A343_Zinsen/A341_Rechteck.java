package de.home.playgrounds.javabasics.A343_Zinsen;

import java.util.Scanner;

public class A341_Rechteck {
    public static void main(String[] args) {
        /*
        Ein Benutzer soll zwei Seitenlängen eines Rechtecks eingeben können.
        Das Programm berechnet den Umfang und die Fläche des Rechtecks und gibt diesen aus.
         */

        Scanner userinput = new Scanner(System.in);;
        int umfang;
        int flaeche;

        int seiteA;
        int seiteB;


        seiteA = userinput.nextInt();

        seiteB = userinput.nextInt();
        flaeche = seiteA * seiteB;
        umfang = (seiteA * 2) + (seiteB * 2);

        System.out.print("SeiteA (in cm): ");
        System.out.print("SeiteB (in cm): ");
        System.out.println("Umfang = " + umfang + " cm ");
        System.out.print("Flaeche = " + flaeche + " cm^2");


    }

}
