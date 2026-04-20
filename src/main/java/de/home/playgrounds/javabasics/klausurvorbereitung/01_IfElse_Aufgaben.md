# Aufgabenblatt 1 – if / else / switch

> **Thema:** Bedingte Verzweigungen · **Zielgruppe:** Azubi Anwendungsentwicklung  
> **Hilfsmittel:** kein Internet, keine KI, Java-API-Kurzreferenz erlaubt

---

## Teil A – Einfache Aufgaben *(je ca. 3–5 Min.)*

---

### Aufgabe 1 — Vorzeichen bestimmen *(Coding)*

Schreiben Sie ein Java-Programm, das eine ganzzahlige Zahl vom Benutzer einliest und ausgibt, ob sie **positiv**, **negativ** oder **null** ist.

**Beispielausgabe:**
```
Zahl eingeben: -7
Die Zahl ist negativ.
```

---

### Aufgabe 2 — Gerade oder ungerade *(Coding)*

Schreiben Sie ein Programm, das eine ganze Zahl einliest und ausgibt, ob sie gerade oder ungerade ist.  
**Hinweis:** Nutzen Sie den Modulo-Operator `%`.

---

### Aufgabe 3 — Codeanalyse: Was gibt das Programm aus? *(Single Choice)*

```java
int x = 10;
int y = 3;

if (x % y == 1) {
    System.out.println("A");
} else if (x / y == 3) {
    System.out.println("B");
} else {
    System.out.println("C");
}
```

Was wird ausgegeben?

- [ ] A) `A`
- [ ] B) `B`
- [ ] C) `C`
- [ ] D) Compilerfehler

---

### Aufgabe 4 — Mindestalter *(Coding)*

Schreiben Sie ein Programm, das das Alter eines Benutzers einliest. Geben Sie aus:
- `"Zutritt erlaubt"` wenn das Alter ≥ 18
- `"Zutritt verweigert"` sonst

---

### Aufgabe 5 — Codeanalyse: Fehler finden *(Multiple Choice)*

Der folgende Code enthält **zwei Fehler**. Markieren Sie alle Fehler.

```java
int alter = 20;
if alter >= 18 {
    System.out.println("Volljährig");
} else if (alter = 17) {
    System.out.println("Fast volljährig");
}
```

Welche Aussagen treffen zu?

- [ ] A) Fehlende Klammern um die Bedingung in der `if`-Zeile (syntaktischer Fehler)
- [ ] B) `alter = 17` ist eine Zuweisung statt eines Vergleichs (semantischer Fehler)
- [ ] C) `else if` ist in Java nicht erlaubt
- [ ] D) `System.out.println` ist falsch geschrieben

---

### Aufgabe 6 — Notenstufe per switch *(Coding)*

Lesen Sie eine Note (1–6) ein und geben Sie die Bezeichnung aus:

| Note | Bezeichnung  |
|------|--------------|
| 1    | Sehr gut     |
| 2    | Gut          |
| 3    | Befriedigend |
| 4    | Ausreichend  |
| 5    | Mangelhaft   |
| 6    | Ungenügend   |
| sonst | Ungültige Note |

Verwenden Sie eine `switch`-Anweisung.

---

### Aufgabe 7 — PAP lesen *(Single Choice)*

Gegeben ist folgender Programmablaufplan:

```
     ┌──────────────┐
     │   START      │
     └──────┬───────┘
            ▼
     ┌──────────────┐
     │  Lies zahl   │
     └──────┬───────┘
            ▼
     ◇ zahl > 0 ?
    /            \
  Ja              Nein
   ▼               ▼
"positiv"     ◇ zahl == 0 ?
               /         \
             Ja           Nein
              ▼            ▼
           "null"       "negativ"
```

Was gibt das Programm für die Eingabe `0` aus?

- [ ] A) `positiv`
- [ ] B) `negativ`
- [ ] C) `null`
- [ ] D) Es wird nichts ausgegeben

---

### Aufgabe 8 — Codeanalyse: Kommentieren *(Kommentiere den Quelltext)*

Kommentieren Sie jeden markierten Bereich (`// ???`) mit einer sinnvollen Erklärung:

```java
Scanner sc = new Scanner(System.in);
System.out.print("Temperatur: ");
double temp = sc.nextDouble();   // ???

if (temp < 0) {                  // ???
    System.out.println("Frost");
} else if (temp < 20) {          // ???
    System.out.println("Kühl");
} else {                         // ???
    System.out.println("Warm");
}
```

---

## Teil B – Mittlere Aufgaben *(je ca. 10–15 Min.)*

---

### Aufgabe 9 — Rabattsystem *(Coding)*

