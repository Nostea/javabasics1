# Lösungsblatt 2 – Arrays (1D und 2D)

---

## Aufgabe 1 — Array deklarieren und befüllen

```java
public class ArrayAusgabe {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }
}
```

---

## Aufgabe 2 — Codeanalyse: Was wird ausgegeben?

**Lösung: B) `8` und `9`**

- `zahlen[2]` → Index 2 → Wert `8`
- `zahlen[zahlen.length - 1]` = `zahlen[4]` → Wert `9`

---

## Aufgabe 3 — Summe berechnen

```java
public class Summe {
    public static void main(String[] args) {
        int[] werte = {4, 7, 2, 9, 1, 6};
        int summe = 0;

        for (int i = 0; i < werte.length; i++) {
            summe += werte[i];
        }

        System.out.println("Summe: " + summe);  // 29
    }
}
```

---

## Aufgabe 4 — Fehler finden

**Lösung: C) Zeilen A und B**

- **Zeile A:** `noten[5] = 1` — das Array hat nur die Indizes 0–4, Index 5 existiert nicht → `ArrayIndexOutOfBoundsException`
- **Zeile B:** `noten[noten.length]` = `noten[5]` — ebenfalls ungültig (letzter gültiger Index: `noten.length - 1 = 4`)

---

## Aufgabe 5 — Größtes Element finden

```java
public class MaxWert {
    public static int findeMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] test = {3, 17, 5, 42, 8};
        System.out.println(findeMax(test));  // 42
    }
}
```

---

## Aufgabe 6 — Code kommentieren

```java
String[] namen = {"Anna", "Ben", "Clara", "David"};  // String-Array mit 4 Namen

for (int i = 0; i < namen.length; i++) {              // Schleife über alle Indizes (0 bis 3)
    System.out.println((i + 1) + ". " + namen[i]);    // Ausgabe: laufende Nummer + Name
}
```

---

## Aufgabe 7 — for-each Schleife

**Lösung: B) `20`**

`2 + 4 + 6 + 8 = 20`

---

## Aufgabe 8 — PAP lesen

**Lösung: C) Das kleinste Element (Minimum)**

Der Algorithmus startet mit dem ersten Element als vorläufiges Minimum und ersetzt es, sobald ein kleineres Element gefunden wird — klassische Minimum-Suche.

---

## Aufgabe 9 — Durchschnitt und Vergleich

```java
public class TemperaturAnalyse {
    public static void main(String[] args) {
        double[] temperaturen = {12.5, 18.3, 9.8, 22.1, 15.0, 7.6, 19.4};

        double summe = 0;
        for (double t : temperaturen) {
            summe += t;
        }
        double durchschnitt = summe / temperaturen.length;
        System.out.printf("Durchschnitt: %.2f°C%n", durchschnitt);

        System.out.println("Über dem Durchschnitt:");
        for (double t : temperaturen) {
            if (t > durchschnitt) {
                System.out.printf("  %.1f°C%n", t);
            }
        }
    }
}
```

---

## Aufgabe 10 — 2D-Array: Sitzplan

```java
public class Kino {
    public static void main(String[] args) {
        int[][] sitzplan = {
            {1, 0, 1, 1},
            {0, 0, 0, 1},
            {1, 1, 0, 0}
        };

        int freiePlätze = 0;

        for (int reihe = 0; reihe < sitzplan.length; reihe++) {
            for (int platz = 0; platz < sitzplan[reihe].length; platz++) {
                if (sitzplan[reihe][platz] == 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                    freiePlätze++;
                }
            }
            System.out.println();
        }

        System.out.println("Freie Plätze: " + freiePlätze);
    }
}
```

---

## Aufgabe 11 — Codeanalyse: Fehler beschreiben

**Lösung: B)**

Zwei Probleme:
1. Die Schleife beginnt bei `i = 1` → `arr[0]` (Wert `10`) wird **nicht** addiert
2. Die Bedingung `i <= arr.length` führt bei `i = 5` zum Zugriff auf `arr[5]`, der nicht existiert → `ArrayIndexOutOfBoundsException`

