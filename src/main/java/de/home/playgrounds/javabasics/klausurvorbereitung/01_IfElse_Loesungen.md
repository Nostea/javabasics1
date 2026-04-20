# Lösungsblatt 1 – if / else / switch

---

## Aufgabe 1 — Vorzeichen bestimmen

```java
import java.util.Scanner;

public class Vorzeichen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zahl eingeben: ");
        int zahl = sc.nextInt();

        if (zahl > 0) {
            System.out.println("Die Zahl ist positiv.");
        } else if (zahl < 0) {
            System.out.println("Die Zahl ist negativ.");
        } else {
            System.out.println("Die Zahl ist null.");
        }
    }
}
```

---

## Aufgabe 2 — Gerade oder ungerade

```java
import java.util.Scanner;

public class GeradeUngerade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zahl eingeben: ");
        int zahl = sc.nextInt();

        if (zahl % 2 == 0) {
            System.out.println("Die Zahl ist gerade.");
        } else {
            System.out.println("Die Zahl ist ungerade.");
        }
    }
}
```

---

## Aufgabe 3 — Codeanalyse: Was gibt das Programm aus?

**Lösung: B) `B`**

Begründung:
- `10 % 3 = 1` → Bedingung `x % y == 1` ist **wahr** → Ausgabe `"A"`

> **Achtung:** Die Antwort ist **A**, nicht B!  
> `10 % 3 = 1` ist `true`, also wird sofort `"A"` ausgegeben. Die zweite Bedingung wird gar nicht geprüft.

**Korrekte Antwort: A) `A`**

---

## Aufgabe 4 — Mindestalter

```java
import java.util.Scanner;

public class Mindestalter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Alter eingeben: ");
        int alter = sc.nextInt();

        if (alter >= 18) {
            System.out.println("Zutritt erlaubt");
        } else {
            System.out.println("Zutritt verweigert");
        }
    }
}
```

---

## Aufgabe 5 — Fehler finden

**Korrekte Antworten: A und B**

- **A) Syntaktischer Fehler:** `if alter >= 18` → korrekt wäre `if (alter >= 18)` — die Klammern um die Bedingung fehlen.
- **B) Semantischer Fehler:** `alter = 17` ist eine Zuweisung (`=`), kein Vergleich (`==`). Korrekt: `alter == 17`.
- C) falsch — `else if` ist gültig in Java.
- D) falsch — `System.out.println` ist korrekt.

---

## Aufgabe 6 — Notenstufe per switch

```java
import java.util.Scanner;

public class Notenstufe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Note (1-6): ");
        int note = sc.nextInt();

        switch (note) {
            case 1: System.out.println("Sehr gut"); break;
            case 2: System.out.println("Gut"); break;
            case 3: System.out.println("Befriedigend"); break;
            case 4: System.out.println("Ausreichend"); break;
            case 5: System.out.println("Mangelhaft"); break;
            case 6: System.out.println("Ungenügend"); break;
            default: System.out.println("Ungültige Note");
        }
    }
}
```

---

## Aufgabe 7 — PAP lesen

**Lösung: C) `null`**

Begründung: Eingabe `0` → `0 > 0` ist `false` → zweite Raute: `0 == 0` ist `true` → Ausgabe `"null"`.

---

## Aufgabe 8 — Code kommentieren

```java
Scanner sc = new Scanner(System.in);
System.out.print("Temperatur: ");
double temp = sc.nextDouble();   // Liest eine Kommazahl (Temperatur) vom Benutzer ein

if (temp < 0) {                  // Prüft, ob die Temperatur unter 0 liegt (Frost)
    System.out.println("Frost");
} else if (temp < 20) {          // Temperatur zwischen 0 und 19: kühl
    System.out.println("Kühl");
} else {                         // Alle anderen Fälle: Temperatur >= 20
    System.out.println("Warm");
}
```

---

## Aufgabe 9 — Rabattsystem

```java
import java.util.Scanner;

public class Rabatt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bestellwert in €: ");
        double bestellwert = sc.nextDouble();

        double rabatt = 0.0;

        if (bestellwert <= 50) {
            rabatt = 0.0;
        } else if (bestellwert <= 100) {
            rabatt = 0.05;
        } else if (bestellwert <= 500) {
            rabatt = 0.10;
        } else {
            rabatt = 0.15;
        }

        double endpreis = bestellwert * (1 - rabatt);
        System.out.printf("Endpreis: %.2f€%n", endpreis);
    }
}
```

---

## Aufgabe 10 — PAP zeichnen

