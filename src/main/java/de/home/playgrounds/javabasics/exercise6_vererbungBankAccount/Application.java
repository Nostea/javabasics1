package de.home.playgrounds.javabasics.exercise6_vererbungBankAccount;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Address address1 = new Address("Schmungusstreet","12","17444", Country.GERMANY);
        Customer customer1 = new Customer("Emily","Schmungus","emily@mail.de", "+49122287624", address1);
        BankAccount bankAccount1 = new SavingsAccount(3020.5,AccountStatus.ACTIVE,0.02);
        BankAccount bankAccount2 = new CheckingAccount(12040.75,AccountStatus.ACTIVE,0.10);

        BankAccount savingacc1 = new SavingsAccount(100.4,AccountStatus.ACTIVE,0.02);

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in AccountStatus:");
        String userInput = scanner.nextLine();
        */
        customer1.printCustomerInfo();
        customer1.openNewSavingAccount(bankAccount1);
        customer1.openNewCheckingAccount(bankAccount2);
        customer1.openNewSavingAccount(savingacc1);
        customer1.listAllBankAccounts();

        System.out.println("---");

    }
}
