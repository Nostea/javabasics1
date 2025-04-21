package de.home.playgrounds.javabasics.exercise6_vererbungBankAccount;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount bankAccount1 = new BankAccount(1234,5000.0,AccountStatus.ACTIVE);

        System.out.println("Type in AccountStatus:");
        String userInput = scanner.nextLine();

        System.out.println("DAVOR: " + bankAccount1.getAccountStatus());
        bankAccount1.setAccountStatus(userInput);
        System.out.println("DANACH: " + bankAccount1.getAccountStatus());
    }
}
