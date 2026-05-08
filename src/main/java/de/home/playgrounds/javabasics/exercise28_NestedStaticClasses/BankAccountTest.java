package de.home.playgrounds.javabasics.exercise28_NestedStaticClasses;

public class BankAccountTest {

    public static void main(String[] args) {
        int passed = 0;
        int failed = 0;

        // Test 1: Guthaben nach Einzahlung
        {
            BankAccount acc = new BankAccount("Test", 0.0);
            acc.deposit(300.0, "2024-01-01");
            if (acc.getBalance() == 300.0) {
                System.out.println("[OK] Test 1: deposit erhöht Guthaben korrekt");
                passed++;
            } else {
                System.out.println("[FAIL] Test 1: Guthaben nach deposit falsch. Erwartet: 300.0, War: " + acc.getBalance());
                failed++;
            }
        }

        // Test 2: Guthaben nach Abhebung
        {
            BankAccount acc = new BankAccount("Test", 500.0);
            acc.withdraw(150.0, "2024-01-02");
            if (acc.getBalance() == 350.0) {
                System.out.println("[OK] Test 2: withdraw reduziert Guthaben korrekt");
                passed++;
            } else {
                System.out.println("[FAIL] Test 2: Guthaben nach withdraw falsch. Erwartet: 350.0, War: " + acc.getBalance());
                failed++;
            }
        }

        // Test 3: Überziehung wird abgelehnt
        {
            BankAccount acc = new BankAccount("Test", 100.0);
            acc.withdraw(200.0, "2024-01-03");
            if (acc.getBalance() == 100.0) {
                System.out.println("[OK] Test 3: Überziehung wird korrekt verhindert");
                passed++;
            } else {
                System.out.println("[FAIL] Test 3: Überziehung sollte abgelehnt werden. Guthaben war: " + acc.getBalance());
                failed++;
            }
        }

        // Test 4: Transaction direkt instanziieren (ohne BankAccount-Objekt)
        // → Das ist der Kerntest für Static Nested Class
        {
            try {
                BankAccount.Transaction t = new BankAccount.Transaction(200.0, "DEPOSIT", "2024-01-04");
                String summary = t.getSummary();
                if (summary != null && summary.contains("DEPOSIT") && summary.contains("200.0")) {
                    System.out.println("[OK] Test 4: Transaction ist direkt instanziierbar und getSummary() funktioniert");
                    passed++;
                } else {
                    System.out.println("[FAIL] Test 4: getSummary() gibt unerwartetes Format zurück: " + summary);
                    failed++;
                }
            } catch (Exception e) {
                System.out.println("[FAIL] Test 4: Fehler beim Instanziieren von Transaction: " + e.getMessage());
                failed++;
            }
        }

        // Test 5: Mehrere Transaktionen werden gespeichert (kein Crash)
        {
            try {
                BankAccount acc = new BankAccount("Test", 1000.0);
                acc.deposit(100.0, "2024-01-05");
                acc.withdraw(50.0, "2024-01-06");
                acc.deposit(200.0, "2024-01-07");
                acc.printStatement();
                System.out.println("[OK] Test 5: printStatement() läuft ohne Fehler durch");
                passed++;
            } catch (Exception e) {
                System.out.println("[FAIL] Test 5: Exception in printStatement(): " + e.getMessage());
                failed++;
            }
        }

        System.out.println("\n--- Ergebnis: " + passed + " bestanden, " + failed + " fehlgeschlagen ---");
    }
}
