# Aufgabenblatt 4 – Kombinierte Aufgaben

> **Thema:** if/else + Schleifen + Arrays kombiniert  
> **Hilfsmittel:** kein Internet, keine KI, Java-API-Kurzreferenz erlaubt

---

## Teil A – Einfache Aufgaben *(je ca. 3–5 Min.)*

---

### Aufgabe 1 — Array filtern *(Coding)*

Gegeben:
```java
int[] zahlen = {-5, 3, -1, 8, 0, -4, 12, 7};
```

Schreiben Sie eine Schleife, die nur die **positiven** Zahlen (> 0) ausgibt.

---

### Aufgabe 2 — Codeanalyse: Was wird ausgegeben? *(Single Choice)*

```java
int[] werte = {2, 5, 1, 8, 3};
int zaehler = 0;

for (int w : werte) {
    if (w > 3) {
        zaehler++;
    }
}
System.out.println(zaehler);
```

Was gibt das Programm aus?

- [ ] A) `2`
- [ ] B) `3`
- [ ] C) `5`
- [ ] D) `8`

---

### Aufgabe 3 — Celsius zu Fahrenheit *(Coding)*

Schreiben Sie ein Programm, das eine Tabelle für Temperaturen von **0°C bis 100°C** (in 10er-Schritten) ausgibt.  
Formel: `F = C * 9/5 + 32`

**Beispielausgabe:**
```
 0°C =  32.0°F
10°C =  50.0°F
...
```

---

### Aufgabe 4 — Fehler finden *(Multiple Choice)*

```java
String[] farben = {"Rot", "Grün", "Blau"};

for (int i = 0; i <= farben.length; i++) {
    if (farben[i].equals("Grün")) {
        System.out.println("Gefunden!");
    }
}
```

Was ist das Problem?

- [ ] A) `equals` funktioniert nicht für Strings — man muss `==` verwenden
- [ ] B) Die Schleife iteriert bis `i <= farben.length` (Index 3), aber gültiger letzter Index ist 2 → `ArrayIndexOutOfBoundsException`
- [ ] C) Das Array kann keine Strings speichern
- [ ] D) Es gibt kein Problem

---

### Aufgabe 5 — Negativen Wert ersetzen *(Coding)*

Gegeben:
```java
int[] temperaturen = {4, -2, 7, -5, 3, -1, 9};
```

Ersetzen Sie alle negativen Werte durch `0` und geben Sie das veränderte Array aus.

---

### Aufgabe 6 — PAP lesen *(Single Choice)*

```
START
  │
  ▼
Lies zahlen[] (Array)
  │
  ▼
treffer = 0, i = 0
  │
  ▼  ┌──────────────────────┐
◇ i < zahlen.length ?──Nein──► Ausgabe treffer ──► ENDE
  │ Ja
  ▼
◇ zahlen[i] % 2 == 0 ?
  │ Ja          Nein
  ▼              │
treffer++        │
  └──────┬───────┘
         ▼
       i = i + 1
         └──► (zurück)
```

Was berechnet dieser Algorithmus?

- [ ] A) Die Summe aller geraden Zahlen im Array
- [ ] B) Die Anzahl der geraden Zahlen im Array
- [ ] C) Den Index der ersten geraden Zahl
- [ ] D) Ob alle Zahlen gerade sind

---

### Aufgabe 7 — Codeanalyse: Kommentieren *(Kommentiere den Quelltext)*

```java
int[] preise = {120, 45, 200, 30, 89};
double summe = 0;

for (int preis : preise) {    // ???
    if (preis > 100) {         // ???
        summe += preis * 0.9;  // ???
    } else {
        summe += preis;        // ???
    }
}

System.out.printf("Gesamtbetrag: %.2f€%n", summe);  // ???
```

---

### Aufgabe 8 — Geradzahlen-Summe *(Coding)*

Schreiben Sie ein Programm, das alle geraden Zahlen zwischen 1 und 50 aufsummiert und das Ergebnis ausgibt.

---

## Teil B – Mittlere Aufgaben *(je ca. 10–15 Min.)*

---

### Aufgabe 9 — Noten auswerten *(Coding)*

Lesen Sie 5 Noten (1–6) vom Benutzer ein, speichern Sie diese in einem Array und berechnen Sie:
- Den Durchschnitt (2 Nachkommastellen)
- Die beste Note (kleinster Wert)
- Ob der Schüler bestanden hat (Durchschnitt ≤ 4,0)

---

### Aufgabe 10 — Häufigkeit zählen *(Coding)*

