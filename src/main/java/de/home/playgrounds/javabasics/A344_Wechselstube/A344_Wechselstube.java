package de.home.playgrounds.javabasics.A344_Wechselstube;

import java.util.Scanner;

public class A344_Wechselstube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie viel Euro haben Sie? ");
        int moneyEuro = scanner.nextInt();
        System.out.print("Wie viel Cent haben Sie? ");
        int moneyCent = scanner.nextInt();

        //euro = 100cent

        int money = moneyEuro * 100 + moneyCent;
        int cent = money;

        int zweiEuro = money / 200;
        money = money % 200;

        int einEuro = money / 100;
        money = money % 100;

        int fuenfzigCent = money / 50;
        money = money % 50;

        int zwanzigCent = money / 20;
        money = money % 20;

        int zehnCent = money / 10;
        money = money % 10;

        int fuenfCent = money / 5;
        money = money % 5;

        int zweiCent = money / 2;
        money = money % 2;

        int rest = money / 1;
        money = money % 1;

        // Passende Ausgaben
        System.out.println();
        System.out.println("Sie bekommen " + cent + " Cent als:");
        System.out.println(zweiEuro + " 2-Euro");
        System.out.println(einEuro + " 1-Euro");
        System.out.println(fuenfzigCent + " 50-Cent");
        System.out.println(zwanzigCent + " 20-Cent");
        System.out.println(zehnCent + " 10-Cent");
        System.out.println(fuenfCent + " 5-Cent");
        System.out.println(zweiCent + " 2-Cent");
        System.out.println(rest + " 1-Cent");
        System.out.println();
    }
}