```
        ┌──────────────┐
        │    START     │
        └──────┬───────┘
               ▼
        ┌──────────────┐
        │  Lies a, b   │
        └──────┬───────┘
               ▼
          ◇ a > b ?
         /         \
       Ja           Nein
        ▼             ▼
  Ausgabe a      ◇ a == b ?
                /         \
              Ja           Nein
               ▼             ▼
         "Gleich"       Ausgabe b
               \         /
                ▼       ▼
           ┌──────────────┐
           │    ENDE      │
           └──────────────┘
```

---

## Aufgabe 11 — Ampelsteuerung per switch

```java
import java.util.Scanner;

public class Ampel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Farbe (rot/gelb/gruen): ");
        String farbe = sc.next();

        switch (farbe) {
            case "rot":   System.out.println("Halt!"); break;
            case "gelb":  System.out.println("Achtung!"); break;
            case "gruen": System.out.println("Fahren!"); break;
            default:      System.out.println("Unbekannte Farbe");
        }
    }
}
```

---

## Aufgabe 12 — Semantischen Fehler finden

**Lösung: B)**

Das Problem: Für `preis = 120.0` sind **beide** `if`-Bedingungen wahr (`120 > 100` und `120 > 50`). Da es zwei separate `if`-Anweisungen sind (kein `else if`), wird `rabatt` zuerst auf `0.1` gesetzt und dann sofort auf `0.05` **überschrieben**. Der höhere Rabatt von 10 % wird nicht angewandt.

**Fix:** Die zweite Bedingung muss `else if` sein, oder die Reihenfolge muss umgekehrt werden (höchster Wert zuerst prüfen).

---

## Aufgabe 13 — BMI-Berechnung

```java
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Größe in cm: ");
        double groesseInCm = sc.nextDouble();

        System.out.print("Gewicht in kg: ");
        double gewichtInKg = sc.nextDouble();

        double groesseInM = groesseInCm / 100.0;
        double bmi = gewichtInKg / (groesseInM * groesseInM);

        System.out.printf("Ihr BMI: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Untergewicht");
        } else if (bmi < 25) {
            System.out.println("Normalgewicht");
        } else {
            System.out.println("Übergewicht");
        }
    }
}
```

---

## Aufgabe 14 — Schaltjahr vollständig

**a) PAP:**

```
           ┌──────────────┐
           │    START     │
           └──────┬───────┘
                  ▼
           ┌──────────────┐
           │  Lies jahr   │
           └──────┬───────┘
                  ▼
          ◇ jahr % 4 == 0 ?
         /                  \
       Ja                   Nein
        ▼                     ▼
◇ jahr % 100 == 0 ?     "Kein Schaltjahr"
   /           \
 Ja            Nein
  ▼               ▼
◇ jahr % 400 == 0 ?   "Schaltjahr"
  /              \
Ja               Nein
 ▼                 ▼
"Schaltjahr"  "Kein Schaltjahr"
```

**b) Implementierung:**

```java
public static boolean istSchaltjahr(int jahr) {
    if (jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0)) {
        return true;
    } else {
        return false;
    }
}
```

**c) Testtabelle:**

| Jahr | Erwartet        | Ergebnis        |
|------|-----------------|-----------------|
| 2000 | Schaltjahr      | Schaltjahr ✓    |
| 1900 | Kein Schaltjahr | Kein Schaltjahr ✓ |
| 2024 | Schaltjahr      | Schaltjahr ✓    |
| 2023 | Kein Schaltjahr | Kein Schaltjahr ✓ |

---

## Aufgabe 15 — Währungsrechner mit Menü

```java
import java.util.Scanner;

public class Waehrungsrechner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Währungsrechner ===");
        System.out.println("1 - USD (Dollar)   1 EUR = 1.09 USD");
        System.out.println("2 - GBP (Pfund)    1 EUR = 0.86 GBP");
        System.out.println("3 - JPY (Yen)      1 EUR = 163 JPY");
        System.out.println("0 - Beenden");
        System.out.print("Auswahl: ");
        int auswahl = sc.nextInt();

        if (auswahl == 0) {
            System.out.println("Auf Wiedersehen!");
            return;
        }

        System.out.print("Betrag in Euro: ");
        double euro = sc.nextDouble();

        if (euro < 0) {
            System.out.println("Ungültiger Betrag.");
            return;
        }

        double kurs = 0.0;
        String waehrung = "";

        switch (auswahl) {
            case 1: kurs = 1.09; waehrung = "USD"; break;
            case 2: kurs = 0.86; waehrung = "GBP"; break;
            case 3: kurs = 163;  waehrung = "JPY"; break;
            default:
                System.out.println("Ungültige Auswahl.");
                return;
        }

        double ergebnis = euro * kurs;
        System.out.printf("%.2f EUR = %.2f %s%n", euro, ergebnis, waehrung);
    }
}
```
