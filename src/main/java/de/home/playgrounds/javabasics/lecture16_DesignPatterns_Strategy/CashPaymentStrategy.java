package de.home.playgrounds.javabasics.lecture16_DesignPatterns_Strategy;

public class CashPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("dann bitte die Scheine her");
        System.out.println("ok, hier hamse");
        System.out.println("ihr rückgeld könn se sich sparen hihi");
        System.out.println("Ciao bella");
    }
}
