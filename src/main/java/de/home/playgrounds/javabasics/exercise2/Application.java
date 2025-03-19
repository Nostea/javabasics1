package de.home.playgrounds.javabasics.exercise2;

public class Application {

    public static void main(String[] args) {

        Customer jennie = new Customer(18,"Jennie", "female", 0, "Long Bob", false, "blonde");
        Customer chris = new Customer(30,"Chris", "male", 100, "Short Wavy", false, "blonde");

        jennie.visitSalon();

        jennie.getHaircut("Hime Cut");
        jennie.doHairdamage();

        chris.visitSalon();
        chris.getHaircut("Side Part");

        System.out.println("The logger tracked " + TransactionLogger.getLogMessageCounter() + " transactions");
    }

}
