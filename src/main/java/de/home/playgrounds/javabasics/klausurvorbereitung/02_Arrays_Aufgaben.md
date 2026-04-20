# Aufgabenblatt 2 – Arrays (1D und 2D)

> **Thema:** Arrays, Indexzugriff, Schleifen über Arrays, 2D-Arrays  
> **Hilfsmittel:** kein Internet, keine KI, Java-API-Kurzreferenz erlaubt

---

## Teil A – Einfache Aufgaben *(je ca. 3–5 Min.)*

---

### Aufgabe 1 — Array deklarieren und befüllen *(Coding)*

Deklarieren Sie ein `int`-Array mit 5 Elementen. Befüllen Sie es manuell mit den Werten `10, 20, 30, 40, 50` und geben Sie alle Elemente mit ihrer Indexposition aus.

**Beispielausgabe:**
```
Index 0: 10
Index 1: 20
...
```

---

### Aufgabe 2 — Codeanalyse: Was wird ausgegeben? *(Single Choice)*

```java
int[] zahlen = {5, 3, 8, 1, 9};
System.out.println(zahlen[2]);
System.out.println(zahlen[zahlen.length - 1]);
```

Was gibt das Programm aus?

- [ ] A) `3` und `1`
- [ ] B) `8` und `9`
- [ ] C) `8` und `1`
- [ ] D) Laufzeitfehler (`ArrayIndexOutOfBoundsException`)

---

### Aufgabe 3 — Summe berechnen *(Coding)*

Gegeben ist folgendes Array:
```java
int[] werte = {4, 7, 2, 9, 1, 6};
```
Berechnen Sie die **Summe** aller Elemente mit einer `for`-Schleife und geben Sie sie aus.

---

### Aufgabe 4 — Fehler finden *(Multiple Choice)*

```java
int[] noten = new int[5];
noten[0] = 2;
noten[1] = 3;
noten[5] = 1;   // Zeile A
System.out.println(noten[noten.length]);  // Zeile B
```

Welche Zeilen enthalten Fehler?

- [ ] A) Nur Zeile A (Index außerhalb des Arrays)
- [ ] B) Nur Zeile B (Index außerhalb des Arrays)
- [ ] C) Zeilen A und B (beide Indizes liegen außerhalb)
- [ ] D) Keine Fehler — `new int[5]` erlaubt Index bis 5

---

### Aufgabe 5 — Größtes Element finden *(Coding)*

Schreiben Sie eine Methode `findeMax(int[] arr)`, die das größte Element eines Arrays zurückgibt. Testen Sie mit:
```java
int[] test = {3, 17, 5, 42, 8};
```
Erwartete Ausgabe: `42`

---

### Aufgabe 6 — Codeanalyse: Kommentieren *(Kommentiere den Quelltext)*

Kommentieren Sie jeden markierten Bereich:

```java
String[] namen = {"Anna", "Ben", "Clara", "David"};  // ???

for (int i = 0; i < namen.length; i++) {              // ???
    System.out.println((i + 1) + ". " + namen[i]);    // ???
}
```

---

### Aufgabe 7 — for-each Schleife *(Single Choice)*

```java
int[] zahlen = {2, 4, 6, 8};
int summe = 0;
for (int z : zahlen) {
    summe += z;
}
System.out.println(summe);
```

Was gibt das Programm aus?

- [ ] A) `10`
- [ ] B) `20`
- [ ] C) `24`
- [ ] D) `8`

---

### Aufgabe 8 — PAP lesen *(Single Choice)*

Gegeben ist folgender Programmablaufplan für eine Methode mit Array `arr` der Länge `n`:

```
START
  │
  ▼
min = arr[0]
  │
  ▼
i = 1
  │
  ▼  ┌──────────────────┐
◇ i < n ?──Nein──► Ausgabe min ──► ENDE
  │ Ja
  ▼
◇ arr[i] < min ?
  │ Ja          Nein
  ▼              │
min = arr[i]     │
  │              │
  └──────┬───────┘
         ▼
        i = i + 1
         │
         └──► (zurück zu i < n ?)
```

Was berechnet dieser Algorithmus?

- [ ] A) Die Summe aller Elemente
- [ ] B) Den Durchschnitt aller Elemente
- [ ] C) Das kleinste Element (Minimum)
- [ ] D) Das größte Element (Maximum)

---

## Teil B – Mittlere Aufgaben *(je ca. 10–15 Min.)*

---

### Aufgabe 9 — Durchschnitt und Vergleich *(Coding)*

