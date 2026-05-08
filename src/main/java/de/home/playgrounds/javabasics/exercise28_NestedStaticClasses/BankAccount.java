package de.home.playgrounds.javabasics.exercise28_NestedStaticClasses;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private final String owner;
    private double balance;
    private final List<Transaction> transactions = new ArrayList<>();
    private static final String BANK_NAME = "NestedBank";

    /* =========================================================
    // TODO 1: Definiere hier eine Static Nested Class "Transaction"
    //
    // Sie soll folgende Felder haben:
    //   - double amount
    //   - String type     (z.B. "DEPOSIT" oder "WITHDRAWAL")
    //   - String date
    //
    // Außerdem:
    //   - einen Konstruktor, der alle drei Felder setzt
    //   - eine Methode getSummary(), die einen String zurückgibt:
    //     "[type] amount€ am date"
    //     Beispiel: "[DEPOSIT] 200.0€ am 2024-01-15"
    //
    // Frage zum Nachdenken: Warum macht "static" hier Sinn?
    // Braucht eine Transaction wirklich ein BankAccount-Objekt,
    // um zu existieren?
    //
    //
    //Ich finde static macht hier keinen Sinn, weil es zuerst eine Instanz eines Bankaccount geben muss, damit auch eine Transaktion ausgeführt werden kann.
    //
    // Semantisch entsteht eine Transaktion typischerweise für ein Konto.
    // Aber Technisch: Nicht zwangsweise wird ein Bankaccount gebraucht, damit eine Transaktion existiert
     ========================================================= */

    public static class Transaction {
        private double amount;
        private String type;
        private String date;

        public Transaction(double amount, String type, String date) {
            this.amount = amount;
            this.type = type;
            this.date = date;
        }

        public String getSummary() {
            String response = BANK_NAME + " " + this.type + " " + this.amount + "€ am " + this.date;
            return response;
        }

    }


    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(double amount, String date) {
        balance += amount;

        // TODO 2: Erstelle hier eine neue Transaction-Instanz (DEPOSIT)
        // und füge sie der transactions-Liste hinzu.
        //
        // Denk daran: Wie instanziiert man eine Static Nested Class?
        // Brauchst du ein BankAccount-Objekt dafür?

        // kein BankAccount Objekt gebraucht, weil static

        BankAccount.Transaction transaction1 = new Transaction(amount, "DEPOSIT", date);
        transactions.add(transaction1);

    }

    public void withdraw(double amount, String date) {
        if (amount > balance) {
            System.out.println("Fehler: Nicht genug Guthaben.");
            return;
        }
        balance -= amount;

        // TODO 3: Erstelle hier eine neue Transaction-Instanz (WITHDRAWAL)
        // und füge sie der transactions-Liste hinzu.

        BankAccount.Transaction transaction2 = new BankAccount.Transaction(amount, "WITHDRAWAL", date);
        transactions.add(transaction2);
    }

    public void printStatement() {
        System.out.println("=== Kontoauszug für " + owner + " ===");
        System.out.println("Aktuelles Guthaben: " + balance + "€");
        System.out.println("--- Transaktionen ---");

        // TODO 4: Iteriere über alle transactions und gib für jede
        // getSummary() aus.
        //
        // Tipp: for-each-Schleife über this.transactions

        for(Transaction transaction : this.transactions) {
            System.out.println(transaction.getSummary());
        }
    }

    public double getBalance() {
        return balance;
    }


    // =========================================================
    // TODO 5 (Bonus): Füge ein privates statisches Feld hinzu:
    //   private static final String BANK_NAME = "NestedBank";
    //
    // Greife dann in getSummary() innerhalb von Transaction
    // auf BANK_NAME zu und ergänze es im Ausgabestring:
    //   "[NestedBank] [DEPOSIT] 200.0€ am 2024-01-15"
    //
    // Frage: Warum kann Transaction auf dieses private Feld zugreifen,
    // obwohl es private ist? Was sagt dir das über Static Nested Classes?
    // =========================================================
}
