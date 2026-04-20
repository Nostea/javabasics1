# Lösungsblatt 4 – Kombinierte Aufgaben

---

## Aufgabe 1 — Array filtern

```java
public class ArrayFiltern {
    public static void main(String[] args) {
        int[] zahlen = {-5, 3, -1, 8, 0, -4, 12, 7};

        for (int z : zahlen) {
            if (z > 0) {
                System.out.print(z + " ");
            }
        }
    }
}
// Ausgabe: 3 8 12 7
```

---

## Aufgabe 2 — Codeanalyse: Was wird ausgegeben?

**Lösung: A) `2`**

Gezählt werden Werte > 3: `5` und `8` → Zähler = 2

---

## Aufgabe 3 — Celsius zu Fahrenheit

```java
public class Temperaturtabelle {
    public static void main(String[] args) {
        for (int c = 0; c <= 100; c += 10) {
            double f = c * 9.0 / 5 + 32;
            System.out.printf("%3d°C = %5.1f°F%n", c, f);
        }
    }
}
```

---

## Aufgabe 4 — Fehler finden

**Lösung: B)**

`farben.length` ist `3`, gültige Indizes sind 0, 1, 2. Die Bedingung `i <= farben.length` erlaubt `i = 3`, was zu `farben[3]` → `ArrayIndexOutOfBoundsException` führt.

Fix: `i < farben.length`

---

## Aufgabe 5 — Negativen Wert ersetzen

```java
public class NegativErsetzen {
    public static void main(String[] args) {
        int[] temperaturen = {4, -2, 7, -5, 3, -1, 9};

        for (int i = 0; i < temperaturen.length; i++) {
            if (temperaturen[i] < 0) {
                temperaturen[i] = 0;
            }
        }

        for (int t : temperaturen) {
            System.out.print(t + " ");
        }
        // Ausgabe: 4 0 7 0 3 0 9
    }
}
```

---

## Aufgabe 6 — PAP lesen

**Lösung: B) Die Anzahl der geraden Zahlen im Array**

`treffer` wird für jeden Arraywert erhöht, bei dem `wert % 2 == 0` gilt — das ist die Definition einer geraden Zahl.

---

## Aufgabe 7 — Code kommentieren

```java
int[] preise = {120, 45, 200, 30, 89};
double summe = 0;

for (int preis : preise) {    // Iteriert über alle Preise im Array
    if (preis > 100) {         // Prüft ob Artikel teurer als 100€ ist
        summe += preis * 0.9;  // 10% Rabatt gewähren (Multiplikation mit 0.9)
    } else {
        summe += preis;        // Kein Rabatt — Preis wird direkt addiert
    }
}

System.out.printf("Gesamtbetrag: %.2f€%n", summe);  // Gesamtbetrag mit 2 Nachkommastellen ausgeben
```

---

## Aufgabe 8 — Geradzahlen-Summe

```java
public class GeradzahlenSumme {
    public static void main(String[] args) {
        int summe = 0;
        for (int i = 2; i <= 50; i += 2) {
            summe += i;
        }
        System.out.println("Summe: " + summe);  // 650
    }
}
```

---

## Aufgabe 9 — Noten auswerten

```java
import java.util.Scanner;

public class NotenAuswertung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] noten = new int[5];

        for (int i = 0; i < noten.length; i++) {
            System.out.print("Note " + (i + 1) + ": ");
            noten[i] = sc.nextInt();
        }

        int summe = 0;
        int beste = noten[0];

        for (int note : noten) {
            summe += note;
            if (note < beste) {
                beste = note;
            }
        }

        double durchschnitt = (double) summe / noten.length;

        System.out.printf("Durchschnitt: %.2f%n", durchschnitt);
        System.out.println("Beste Note: " + beste);

        if (durchschnitt <= 4.0) {
            System.out.println("Bestanden!");
        } else {
            System.out.println("Nicht bestanden.");
        }
    }
}
```

---

## Aufgabe 10 — Häufigkeit zählen

```java
public class Haeufigkeit {
    public static void main(String[] args) {
        int[] wuerfe = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] zaehler = new int[10];  // Index 1–9 genutzt

        for (int w : wuerfe) {
            zaehler[w]++;
        }

        for (int i = 1; i <= 9; i++) {
            System.out.println(i + ": " + zaehler[i] + "x");
        }
    }
}
```

---

## Aufgabe 11 — PAP: Summe bis -1

