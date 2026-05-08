# Übungsprojekt – BankAccount & Static Nested Class

## Szenario
 Du baust eine `BankAccount`-Klasse. Kontobewegungen werden als `Transaction`-Objekte gespeichert – aber `Transaction` macht außerhalb eines Bankkontos keinen Sinn. Perfekter Anwendungsfall für eine Static Nested Class.

## Dateien

```
banking/
└── src/
    ├── BankAccount.java   ← Hauptarbeit hier
    ├── Main.java          ← Manueller Test
    └── BankAccountTest.java ← Automatische Tests
```

## Aufgaben

- [ ] **TODO 1** – `Transaction` als Static Nested Class in `BankAccount` definieren
- [ ] **TODO 2** – In `deposit()` eine `Transaction`-Instanz anlegen und speichern
- [ ] **TODO 3** – In `withdraw()` eine `Transaction`-Instanz anlegen und speichern
- [ ] **TODO 4** – In `printStatement()` alle Transaktionen ausgeben
- [ ] **TODO 5** *(Bonus)* – Auf `private static BANK_NAME` aus der Nested Class zugreifen
- [ ] **TODO 6** *(Denk-Aufgabe)* – `Transaction` direkt in `main()` instanziieren und erklären warum das geht

## Konzepte, die du dabei anwendest

| Konzept | Wo |
|---|---|
| Static Nested Class definieren | TODO 1 |
| Instanziierung ohne äußeres Objekt | TODO 2, 3, TODO 6 |
| Zugriff auf `private static` von außen | TODO 5 |
| Konzeptuelle Zugehörigkeit ausdrücken | Gesamtstruktur |

## Erwartete Ausgabe (Main.java)

```
=== Kontoauszug für Alice ===
Aktuelles Guthaben: 1050.0€
--- Transaktionen ---
[DEPOSIT] 500.0€ am 2024-01-10
[WITHDRAWAL] 200.0€ am 2024-01-12
[DEPOSIT] 750.0€ am 2024-01-15
```

## Tests ausführen

```bash
cd banking/src
javac BankAccount.java BankAccountTest.java
java BankAccountTest
```

## Reflexionsfragen nach dem Lösen

> [!question] Frage 1:
> Warum ist `Transaction` hier `static` und keine Inner Class? Was würde sich ändern, wenn du `static` entfernst?

> [!question] Frage 2:
> Könntest du `Transaction` in `BankAccountTest.java` auch als `new Transaction(...)` schreiben (ohne `BankAccount.`-Prefix)? Warum (nicht)?

> [!question] Frage 3:
> Stell dir vor, eine andere Klasse `CryptoWallet` braucht ebenfalls eine `Transaction`. Was würdest du jetzt anders designen?

