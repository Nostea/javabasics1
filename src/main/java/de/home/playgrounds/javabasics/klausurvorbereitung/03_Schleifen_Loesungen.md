# Lösungsblatt 3 – Schleifen

---

## Aufgabe 1 — Zählen von 1 bis N

```java
import java.util.Scanner;

public class Zaehlen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n eingeben: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
```

---

## Aufgabe 2 — Codeanalyse: Was wird ausgegeben?

**Lösung: A) `10 7 4 1`**

- i=10 → `10 ` ausgeben, i=7
- i=7  → `7 ` ausgeben, i=4
- i=4  → `4 ` ausgeben, i=1
- i=1  → `1 ` ausgeben, i=-2
- i=-2 → Bedingung `i > 0` nicht mehr erfüllt → Ende

---

## Aufgabe 3 — Multiplikationstabelle

```java
import java.util.Scanner;

public class EinMalEins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zahl: ");
        int zahl = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(zahl + " x " + i + " = " + (zahl * i));
        }
    }
}
```

---

## Aufgabe 4 — Fehler finden

**Lösung: C) Die Variable `i` wird nie erhöht — Endlosschleife**

`i` bleibt immer `1`, die Bedingung `i <= 10` ist immer wahr. Der Code führt zu einer Endlosschleife.

Fix: `i++` in der Schleife ergänzen:
```java
while (i <= 10) {
    summe += i;
    i++;
}
```

---

## Aufgabe 5 — Countdown mit do-while

```java
public class Countdown {
    public static void main(String[] args) {
        int i = 5;
        do {
            System.out.println(i);
            i--;
        } while (i >= 0);
        System.out.println("Start!");
    }
}
```

---

## Aufgabe 6 — PAP lesen

**Lösung: C) `55`**

Berechnet wird: `1² + 2² + 3² + 4² + 5² = 1 + 4 + 9 + 16 + 25 = 55`

---

## Aufgabe 7 — Code kommentieren

```java
int n = 5;

for (int i = 1; i <= n; i++) {          // Äußere Schleife: Zeile 1 bis n
    for (int j = 1; j <= i; j++) {      // Innere Schleife: in Zeile i genau i Sterne ausgeben
        System.out.print("* ");          // Gibt einen Stern mit Leerzeichen aus
    }
    System.out.println();                // Zeilenumbruch nach jeder Zeile
}
```

**Ausgabe:**
```
* 
* * 
* * * 
* * * * 
* * * * * 
```

---

## Aufgabe 8 — break und continue

**Lösung: B) `1 3 5`**

- `i=1`: ungerade → nicht übersprungen, nicht 7 → ausgeben: `1`
- `i=2`: gerade → `continue` → übersprungen
- `i=3`: ungerade → ausgeben: `3`
- `i=4`: gerade → `continue`
- `i=5`: ungerade → ausgeben: `5`
- `i=6`: gerade → `continue`
- `i=7`: ungerade, aber `i == 7` → `break` → Schleife endet

---

## Aufgabe 9 — Quersumme

```java
import java.util.Scanner;

public class Quersumme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zahl eingeben: ");
        int zahl = sc.nextInt();

        int quersumme = 0;
        while (zahl > 0) {
            quersumme += zahl % 10;   // letzte Ziffer addieren
            zahl /= 10;               // letzte Ziffer entfernen
        }

        System.out.println("Quersumme: " + quersumme);
    }
}
```

---

## Aufgabe 10 — Eingabe wiederholen (Validierung)

```java
import java.util.Scanner;

public class Passwort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String eingabe;

        do {
            System.out.print("Passwort eingeben: ");
            eingabe = sc.next();
        } while (!eingabe.equals("geheim123"));

        System.out.println("Zugang gewährt!");
    }
}
```

---

## Aufgabe 11 — Rechteck aus Sternchen

```java
import java.util.Scanner;

public class Rechteck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Breite: ");
        int breite = sc.nextInt();
        System.out.print("Höhe: ");
        int hoehe = sc.nextInt();

        for (int zeile = 0; zeile < hoehe; zeile++) {
            for (int spalte = 0; spalte < breite; spalte++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

---

## Aufgabe 12 — PAP: Fakultät

```
        ┌──────────────────┐
        │      START       │
        └────────┬─────────┘
                 ▼
        ┌──────────────────┐
        │   Lies n         │
        └────────┬─────────┘
                 ▼
        ┌──────────────────┐
        │ ergebnis = 1     │
        │ i = 1            │
        └────────┬─────────┘
                 ▼
        ◇  i <= n ?
       /              \
     Ja               Nein
      ▼                 ▼
ergebnis = ergebnis * i   ┌──────────────────┐
      │               │   │ Ausgabe ergebnis │
      ▼               │   └────────┬─────────┘
    i = i + 1         │            ▼
      │               │          ENDE
      └───────────────┘
       (zurück zu i <= n ?)
```

---

## Aufgabe 13 — Codeanalyse: Fehler

**Lösung: B)**

`ergebnis` ist mit `0` initialisiert. Jede Multiplikation mit `0` ergibt `0`: `0 * 1 * 2 * 3 * ... = 0`.

Korrekte Initialisierung: `int ergebnis = 1;`

---

## Aufgabe 14 — Primzahlen in einem Bereich

```java
import java.util.Scanner;

public class PrimzahlBereich {

    public static boolean istPrimzahl(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void gibPrimzahlenAus(int von, int bis) {
        double summe = 0;
        int anzahl = 0;

        int min = Math.min(von, bis);
        int max = Math.max(von, bis);

        System.out.print("Primzahlen: ");
        for (int i = min; i <= max; i++) {
            if (istPrimzahl(i)) {
                System.out.print(i + " ");
                summe += i;
                anzahl++;
            }
        }
        System.out.println();

        if (anzahl > 0) {
            System.out.printf("Durchschnitt: %.2f%n", summe / anzahl);
        } else {
            System.out.println("Keine Primzahlen in diesem Bereich.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Von: ");
        int a = sc.nextInt();
        System.out.print("Bis: ");
        int b = sc.nextInt();

        gibPrimzahlenAus(a, b);
    }
}
```

---

## Aufgabe 15 — Muster ausgeben

**a) Coding:**

```java
public class Zahlendreieck {
    public static void main(String[] args) {
        int n = 5;

        // Aufsteigender Teil (1 bis n)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Absteigender Teil (n-1 bis 1)
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
```

**b) PAP für den aufsteigenden Teil:**

```
        ┌──────────────────┐
        │      START       │
        └────────┬─────────┘
                 ▼
        ┌──────────────────┐
        │  n = 5, i = 1    │
        └────────┬─────────┘
                 ▼
        ◇  i <= n ?
       /              \
     Ja               Nein
      ▼                 ▼
    j = 1             ENDE
      │
      ▼
    ◇ j <= i ?
   /          \
 Ja           Nein
  ▼             ▼
Ausgabe j    Zeilenumbruch
  │          i = i + 1
  ▼            │
j = j + 1      └──► (zurück zu i <= n ?)
  │
  └──► (zurück zu j <= i ?)
```
