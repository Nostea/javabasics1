# Aufgabenblatt 3 – Schleifen (for, while, do-while, verschachtelt)

> **Thema:** Schleifen, Schleifentypen, verschachtelte Schleifen  
> **Hilfsmittel:** kein Internet, keine KI, Java-API-Kurzreferenz erlaubt

---

## Teil A – Einfache Aufgaben *(je ca. 3–5 Min.)*

---

### Aufgabe 1 — Zählen von 1 bis N *(Coding)*

Schreiben Sie ein Programm, das eine Zahl `n` einliest und alle ganzen Zahlen von `1` bis `n` untereinander ausgibt.

Verwenden Sie eine `for`-Schleife.

---

### Aufgabe 2 — Codeanalyse: Was wird ausgegeben? *(Single Choice)*

```java
int i = 10;
while (i > 0) {
    System.out.print(i + " ");
    i -= 3;
}
```

Was gibt das Programm aus?

- [ ] A) `10 7 4 1`
- [ ] B) `10 7 4`
- [ ] C) `10 7 4 1 -2`
- [ ] D) Endlosschleife

---

### Aufgabe 3 — Multiplikationstabelle (einfach) *(Coding)*

Geben Sie das kleine Einmaleins einer vom Benutzer eingegebenen Zahl aus:

**Beispiel für Eingabe `7`:**
```
7 x 1 = 7
7 x 2 = 14
...
7 x 10 = 70
```

---

### Aufgabe 4 — Fehler finden *(Multiple Choice)*

```java
int summe = 0;
int i = 1;
while (i <= 10) {
    summe += i;
}
System.out.println(summe);
```

Was ist das Problem?

- [ ] A) `summe` ist nicht korrekt initialisiert
- [ ] B) `while` kann keine Summe berechnen — dafür braucht man `for`
- [ ] C) Die Variable `i` wird nie erhöht — Endlosschleife
- [ ] D) Es gibt kein Problem, die Ausgabe ist `55`

---

### Aufgabe 5 — Countdown mit do-while *(Coding)*

Schreiben Sie ein Programm, das mit `do-while` einen Countdown von 5 bis 0 ausgibt:

```
5
4
3
2
1
0
Start!
```

---

### Aufgabe 6 — PAP lesen *(Single Choice)*

```
START
  │
  ▼
i = 1, summe = 0
  │
  ▼  ┌──────────────────────────┐
◇ i <= 5 ?──Nein──► Ausgabe summe ──► ENDE
  │ Ja
  ▼
summe = summe + (i * i)
  │
  ▼
i = i + 1
  │
  └──► (zurück zu i <= 5 ?)
```

Was gibt das Programm aus?

- [ ] A) `15`
- [ ] B) `25`
- [ ] C) `55`
- [ ] D) `225`

---

### Aufgabe 7 — Codeanalyse: Kommentieren *(Kommentiere den Quelltext)*

Kommentieren Sie jeden markierten Bereich:

```java
int n = 5;

for (int i = 1; i <= n; i++) {          // ???
    for (int j = 1; j <= i; j++) {      // ???
        System.out.print("* ");          // ???
    }
    System.out.println();                // ???
}
```

---

### Aufgabe 8 — break und continue *(Multiple Choice)*

```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) continue;
    if (i == 7) break;
    System.out.print(i + " ");
}
```

Was gibt das Programm aus?

- [ ] A) `1 3 5 7 9`
- [ ] B) `1 3 5`
- [ ] C) `2 4 6 8 10`
- [ ] D) `1 2 3 4 5 6`

---

## Teil B – Mittlere Aufgaben *(je ca. 10–15 Min.)*

---

### Aufgabe 9 — Quersumme *(Coding)*

Schreiben Sie ein Programm, das eine positive ganze Zahl einliest und ihre **Quersumme** berechnet.

Beispiel: `1234` → `1 + 2 + 3 + 4 = 10`

**Hinweis:** Verwenden Sie `%` und `/` um die einzelnen Ziffern zu extrahieren.

---

### Aufgabe 10 — Eingabe wiederholen (Validierung) *(Coding)*

Schreiben Sie ein Programm, das den Benutzer so lange nach einem Passwort fragt, bis er `"geheim123"` eingibt. Nach erfolgreicher Eingabe: `"Zugang gewährt!"`.

Verwenden Sie eine `do-while`-Schleife.

---

### Aufgabe 11 — Rechteck aus Sternchen *(Coding)*

Lesen Sie Breite und Höhe ein und geben Sie ein gefülltes Rechteck aus `*` aus.

**Beispiel Breite=5, Höhe=3:**
```
*****
*****
*****
```

Verwenden Sie **verschachtelte for-Schleifen**.

---

### Aufgabe 12 — PAP zeichnen *(PAP)*

Zeichnen Sie den Programmablaufplan für folgende Aufgabe:

> Berechnen Sie die Fakultät einer eingegebenen Zahl `n` (also `n! = 1 * 2 * 3 * ... * n`).  
> Für `n = 0` gilt: `0! = 1`.

---

### Aufgabe 13 — Codeanalyse: Fehler beschreiben *(Multiple Choice)*

```java
int n = 5;
int ergebnis = 0;

for (int i = 0; i <= n; i++) {
    ergebnis *= i;
}
System.out.println("Fakultät: " + ergebnis);
```

Was ist der Fehler?

- [ ] A) `ergebnis` muss mit `0` initialisiert werden, damit `*=` funktioniert
- [ ] B) `ergebnis` ist mit `0` initialisiert, daher bleibt das Produkt immer `0`. Es muss mit `1` initialisiert werden
- [ ] C) Die Schleifenbedingung muss `i < n` sein
- [ ] D) `*=` ist kein gültiger Operator in Java

---

## Teil C – Aufgaben auf Stufe-3-Niveau

---

### Aufgabe 14 — Primzahlen in einem Bereich *(Coding)*

Schreiben Sie ein Programm, das alle Primzahlen zwischen zwei vom Benutzer eingegebenen Zahlen `a` und `b` ausgibt und deren **Durchschnitt** berechnet.

Anforderungen:
- Methode `boolean istPrimzahl(int n)` schreiben
- Methode `void gibPrimzahlenAus(int von, int bis)` schreiben, die die Primzahlen auflistet und am Ende den Durchschnitt ausgibt
- Eingabe: zwei positive Ganzzahlen (kleinere zuerst prüfen)

**Beispiel:** Eingabe `2` und `20` →  
```
Primzahlen: 2 3 5 7 11 13 17 19
Durchschnitt: 9.63
```

---

### Aufgabe 15 — Muster ausgeben *(Coding + PAP)*

**a) Coding:**

Schreiben Sie ein Programm, das folgende Ausgabe für `n = 5` erzeugt:

```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
```

(Zahlendreieck aufwärts, dann abwärts)

**b) PAP:**

Zeichnen Sie den PAP nur für den **aufsteigenden Teil** (Zeilen 1 bis `n`).