Ein Online-Shop gewährt folgende Rabatte:

| Bestellwert       | Rabatt |
|-------------------|--------|
| Bis 50 €          | 0 %    |
| 50,01 € – 100 €   | 5 %    |
| 100,01 € – 500 €  | 10 %   |
| Über 500 €        | 15 %   |

Schreiben Sie ein Programm, das den Bestellwert einliest und den Endpreis (2 Nachkommastellen) ausgibt.

---

### Aufgabe 10 — PAP zeichnen *(PAP)*

Zeichnen Sie den Programmablaufplan für folgende Aufgabe:

> Ein Benutzer gibt zwei Zahlen `a` und `b` ein. Das Programm gibt die **größere** der beiden Zahlen aus. Sind beide gleich, wird `"Gleich"` ausgegeben.

Verwenden Sie die Standardsymbole: Oval (Start/Ende), Rechteck (Verarbeitung/Ausgabe), Raute (Entscheidung).

---

### Aufgabe 11 — Ampelsteuerung per switch *(Coding)*

Ein Benutzer gibt eine Farbe ein (`rot`, `gelb`, `gruen`). Das Programm soll die entsprechende Bedeutung ausgeben:

- `rot` → `"Halt!"`
- `gelb` → `"Achtung!"`
- `gruen` → `"Fahren!"`
- sonst → `"Unbekannte Farbe"`

Verwenden Sie `switch`. Tipp: `String`-Vergleich im switch ist in Java erlaubt.

---

### Aufgabe 12 — Codeanalyse: Semantischen Fehler finden *(Multiple Choice)*

```java
double preis = 120.0;
double rabatt = 0.0;

if (preis > 100) {
    rabatt = 0.1;
}
if (preis > 50) {
    rabatt = 0.05;
}

double endpreis = preis * (1 - rabatt);
System.out.printf("Endpreis: %.2f€%n", endpreis);
```

Welche Aussage beschreibt das Problem korrekt?

- [ ] A) Es liegt ein Compilerfehler vor, `double` ist kein gültiger Typ
- [ ] B) Beide `if`-Bedingungen sind wahr für `preis = 120`, daher wird `rabatt` auf `0.05` überschrieben — der höhere Rabatt wird nicht angewandt
- [ ] C) `printf` ist nicht erlaubt bei `double`-Werten
- [ ] D) `1 - rabatt` erzeugt einen Überlauf

---

### Aufgabe 13 — BMI-Berechnung *(Coding)*

Schreiben Sie ein Programm, das Größe (in cm) und Gewicht (in kg) einliest und den BMI berechnet (`BMI = kg / (m * m)`). Geben Sie anschließend aus:

- BMI < 18,5 → `"Untergewicht"`
- 18,5 ≤ BMI < 25 → `"Normalgewicht"`
- BMI ≥ 25 → `"Übergewicht"`

---

## Teil C – Aufgaben auf Stufe-3-Niveau *(komplex)*

---

### Aufgabe 14 — Schaltjahr vollständig *(Coding + PAP)*

**a)** Zeichnen Sie den Programmablaufplan für die Schaltjahrprüfung:

- Teilbar durch 4 → Schaltjahr  
- Außer: teilbar durch 100 → kein Schaltjahr  
- Außer: teilbar durch 400 → doch Schaltjahr

**b)** Implementieren Sie die Methode:

```java
public static boolean istSchaltjahr(int jahr) {
    // Ihre Lösung hier
}
```

**c)** Testen Sie mit folgenden Jahren und geben Sie Erwartungswert und tatsächlichen Wert an:

| Jahr | Erwartetes Ergebnis |
|------|---------------------|
| 2000 | Schaltjahr          |
| 1900 | Kein Schaltjahr     |
| 2024 | Schaltjahr          |
| 2023 | Kein Schaltjahr     |

---

### Aufgabe 15 — Währungsrechner mit Menü *(Coding)*

Schreiben Sie ein Programm, das dem Benutzer ein Menü zur Auswahl einer Währung anzeigt:

```
1 - USD (Dollar)     Kurs: 1 EUR = 1.09 USD
2 - GBP (Pfund)      Kurs: 1 EUR = 0.86 GBP
3 - JPY (Yen)        Kurs: 1 EUR = 163 JPY
0 - Beenden
```

- Eingabe: Menüauswahl (int) + Betrag in Euro
- Ausgabe: Umgerechneter Betrag (2 Nachkommastellen)
- Ungültige Auswahl → Fehlermeldung, kein Absturz
- `0` → Programm gibt `"Auf Wiedersehen!"` aus und endet

Verwenden Sie `switch` für die Währungsauswahl und `if` für die Eingabeprüfung.
