# Lösungsblatt 6 – Codeanalyse

---

## Aufgabe 1 — Was macht der Code?

**Lösung: B) Die Summe `1 + 2 + 3 + 4 + 5 = 15`**

Die Schleife addiert alle Zahlen von 1 bis `n` auf. `berechne(5)` ergibt `15`.

---

## Aufgabe 2 — Syntaxfehler finden

**Lösung: A, B, C**

- **A:** Nach `main(String[] args)` fehlt `{` → Methode wird nicht geöffnet
- **B:** `int x = 5` → fehlt `;`
- **C:** `System.out.println("Groß")` → fehlt `;`
- D ist falsch: `if (x > 3)` ist korrekte Java-Syntax
- E ist falsch: `public class` ist gültig

---

## Aufgabe 3 — Quelltext kommentieren

```java
public static boolean istPositiv(int zahl) {   // Methode prüft ob eine Zahl positiv ist; gibt true/false zurück
    if (zahl > 0) {                             // Prüft ob die Zahl größer als 0 ist
        return true;                            // Gibt true zurück wenn Bedingung erfüllt
    } else {
        return false;                           // Gibt false zurück wenn zahl <= 0
    }
}
```

---

## Aufgabe 4 — Ausgabe bestimmen

**Lösung: B)**

Die Bedingung `i == j` ist nur auf der Diagonalen wahr:
```
X O O
O X O
O O X
```

---

## Aufgabe 5 — Semantischen Fehler erkennen

**Lösung: C)**

Die Formel ist korrekt: `100 * 9/5 + 32 = 212`. Das Problem liegt in `printf`:

```java
System.out.printf("%.1f°C = %.1f°F", fahrenheit, celsius);
```

Das erste `%f` wird mit `fahrenheit` (212.0) ausgegeben, das zweite mit `celsius` (100.0). Die Ausgabe wäre also: `212.0°C = 100.0°F` — Celsius und Fahrenheit sind in Beschriftung und Wert vertauscht.

Korrekt wäre: `System.out.printf("%.1f°C = %.1f°F", celsius, fahrenheit);`

---

## Aufgabe 6 — Was gibt der Code aus?

**Ausgabe:** `5 4 3 2 1`

`x` startet bei Index 4 (`zahlen.length - 1 = 4`) und läuft rückwärts bis 0.

---

## Aufgabe 7 — Quelltext kommentieren

```java
public static double berechneRabatt(double preis, int menge) {  // Berechnet den Endpreis nach Mengenrabatt
    double rabatt = 0.0;

    if (menge >= 100) {          // Ab 100 Stück: 20% Rabatt
        rabatt = 0.20;
    } else if (menge >= 50) {    // Ab 50 Stück: 10% Rabatt
        rabatt = 0.10;
    } else if (menge >= 10) {    // Ab 10 Stück: 5% Rabatt
        rabatt = 0.05;
    }                            // Unter 10 Stück: kein Rabatt (rabatt bleibt 0.0)

    return preis * (1 - rabatt); // Endpreis = Preis abzüglich Rabattanteil
}
```

---

## Aufgabe 8 — Fehler erkennen

**Lösung: B)**

In Zeile X steht `if (b > max) max = c;` — aber es sollte `if (c > max) max = c;` heißen.

Wenn `b <= max` (also `a` ist das Maximum), wird die Bedingung `b > max` nicht erfüllt und `c` wird **nie** berücksichtigt. Wenn `a = 10, b = 5, c = 8` → `max` bleibt `10` (korrekt), aber wenn `a = 10, b = 3, c = 15` → `max` bleibt fälschlicherweise `10` statt `15`.

---

## Aufgabe 9 — Code vollständig beschreiben

Die Methode `analysiere` erhält ein `int`-Array und berechnet drei statistische Kennzahlen. Zunächst werden `max` und `min` mit dem ersten Element initialisiert. Dann wird das Array einmal durchlaufen: für jedes Element wird geprüft, ob es das neue Maximum oder Minimum ist, und es wird zur Gesamtsumme addiert. Nach der Schleife wird der Durchschnitt aus Summe geteilt durch Elementanzahl berechnet. Abschließend werden Minimum, Maximum und Durchschnitt (auf 2 Nachkommastellen gerundet) ausgegeben.

---

## Aufgabe 10 — Alle Fehler finden und korrigieren

**Lösung: A, B, C, D** (Antwort E ist technisch korrekt — alle vier Zeilen enthalten Fehler)

- **Zeile A:** `i =<` ist kein gültiger Operator. Korrekt: `i <`
- **Zeile A (zusätzlich):** Selbst mit `<=` wäre `i <= wetter.length` falsch (Off-by-one). Korrekt: `i < wetter.length`
- **Zeile B:** Bei Arrays ist `.length` eine Eigenschaft ohne Klammern. `.length()` ist nur bei `String`. Korrekt: `wetter.length`
- **Zeile C:** `=>` ist kein Java-Operator. Korrekt: `>=`

