package de.home.playgrounds.javabasics.exercise28_NestedStaticClasses;

public class Main {

    public static void main(String[] args) {

        // Sobald du die TODOs in BankAccount.java abgeschlossen hast,
        // sollte dieser Code fehlerfrei laufen und folgende Ausgabe erzeugen:
        //
        // === Kontoauszug für Alice ===
        // Aktuelles Guthaben: 1050.0€
        // --- Transaktionen ---
        // [DEPOSIT] 500.0€ am 2024-01-10
        // [WITHDRAWAL] 200.0€ am 2024-01-12
        // [DEPOSIT] 750.0€ am 2024-01-15
        //
        // (Mit Bonus TODO 5 steht vor jeder Zeile zusätzlich "[NestedBank]")

        BankAccount account = new BankAccount("Alice", 0.0);

        account.deposit(500.0, "2024-01-10");
        account.withdraw(200.0, "2024-01-12");
        account.deposit(750.0, "2024-01-15");

        account.printStatement();

        // =========================================================
        // TODO 6 (Denk-Aufgabe, kein Code nötig):
        //
        // Versuche folgendes direkt hier in main() zu schreiben:
        //   BankAccount.Transaction t = new BankAccount.Transaction(100.0, "TEST", "2024-01-01");
        //   System.out.println(t.getSummary());
        //
        // Funktioniert das? Warum – und was zeigt dir das über den
        // Unterschied zur normalen (Top-Level) Klasse und zur Inner Class?
        // =========================================================
    }
}
