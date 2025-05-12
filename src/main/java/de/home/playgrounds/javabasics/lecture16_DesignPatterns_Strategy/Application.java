package de.home.playgrounds.javabasics.lecture16_DesignPatterns_Strategy;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paymentMethodString = sc.nextLine();
        PaymentMethod paymentMethod = null;
        if (paymentMethodString.equals("CASH")) {
            paymentMethod = PaymentMethod.CASH;
        } else {
            paymentMethod = PaymentMethod.CREDIT_CARD;
        }

        if (paymentMethod == PaymentMethod.CASH) {
            System.out.println("dann bitte die Scheine her");
            System.out.println("ok, hier hamse");
            System.out.println("ihr rückgeld könn se sich sparen hihi");
            System.out.println("Ciao bella");
        } else {
            System.out.println("Bitte sagen Sie Ihre PIN ganz laut!");
            System.out.println("EINS EINS EINS EINS");
            System.out.println("Ihre pin war leider falsch");
            System.out.println("Stimmt. EINS ZWEI DREI VIER");
            System.out.println("Pin korrekt, Sie sind nun frei zu gehen");
            System.out.println("Ciao bella");
        }

        String paymentMethod2 = sc.nextLine();
        PaymentStrategy paymentStrategy = null;
        if (paymentMethod2.equals("CASH")) {
            paymentStrategy = new CashPaymentStrategy();
        } else if (paymentMethod2.equals("CREDIT_CARD")) {
            paymentStrategy = new CreditCardPaymentStrategy();
        } else if (paymentMethod2.equals("I_RUN")) {
            paymentStrategy = new ThiefPaymentStrategy();
        } else {
            paymentStrategy = new CreditCardPaymentStrategy();
        }
        paymentStrategy.pay();
    }
}
