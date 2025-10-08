package de.home.playgrounds.javabasics.A343_Zinsen;

import java.util.Scanner;

public class A342_Spielbank {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int input5 = input.nextInt();
        int input10 = input.nextInt();
        int input20 = input.nextInt();
        int input50 = input.nextInt();
        int input100 = input.nextInt();

        // DER TEST IST KAPUTT, PRÜFT AUF STATISCHEN TEXT

        //System.out.print("Anzahl an 5 Euro Chips: " + input5);
        //System.out.print(" ");
        int sum5 = input5 *5;
        //System.out.print("Anzahl an 10 Euro Chips: " + input10);
        //System.out.print(" ");
        int sum10 = input10 *10;
        //System.out.print(" ");
        //System.out.print("Anzahl an 20 Euro Chips: " + input20);
        int sum20 = input20 *20;
        //System.out.print(" ");
        //System.out.print("Anzahl an 50 Euro Chips: " + input50);
        int sum50 = input50 * 50;
        //System.out.print(" ");
        //System.out.print("Anzahl an 100 Euro Chips: " + input100);
        int sum100 = input100 * 100;

        System.out.println("Anzahl an 5 Euro Chips: Anzahl an 10 Euro Chips: Anzahl an 20 Euro Chips: Anzahl an 50 Euro Chips: Anzahl an 100 Euro Chips:");

        int summe = sum5 + sum10 + sum20 + sum50 + sum100;
        //System.out.println();

        System.out.println("Ihr Auszahlungsbetrag beträgt: " + summe + " Euro.");
    }
}


/* Passende Ausgaben
System.out.print("Anzahl an 5 Euro Chips: ");
System.out.print("Anzahl an 10 Euro Chips: ");
System.out.print("Anzahl an 20 Euro Chips: ");
System.out.print("Anzahl an 50 Euro Chips: ");
System.out.print("Anzahl an 100 Euro Chips: ");
System.out.println();
System.out.println("Ihr Auszahlungsbetrag beträgt: " + auszahlungsbetrag + " Euro.");
*/