# Aufgabenblatt 6 – Codeanalyse

> **Thema:** Code lesen, beschreiben, Fehler finden, kommentieren  
> **Formate:** Multiple Choice · Single Choice · Kommentierung · Freitext

---

## Teil A – Einfache Aufgaben *(je ca. 3–5 Min.)*

---

### Aufgabe 1 — Was macht der Code? *(Single Choice)*

```java
public static int berechne(int n) {
    int ergebnis = 0;
    for (int i = 1; i <= n; i++) {
        ergebnis += i;
    }
    return ergebnis;
}
```

Was berechnet die Methode `berechne(5)`?

- [ ] A) Das Produkt `1 * 2 * 3 * 4 * 5 = 120`
- [ ] B) Die Summe `1 + 2 + 3 + 4 + 5 = 15`
- [ ] C) Den Durchschnitt aller Zahlen bis `n`
- [ ] D) Die Anzahl der Zahlen bis `n`

---

### Aufgabe 2 — Syntaxfehler finden *(Multiple Choice)*

Der folgende Code enthält **drei** Syntaxfehler. Markieren Sie alle.

```java
public class Fehler {
    public static void main(String[] args)
        int x = 5
        if (x > 3) {
            System.out.println("Groß")
        }
    }
}
```

- [ ] A) Fehlende öffnende geschweifte Klammer `{` nach `main(String[] args)`
- [ ] B) `int x = 5` fehlt das Semikolon `;`
- [ ] C) `System.out.println("Groß")` fehlt das Semikolon `;`
- [ ] D) `if (x > 3)` ist falsch — man muss `if x > 3` schreiben
- [ ] E) `public class` ist kein gültiges Schlüsselwort

---

### Aufgabe 3 — Quelltext kommentieren *(Kommentiere den Quelltext)*

Kommentieren Sie jeden markierten Bereich:

```java
public static boolean istPositiv(int zahl) {   // ???
    if (zahl > 0) {                             // ???
        return true;                            // ???
    } else {
        return false;                           // ???
    }
}
```

---

### Aufgabe 4 — Ausgabe bestimmen *(Single Choice)*

```java
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (i == j) {
            System.out.print("X ");
        } else {
            System.out.print("O ");
        }
    }
    System.out.println();
}
```

Welche Ausgabe erzeugt der Code?

- [ ] A)
  ```
  X X X
  X X X
  X X X
  ```
- [ ] B)
  ```
  X O O
  O X O
  O O X
  ```
- [ ] C)
  ```
  O X X
  X O X
  X X O
  ```
- [ ] D)
  ```
  O O O
  O O O
  O O O
  ```

---

### Aufgabe 5 — Semantischen Fehler erkennen *(Multiple Choice)*

```java
double celsius = 100.0;
double fahrenheit = celsius * 9 / 5 + 32;
System.out.printf("%.1f°C = %.1f°F", fahrenheit, celsius);
```

Was ist das Problem?

- [ ] A) Die Formel ist falsch — es muss `celsius * 5 / 9 + 32` sein
- [ ] B) `printf` kann keine `double`-Werte formatieren
- [ ] C) Die Reihenfolge der Argumente in `printf` ist vertauscht — erst `celsius`, dann `fahrenheit`
- [ ] D) Es gibt kein Problem

---

### Aufgabe 6 — Was gibt der Code aus? *(Freitext)*

```java
int[] zahlen = {1, 2, 3, 4, 5};
int x = zahlen.length - 1;

while (x >= 0) {
    System.out.print(zahlen[x] + " ");
    x--;
}
```

Schreiben Sie die Ausgabe auf:

**Ausgabe:** _______________________

---

### Aufgabe 7 — Quelltext kommentieren *(Kommentiere den Quelltext)*

```java
public static double berechneRabatt(double preis, int menge) {  // ???
    double rabatt = 0.0;

    if (menge >= 100) {          // ???
        rabatt = 0.20;
    } else if (menge >= 50) {    // ???
        rabatt = 0.10;
    } else if (menge >= 10) {    // ???
        rabatt = 0.05;
    }                            // ???

    return preis * (1 - rabatt); // ???
}
```

---

### Aufgabe 8 — Fehler erkennen *(Single Choice)*

```java
public static int maximum(int a, int b, int c) {
    int max = a;
    if (b > max) max = b;
    if (b > max) max = c;  // Zeile X
    return max;
}
```

Was ist der Fehler in Zeile X?

- [ ] A) `c` kann nicht mit `max` verglichen werden
- [ ] B) Die Bedingung prüft `b > max` statt `c > max` — `c` wird niemals berücksichtigt, wenn `b <= max`
- [ ] C) Es fehlt ein `else`
- [ ] D) Es gibt keinen Fehler

---

## Teil B – Mittlere Aufgaben *(je ca. 10–15 Min.)*

---

### Aufgabe 9 — Code vollständig beschreiben *(Freitext)*

Beschreiben Sie in eigenen Worten (4–6 Sätze), was die folgende Methode tut:

```java
public static void analysiere(int[] arr) {
    int max = arr[0];
    int min = arr[0];
    double summe = 0;

    for (int zahl : arr) {
        if (zahl > max) max = zahl;
        if (zahl < min) min = zahl;
        summe += zahl;
    }

    double durchschnitt = summe / arr.length;
    System.out.println("Min: " + min);
    System.out.println("Max: " + max);
    System.out.printf("Durchschnitt: %.2f%n", durchschnitt);
}
```

---

### Aufgabe 10 — Alle Fehler finden und korrigieren *(Multiple Choice + Freitext)*

Der folgende Code enthält **mehrere Fehler**. Finden Sie alle und schreiben Sie die korrigierten Zeilen auf.