Korrekte Schleife: `for (int i = 0; i < arr.length; i++)`

---

## Aufgabe 12 — Array umkehren

```java
public class ArrayUmkehren {
    public static void umkehren(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        umkehren(arr);
        for (int z : arr) {
            System.out.print(z + " ");  // 5 4 3 2 1
        }
    }
}
```

---

## Aufgabe 13 — PAP: Anzahl gerader Zahlen

```
        ┌───────────────────────┐
        │         START         │
        └───────────┬───────────┘
                    ▼
        ┌───────────────────────┐
        │ anzahlGerade = 0      │
        │ i = 0                 │
        └───────────┬───────────┘
                    ▼
        ◇  i < arr.length ?
       /                    \
     Ja                     Nein
      ▼                       ▼
◇ arr[i] % 2 == 0 ?    ┌─────────────────┐
  /          \          │ Ausgabe:        │
Ja           Nein       │ anzahlGerade    │
 ▼             │        └────────┬────────┘
anzahlGerade++ │                 ▼
  \            │              ENDE
   └─────┬─────┘
         ▼
       i = i + 1
         │
         └──► (zurück zu i < arr.length ?)
```

---

## Aufgabe 14 — Wetterstation

```java
public class Wetterstation {

    public static double berechneMin(double[] daten) {
        double min = daten[0];
        for (double d : daten) {
            if (d < min) min = d;
        }
        return min;
    }

    public static double berechneMax(double[] daten) {
        double max = daten[0];
        for (double d : daten) {
            if (d > max) max = d;
        }
        return max;
    }

    public static double berechneDurchschnitt(double[] daten) {
        double summe = 0;
        for (double d : daten) summe += d;
        return summe / daten.length;
    }

    public static double berechneMaxUmschwung(double[] daten) {
        double maxUmschwung = 0;
        for (int i = 0; i < daten.length - 1; i++) {
            double differenz = Math.abs(daten[i + 1] - daten[i]);
            if (differenz > maxUmschwung) maxUmschwung = differenz;
        }
        return maxUmschwung;
    }

    public static void main(String[] args) {
        double[] daten = {-3.2, 1.5, 6.8, 12.3, 17.9, 22.4, 25.1, 24.8, 19.3, 11.7, 4.2, -1.8};

        System.out.printf("Minimum:      %.2f°C%n", berechneMin(daten));
        System.out.printf("Maximum:      %.2f°C%n", berechneMax(daten));
        System.out.printf("Durchschnitt: %.2f°C%n", berechneDurchschnitt(daten));
        System.out.printf("Max. Umschwung: %.2f°C%n", berechneMaxUmschwung(daten));
    }
}
```

---

## Aufgabe 15 — 2D-Array: Notentabelle

**a) Coding:**

```java
public class Notentabelle {
    public static void main(String[] args) {
        int[][] noten = {
            {2, 3, 1, 4},
            {5, 2, 3, 2},
            {1, 1, 2, 3},
            {4, 3, 4, 5}
        };

        double bestesDurchschnitt = Double.MAX_VALUE;
        int besterSchueler = 0;

        for (int s = 0; s < noten.length; s++) {
            int summe = 0;
            for (int f = 0; f < noten[s].length; f++) {
                summe += noten[s][f];
            }
            double durchschnitt = (double) summe / noten[s].length;
            System.out.printf("Schüler %d: Durchschnitt %.2f%n", s + 1, durchschnitt);

            if (durchschnitt < bestesDurchschnitt) {
                bestesDurchschnitt = durchschnitt;
                besterSchueler = s + 1;
            }
        }

        System.out.println("Bester Schüler: Schüler " + besterSchueler +
                           " (Ø " + String.format("%.2f", bestesDurchschnitt) + ")");
    }
}
```

**b) Codeanalyse:**

**Lösung: B) `3` und `4`**

- `matrix.length` → Anzahl der Zeilen = `3`
- `matrix[0].length` → Anzahl der Spalten in Zeile 0 = `4`