**Korrigierter Code:**
```java
for (int i = 0; i < wetter.length; i++) {        // Zeile A
    summe = summe + wetter[i];
}
double durchschnitt = summe / wetter.length;       // Zeile B
if (durchschnitt >= 15.0) {                        // Zeile C
```

---

## Aufgabe 11 — Rückgabewert bestimmen

**Lösung: C) `"FizzBuzz"`**

`30 % 15 == 0` → trifft als erste Bedingung zu → sofortiger return `"FizzBuzz"`

---

## Aufgabe 12 — Quelltext kommentieren

```java
public static int[] filterPositive(int[] arr) {      // Methode gibt ein neues Array nur mit positiven Elementen zurück
    int anzahl = 0;
    for (int x : arr) {                              // Erster Durchlauf: zählt wie viele Elemente positiv sind
        if (x > 0) anzahl++;                         // Zähler erhöhen wenn Element > 0
    }

    int[] ergebnis = new int[anzahl];                // Neues Array anlegen mit exakt der richtigen Größe
    int index = 0;

    for (int x : arr) {                              // Zweiter Durchlauf: positive Elemente ins Ergebnis-Array kopieren
        if (x > 0) {
            ergebnis[index] = x;                     // Positives Element an nächster freier Position eintragen
            index++;
        }
    }
    return ergebnis;                                 // Gefülltes Array zurückgeben
}
```

---

## Aufgabe 13 — Logischen Fehler erkennen

**Lösung: B)**

Die Schleife läuft bis `i <= n` (einschließlich). Wenn `i == n`, ist `n % n == 0` immer wahr → die Methode gibt immer `false` zurück (außer für `n <= 1`). Keine Zahl wird jemals als Primzahl erkannt.

Korrekte Bedingung: `i < n` (oder effizienter: `i <= Math.sqrt(n)`)

---

## Aufgabe 14 — Komplexen Code vollständig analysieren

**a) Beschreibung:**

Die Methode `verarbeite` zählt, wie oft jede Ziffer von 0–9 in einem Integer-Array vorkommt. Dafür wird ein Zähler-Array der Größe 10 verwendet, wobei Index `i` der Ziffer `i` entspricht. Werte außerhalb von 0–9 werden ignoriert. Anschließend wird der Index mit dem höchsten Zählwert ermittelt — das ist die häufigste Ziffer. Diese wird zusammen mit ihrer Häufigkeit ausgegeben.

**b) Ausgabe:**

**Lösung: B) `Häufigste Ziffer: 5 (3 mal)`**

Häufigkeiten: `1→2, 2→1, 3→2, 4→1, 5→3, 6→1, 9→1` → `5` kommt 3-mal vor.

**c) Einschränkung:**

Die Methode kann nur Ziffern von 0–9 verarbeiten. Zahlen außerhalb dieses Bereichs (negative Zahlen, zweistellige Zahlen wie 10, 23, ...) werden stillschweigend ignoriert und nicht gezählt.

---

## Aufgabe 15 — Selection Sort debuggen

**a) Fehler:**

**Lösung: B)**

Beim Tausch fehlt eine Hilfsvariable. In Zeile A wird `arr[i]` mit `arr[minIdx]` überschrieben — der ursprüngliche Wert von `arr[i]` ist damit unwiederbringlich verloren. Zeile B schreibt dann diesen (bereits überschriebenen) Wert zurück.

**b) Korrigierter Tausch:**

```java
// Tausch (korrigiert):
int temp = arr[i];
arr[i] = arr[minIdx];
arr[minIdx] = temp;
```

**c) Fehlerhafte Trace für `{3, 1, 2}`:**

| i | Aktion                                        | arr nach Schritt         |
|---|-----------------------------------------------|--------------------------|
| 0 | Start                                         | `{3, 1, 2}`              |
| 0 | minIdx=1 (arr[1]=1 ist kleinstes), arr[0]=arr[1]=1 | `{1, 1, 2}` (arr[0] überschrieben) |
| 0 | arr[1]=arr[0]=1 (arr[0] ist schon 1!)         | `{1, 1, 2}` (3 verloren!) |
| 1 | minIdx=1 (arr[1]=1 ist kleinstes ab i=1), kein echter Tausch | `{1, 1, 2}` |
| — | Ergebnis (fehlerhaft)                         | `{1, 1, 2}` statt `{1, 2, 3}` |

Der ursprüngliche Wert `3` geht verloren und das Array ist falsch sortiert.