Gegeben:
```java
int[] wurfe = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
```

Zählen Sie, wie oft jede Zahl von 1 bis 9 vorkommt und geben Sie es aus.

**Beispielausgabe:**
```
1: 2x
2: 1x
3: 2x
...
```

*Hinweis: Verwenden Sie ein Zähler-Array der Größe 10.*

---

### Aufgabe 11 — PAP zeichnen *(PAP)*

Zeichnen Sie den Programmablaufplan für folgende Aufgabe:

> Der Benutzer gibt Zahlen ein (beliebig viele), bis er `-1` eingibt. Das Programm berechnet die **Summe** aller eingegebenen Zahlen (ohne die `-1`) und gibt sie am Ende aus.

---

### Aufgabe 12 — Codeanalyse: Semantischen Fehler finden *(Multiple Choice)*

```java
int[] noten = {1, 3, 5, 2, 4};
double summe = 0;
double beste = 0;

for (int note : noten) {
    summe += note;
    if (note > beste) {
        beste = note;
    }
}

double durchschnitt = summe / noten.length;
System.out.printf("Beste Note: %.1f%n", beste);
System.out.printf("Durchschnitt: %.1f%n", durchschnitt);
```

Was ist das Problem?

- [ ] A) `summe` muss `int` sein, nicht `double`
- [ ] B) `beste` ist mit `0` initialisiert und wird auf den **größten** Notenwert gesetzt — bei Noten bedeutet eine niedrigere Zahl besser. Die Logik ist semantisch falsch (findet schlechteste, nicht beste Note)
- [ ] C) `noten.length` gibt die falsche Länge zurück
- [ ] D) Es gibt kein Problem

---

### Aufgabe 13 — FizzBuzz *(Coding)*

Geben Sie alle Zahlen von 1 bis 30 aus, mit folgenden Regeln:
- Teilbar durch 3 → statt der Zahl: `"Fizz"`
- Teilbar durch 5 → `"Buzz"`
- Teilbar durch 3 **und** 5 → `"FizzBuzz"`
- Sonst: die Zahl selbst

---

## Teil C – Aufgaben auf Stufe-3-Niveau

---

### Aufgabe 14 — PC-Händler Rechnungssystem *(Coding)*

Schreiben Sie ein Programm für einen PC-Händler. Der Benutzer kann mehrere Artikel eingeben, bis er `"stop"` eingibt.

Für jeden Artikel wird eingegeben:
- Artikelname (String)
- Anzahl (int)
- Nettopreis pro Stück (double)
- MwSt-Satz (double, z. B. `19.0`)

Das Programm soll am Ende eine **Gesamtrechnung** ausgeben:
- Pro Artikel: Name, Anzahl, Nettobetrag, Bruttobetrag
- Am Ende: Nettosumme und Bruttosumme aller Artikel

Verwenden Sie Arrays für Artikel, Anzahl, Nettopreise und MwSt (maximal 10 Artikel).

---

### Aufgabe 15 — EAN-Prüfziffer *(Coding + Analyse)*

**a) Coding:**

Implementieren Sie einen EAN-13-Prüfziffernrechner. Die EAN-13 besteht aus 13 Ziffern, die letzte ist die Prüfziffer.

Algorithmus:
1. Ziffern 1–12 abwechselnd mit Faktor 1 und 3 multiplizieren (Ziffer 1 mit 1, Ziffer 2 mit 3, ...)
2. Alle Produkte summieren
3. `(10 - (Summe % 10)) % 10` = Prüfziffer

Eingabe: EAN als `String` (13 Ziffern)  
Ausgabe: `"Gültig"` oder `"Ungültig"`

Testen Sie mit: `"9783815820865"` (gültig) und `"1234567890121"` (ungültig).

**b) Codeanalyse *(Multiple Choice)*:**

```java
String ean = "9783815820865";
int[] ziffern = new int[13];

for (int i = 0; i < ean.length(); i++) {
    ziffern[i] = Integer.parseInt(String.valueOf(ean.charAt(i)));
}
```

Was macht `String.valueOf(ean.charAt(i))`?

- [ ] A) Wandelt das Zeichen an Position `i` direkt in eine Ganzzahl um
- [ ] B) Wandelt das `char`-Zeichen zunächst in einen `String` um, damit `Integer.parseInt()` es verarbeiten kann
- [ ] C) Gibt den ASCII-Wert des Zeichens zurück
- [ ] D) Prüft, ob das Zeichen eine Ziffer ist