```java
public class Wetteranalyse {
    public static void main(String[] args) {
        double[] wetter = {12.5, 18.3, 9.8, 22.1};
        double summe = 0;

        for (int i = 0; i =< wetter.length; i++) {   // Zeile A
            summe = summe + wetter[i];
        }

        double durchschnitt = summe / wetter.length();  // Zeile B

        if (durchschnitt => 15.0) {                     // Zeile C
            System.out.println("Warmes Wetter");
        } else {
            System.out.println("Kühles Wetter");
        }
    }
}
```

Welche Zeilen enthalten Fehler?

- [ ] A) Zeile A: `i =<` ist kein gültiger Operator (korrekt: `i <`)
- [ ] B) Zeile A: `i <= wetter.length` würde auf `wetter[4]` zugreifen (korrekt: `i < wetter.length`)
- [ ] C) Zeile B: `.length()` mit Klammern ist falsch bei Arrays (korrekt: `.length` ohne Klammern)
- [ ] D) Zeile C: `=>` ist kein gültiger Operator (korrekt: `>=`)
- [ ] E) Alle vier Zeilen A, B und C enthalten je einen Fehler

---

### Aufgabe 11 — Code lesen und Rückgabewert bestimmen *(Single Choice)*

```java
public static String kategorisiere(int n) {
    if (n % 15 == 0) return "FizzBuzz";
    if (n % 3 == 0)  return "Fizz";
    if (n % 5 == 0)  return "Buzz";
    return String.valueOf(n);
}
```

Was gibt `kategorisiere(30)` zurück?

- [ ] A) `"Fizz"`
- [ ] B) `"Buzz"`
- [ ] C) `"FizzBuzz"`
- [ ] D) `"30"`

---

### Aufgabe 12 — Quelltext kommentieren *(Kommentiere den Quelltext)*

```java
public static int[] filterPositive(int[] arr) {      // ???
    int anzahl = 0;
    for (int x : arr) {                              // ???
        if (x > 0) anzahl++;                         // ???
    }

    int[] ergebnis = new int[anzahl];                // ???
    int index = 0;

    for (int x : arr) {                              // ???
        if (x > 0) {
            ergebnis[index] = x;                     // ???
            index++;
        }
    }
    return ergebnis;                                 // ???
}
```

---

### Aufgabe 13 — Logischen Fehler erkennen *(Multiple Choice)*

```java
public static boolean istPrimzahl(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= n; i++) {   // Fehlerhafte Zeile
        if (n % i == 0) return false;
    }
    return true;
}
```

Was ist der Fehler?

- [ ] A) Die Methode gibt `false` zurück statt `true` für Primzahlen
- [ ] B) Die Schleifenbedingung `i <= n` führt dazu, dass `n % n == 0` immer wahr ist — die Methode gibt für jede Zahl `false` zurück (außer 1 und 0)
- [ ] C) `n % i` ist kein gültiger Ausdruck für die Modulo-Operation
- [ ] D) Es gibt keinen Fehler

---

## Teil C – Aufgaben auf Stufe-3-Niveau

---

### Aufgabe 14 — Komplexen Code vollständig analysieren *(Freitext + Multiple Choice)*

```java
public static void verarbeite(int[] daten) {
    int[] zaehler = new int[10];

    for (int d : daten) {
        if (d >= 0 && d <= 9) {
            zaehler[d]++;
        }
    }

    int maxIdx = 0;
    for (int i = 1; i < zaehler.length; i++) {
        if (zaehler[i] > zaehler[maxIdx]) {
            maxIdx = i;
        }
    }

    System.out.println("Häufigste Ziffer: " + maxIdx +
                       " (" + zaehler[maxIdx] + " mal)");
}
```

**a)** Beschreiben Sie in 3–4 Sätzen, was die Methode macht.

**b)** Was gibt die Methode für folgenden Aufruf aus?
```java
verarbeite(new int[]{3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5});
```

- [ ] A) `Häufigste Ziffer: 3 (2 mal)`
- [ ] B) `Häufigste Ziffer: 5 (3 mal)`
- [ ] C) `Häufigste Ziffer: 1 (2 mal)`
- [ ] D) `Häufigste Ziffer: 9 (1 mal)`

**c)** Nennen Sie eine Einschränkung dieser Methode (was kann sie **nicht** verarbeiten?).

---

### Aufgabe 15 — Code mit absichtlichem Fehler debuggen *(Freitext + Multiple Choice)*

Die folgende Methode soll ein Array mit Selection Sort sortieren. Sie enthält einen **logischen Fehler**:

```java
public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        int minIdx = i;

        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIdx]) {
                minIdx = j;
            }
        }

        // Tausch
        arr[i] = arr[minIdx];      // Zeile A
        arr[minIdx] = arr[i];      // Zeile B
    }
}
```

**a)** Was ist der Fehler?

- [ ] A) Die äußere Schleife sollte bis `arr.length` gehen (nicht `arr.length - 1`)
- [ ] B) Beim Tausch fehlt eine Hilfsvariable `temp` — `arr[i]` wird überschrieben bevor es gespeichert wird, sodass der ursprüngliche Wert verloren geht
- [ ] C) `minIdx` sollte mit `-1` initialisiert werden
- [ ] D) Die innere Schleife startet falsch bei `j = i + 1`

**b)** Schreiben Sie den korrigierten Tausch-Abschnitt:

```java
// Tausch (korrigiert):
// ???
```

**c)** Verfolgen Sie den (fehlerhaften) Algorithmus für `arr = {3, 1, 2}`:

Füllen Sie die Tabelle aus:

| i | j | arr nach Schritt                    |
|---|---|-------------------------------------|
| 0 | — | `{3, 1, 2}` (Start)                 |
|   |   |                                     |
|   |   |                                     |
