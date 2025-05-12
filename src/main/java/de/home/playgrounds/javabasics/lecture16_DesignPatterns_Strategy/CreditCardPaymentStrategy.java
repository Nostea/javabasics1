package de.home.playgrounds.javabasics.lecture16_DesignPatterns_Strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Bitte sagen Sie Ihre PIN ganz laut!");
        System.out.println("EINS EINS EINS EINS");
        System.out.println("Ihre pin war leider falsch");
        System.out.println("Stimmt. EINS ZWEI DREI VIER");
        System.out.println("Pin korrekt, Sie sind nun frei zu gehen");
        System.out.println("Ciao bella");
    }
}