```
        ┌──────────────────┐
        │      START       │
        └────────┬─────────┘
                 ▼
        ┌──────────────────┐
        │   summe = 0      │
        └────────┬─────────┘
                 ▼
        ┌──────────────────┐
        │  Lies zahl       │
        └────────┬─────────┘
                 ▼
        ◇  zahl == -1 ?
       /                \
     Ja                 Nein
      ▼                   ▼
┌──────────────┐   ┌──────────────────┐
│ Ausgabe summe│   │ summe += zahl    │
└──────┬───────┘   └────────┬─────────┘
       ▼                    ▼
     ENDE            Lies zahl (erneut)
                            │
                            └──► (zurück zu zahl == -1 ?)
```

---

## Aufgabe 12 — Codeanalyse: Semantischen Fehler

**Lösung: B)**

Bei Schulnoten ist Note `1` die Beste, Note `6` die Schlechteste. `beste` ist mit `0` initialisiert, und die Bedingung `note > beste` sucht den **größten** Wert — das ist die schlechteste Note, nicht die beste.

Korrektur: `beste` mit `noten[0]` initialisieren und `note < beste` als Bedingung verwenden.

---

## Aufgabe 13 — FizzBuzz

```java
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
```

---

## Aufgabe 14 — PC-Händler Rechnungssystem

```java
import java.util.Scanner;

public class PCHaendler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] artikel   = new String[10];
        int[]    anzahl    = new int[10];
        double[] netto     = new double[10];
        double[] mwst      = new double[10];
        int count = 0;

        while (count < 10) {
            System.out.print("Artikel (oder 'stop'): ");
            String name = sc.next();
            if (name.equals("stop")) break;

            artikel[count] = name;
            System.out.print("Anzahl: ");
            anzahl[count] = sc.nextInt();
            System.out.print("Nettopreis pro Stück: ");
            netto[count] = sc.nextDouble();
            System.out.print("MwSt in %: ");
            mwst[count] = sc.nextDouble();
            count++;
        }

        System.out.println("\n=== Rechnung ===");
        double nettoSumme = 0;
        double bruttoSumme = 0;

        for (int i = 0; i < count; i++) {
            double nettoGes = anzahl[i] * netto[i];
            double bruttoGes = nettoGes * (1 + mwst[i] / 100);
            System.out.printf("%-15s %3dx  Netto: %8.2f€  Brutto: %8.2f€ (%.0f%% MwSt)%n",
                artikel[i], anzahl[i], nettoGes, bruttoGes, mwst[i]);
            nettoSumme  += nettoGes;
            bruttoSumme += bruttoGes;
        }

        System.out.println("---");
        System.out.printf("Nettosumme:   %8.2f€%n", nettoSumme);
        System.out.printf("Bruttosumme:  %8.2f€%n", bruttoSumme);
    }
}
```

---

## Aufgabe 15 — EAN-Prüfziffer

**a) Coding:**

```java
public class EANPruefung {

    public static boolean pruefeEAN(String ean) {
        if (ean.length() != 13) return false;

        int summe = 0;
        for (int i = 0; i < 12; i++) {
            int ziffer = Integer.parseInt(String.valueOf(ean.charAt(i)));
            if (i % 2 == 0) {
                summe += ziffer;       // ungerade Position (0-basiert): Faktor 1
            } else {
                summe += ziffer * 3;   // gerade Position (0-basiert): Faktor 3
            }
        }

        int berechneteZiffer = (10 - (summe % 10)) % 10;
        int gegebeneZiffer = Integer.parseInt(String.valueOf(ean.charAt(12)));

        return berechneteZiffer == gegebeneZiffer;
    }

    public static void main(String[] args) {
        String ean1 = "9783815820865";
        String ean2 = "1234567890121";

        System.out.println(ean1 + ": " + (pruefeEAN(ean1) ? "Gültig" : "Ungültig"));
        System.out.println(ean2 + ": " + (pruefeEAN(ean2) ? "Gültig" : "Ungültig"));
    }
}
```

**b) Codeanalyse:**

**Lösung: B)**

`ean.charAt(i)` gibt ein `char` zurück (z. B. `'9'`). `Integer.parseInt()` erwartet einen `String`, kein `char`. `String.valueOf(char)` konvertiert das einzelne Zeichen in einen einzeichigen String (`"9"`), der dann korrekt zu `9` geparst werden kann.

Ohne `String.valueOf()` würde `parseInt((char) '9')` nicht kompilieren, da `parseInt` keinen `char`-Parameter akzeptiert.