Gegeben ist ein Array mit Tagestemperaturen:
```java
double[] temperaturen = {12.5, 18.3, 9.8, 22.1, 15.0, 7.6, 19.4};
```

Schreiben Sie ein Programm, das:
1. Den Durchschnitt berechnet und ausgibt
2. Alle Temperaturen ausgibt, die **über** dem Durchschnitt liegen

---

### Aufgabe 10 — 2D-Array: Sitzplan *(Coding)*

Ein Kino hat 3 Reihen mit je 4 Plätzen. Ein Platz ist entweder frei (`0`) oder belegt (`1`).

```java
int[][] sitzplan = {
    {1, 0, 1, 1},
    {0, 0, 0, 1},
    {1, 1, 0, 0}
};
```

Schreiben Sie ein Programm, das:
1. Den Sitzplan als Tabelle ausgibt (`O` = frei, `X` = belegt)
2. Die **Anzahl freier Plätze** ausgibt

**Beispielausgabe:**
```
X O X X
O O O X
X X O O
Freie Plätze: 6
```

---

### Aufgabe 11 — Codeanalyse: Fehler beschreiben *(Multiple Choice)*

```java
int[] arr = {10, 20, 30, 40, 50};
int summe = 0;

for (int i = 1; i <= arr.length; i++) {
    summe += arr[i];
}
System.out.println("Summe: " + summe);
```

Was ist das Problem?

- [ ] A) `summe` ist nicht initialisiert
- [ ] B) Die Schleife startet bei Index 1, daher wird `arr[0]` nicht einbezogen. Zusätzlich wirft `arr[arr.length]` eine `ArrayIndexOutOfBoundsException`
- [ ] C) Der `+=` Operator ist ungültig für `int`
- [ ] D) Es gibt kein Problem, die Ausgabe ist `150`

---

### Aufgabe 12 — Array umkehren *(Coding)*

Schreiben Sie eine Methode `umkehren(int[] arr)`, die ein Array **ohne** Hilfsvariablen-Array umkehrt (in-place, nur mit einer `temp`-Variable). Geben Sie das umgekehrte Array aus.

Testen Sie mit: `{1, 2, 3, 4, 5}` → Erwartung: `{5, 4, 3, 2, 1}`

---

### Aufgabe 13 — PAP zeichnen *(PAP)*

Zeichnen Sie den Programmablaufplan für folgende Methode:

> Gegeben ein `int`-Array. Bestimmen Sie die **Anzahl der geraden Zahlen** im Array und geben Sie diese aus.

---

## Teil C – Aufgaben auf Stufe-3-Niveau

---

### Aufgabe 14 — Wetterstation: Min, Max, Durchschnitt, Umschwung *(Coding)*

Gegeben ist ein Array mit Monatsdurchschnittstemperaturen:
```java
double[] daten = {-3.2, 1.5, 6.8, 12.3, 17.9, 22.4, 25.1, 24.8, 19.3, 11.7, 4.2, -1.8};
```

Schreiben Sie **vier separate Methoden** und eine `main`-Methode, die alle aufruft:

1. `double berechneMin(double[] daten)` — gibt das Minimum zurück
2. `double berechneMax(double[] daten)` — gibt das Maximum zurück
3. `double berechneDurchschnitt(double[] daten)` — gibt den Durchschnitt zurück
4. `double berechneMaxUmschwung(double[] daten)` — gibt den größten absoluten Temperaturunterschied zwischen zwei aufeinanderfolgenden Monaten zurück

Ausgabe aller vier Werte (je 2 Nachkommastellen).

---

### Aufgabe 15 — 2D-Array: Notentabelle *(Coding + Analyse)*

**a) Coding:**

Gegeben ist eine 2D-Tabelle mit Noten (Zeilen = Schüler, Spalten = Fächer):

```java
int[][] noten = {
    {2, 3, 1, 4},
    {5, 2, 3, 2},
    {1, 1, 2, 3},
    {4, 3, 4, 5}
};
```

Schreiben Sie ein Programm, das:
- Den Durchschnitt **pro Schüler** berechnet und ausgibt
- Den **besten Schüler** (niedrigster Durchschnitt) ermittelt und ausgibt

**b) Codeanalyse *(Multiple Choice)*:**

```java
int[][] matrix = new int[3][4];
System.out.println(matrix.length);
System.out.println(matrix[0].length);
```

Was gibt das Programm aus?

- [ ] A) `12` und `12`
- [ ] B) `3` und `4`
- [ ] C) `4` und `3`
- [ ] D) Laufzeitfehler
