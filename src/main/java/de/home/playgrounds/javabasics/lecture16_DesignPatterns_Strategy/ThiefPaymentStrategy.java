package de.home.playgrounds.javabasics.lecture16_DesignPatterns_Strategy;

public class ThiefPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Ich bin ein Dieb und renne einfach Weg");
        System.out.println("SICHERHEITSDIEEEEENST");
        System.out.println("(Erzähler) Da bei Penny eingekauft, gibts den nicht und der Dieb entkommt.");
    }
}
