package de.home.playgrounds.javabasics.A343_Zinsen;

import java.util.Scanner;

public class A343_Zinsen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Einzahlung in Euro: ");
        double einzahlung = scanner.nextDouble();

        System.out.print("Zinsen in Prozent: ");
        double zinsen = scanner.nextDouble();

        System.out.print("Jahre: ");
        double jahre = scanner.nextDouble();

        double zinsErtrag = einzahlung + (einzahlung * zinsen / 100 * jahre);
        double zinsesZins = einzahlung * (Math.pow(1 + zinsen / 100, jahre));

        System.out.println();
        System.out.println("Der Investor hat insgesamt " + zinsErtrag + " Euro erhalten");
        System.out.println("Der Investor hat insgesamt " + zinsesZins + " Euro erhalten (mit Zinseszins)");
    }
}



