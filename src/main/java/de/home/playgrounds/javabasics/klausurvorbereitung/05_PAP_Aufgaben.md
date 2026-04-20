# Aufgabenblatt 5 – Programmablaufpläne (PAP)

> **Thema:** PAPs lesen, auswerten, zeichnen und in Code übersetzen  
> **Symbole:** Oval = Start/Ende · Rechteck = Verarbeitung/Ausgabe/Eingabe · Raute = Entscheidung · Pfeile = Ablauf

---

## Teil A – Einfache Aufgaben: PAP lesen *(je ca. 3–5 Min.)*

---

### Aufgabe 1 — PAP auswerten *(Single Choice)*

```
START
  │
  ▼
Lies x
  │
  ▼
◇ x >= 0 ?
 /       \
Ja       Nein
 ▼         ▼
y = x * 2  y = x * -1
 \         /
  ▼       ▼
 Ausgabe y
  │
  ▼
ENDE
```

Was gibt das Programm für `x = -4` aus?

- [ ] A) `-8`
- [ ] B) `-4`
- [ ] C) `4`
- [ ] D) `8`

---

### Aufgabe 2 — PAP auswerten *(Single Choice)*

```
START
  │
  ▼
i = 1, produkt = 1
  │
  ▼  ┌────────────────────────┐
◇ i <= 4 ?──Nein──► Ausgabe produkt ──► ENDE
  │ Ja
  ▼
produkt = produkt * i
  │
  ▼
i = i + 1
  └──► (zurück zu i <= 4 ?)
```

Was gibt das Programm aus?

- [ ] A) `10`
- [ ] B) `16`
- [ ] C) `24`
- [ ] D) `4`

---

### Aufgabe 3 — PAP auswerten: Schleifen-Trace *(Tabelle ausfüllen)*

Verfolgen Sie den PAP aus Aufgabe 2 Schritt für Schritt. Füllen Sie die Trace-Tabelle aus:

| Schritt | i | produkt | Bedingung `i <= 4` |
|---------|---|---------|---------------------|
| Start   | 1 | 1       | —                   |
| 1       |   |         |                     |
| 2       |   |         |                     |
| 3       |   |         |                     |
| 4       |   |         |                     |
| Ende    |   |         | Nein → Ausgabe      |

---

### Aufgabe 4 — PAP auswerten *(Single Choice)*

```
START
  │
  ▼
Lies a, b
  │
  ▼
◇ a > b ?
 /       \
Ja       Nein
 ▼         ▼
temp = a   (weiter)
a = b
b = temp
  \       /
   ▼     ▼
Ausgabe a, b
  │
  ▼
ENDE
```

Was gibt das Programm für `a = 3, b = 7` aus?

- [ ] A) `a=3, b=7`
- [ ] B) `a=7, b=3`
- [ ] C) `a=7, b=7`
- [ ] D) `a=3, b=3`

---

### Aufgabe 5 — PAP → Code übersetzen *(Coding)*

Übersetzen Sie folgenden PAP in Java-Code:

```
START
  │
  ▼
Lies n
  │
  ▼
i = n
  │
  ▼  ┌────────────────┐
◇ i >= 1 ?──Nein──► ENDE
  │ Ja
  ▼
Ausgabe i
  │
  ▼
i = i - 1
  └──► (zurück zu i >= 1 ?)
```

---

### Aufgabe 6 — PAP auswerten: Was macht der Algorithmus? *(Single Choice)*

```
START
  │
  ▼
Lies zahl
  │
  ▼
rest = zahl % 2
  │
  ▼
◇ rest == 0 ?
 /           \
Ja           Nein
 ▼             ▼
"gerade"    "ungerade"
  │             │
  └──────┬──────┘
         ▼
        ENDE
```

Was macht dieser Algorithmus?

- [ ] A) Prüft ob `zahl` positiv ist
- [ ] B) Prüft ob `zahl` durch 3 teilbar ist
- [ ] C) Prüft ob `zahl` gerade oder ungerade ist
- [ ] D) Berechnet den Rest der Division durch 2 und gibt ihn aus

---

### Aufgabe 7 — PAP mit verschachtelter Bedingung: Trace *(Tabelle ausfüllen)*

```
START
  │
  ▼
Lies alter
  │
  ▼
◇ alter >= 18 ?
 /              \
Ja              Nein
 ▼                ▼
◇ alter >= 21 ?  "Jugendlich"
 /           \
Ja           Nein
 ▼             ▼
"Senior-      "Erwachsen"
 Mitglied"
```

Füllen Sie die Tabelle aus:

| Eingabe `alter` | Ausgabe |
|-----------------|---------|
| 16              |         |
| 19              |         |
| 25              |         |

---

### Aufgabe 8 — PAP → Code übersetzen *(Coding)*

Übersetzen Sie folgenden PAP in Java:

```
START
  │
  ▼
summe = 0, i = 1
  │
  ▼  ┌──────────────────────────────────────┐
◇ i <= 100 ?──Nein──► Ausgabe summe ──► ENDE
  │ Ja
  ▼
◇ i % 3 == 0 ?
 /            \
Ja            Nein
 ▼              │
summe += i      │
  │             │
  └──────┬──────┘
         ▼
       i = i + 1
         └──► (zurück)
```

---

## Teil B – Mittlere Aufgaben: PAP zeichnen *(je ca. 10–15 Min.)*

---

### Aufgabe 9 — PAP zeichnen: Notenbewertung *(PAP)*

Zeichnen Sie den vollständigen PAP für folgende Aufgabe:

> Lesen Sie eine Note (1–6) ein. Geben Sie aus:
> - Note 1 oder 2: `"Sehr gut / Gut"`
> - Note 3 oder 4: `"Befriedigend / Ausreichend"`
> - Note 5 oder 6: `"Nicht bestanden"`
> - Sonst: `"Ungültige Note"`

---

### Aufgabe 10 — PAP zeichnen: Minimum im Array *(PAP)*

Zeichnen Sie den PAP für eine Methode, die das **Minimum** eines Integer-Arrays findet:

- Startet mit `min = arr[0]`
- Vergleicht jedes Element mit dem aktuellen Minimum
- Gibt das Minimum am Ende zurück

---

### Aufgabe 11 — PAP lesen und Code schreiben *(PAP + Coding)*

```
START
  │
  ▼
Lies n
  │
  ▼
i = 1
  │
  ▼  ┌─────────────────────┐
◇ i <= n ?──Nein──► ENDE
  │ Ja
  ▼
j = 1
  │
  ▼  ┌──────────────────────────────┐
◇ j <= i ?──Nein──► Zeilenumbruch ──┐
  │ Ja                               │
  ▼                                  │
Ausgabe j                            │
  │                                  │
  ▼                                  │
j = j + 1                            │
  └──► (zurück zu j <= i ?)          │
                                     ▼
                                   i = i + 1
                                     │
                                     └──► (zurück zu i <= n ?)
```

**a)** Was gibt das Programm für `n = 4` aus?

**b)** Schreiben Sie den entsprechenden Java-Code.

---

### Aufgabe 12 — PAP zeichnen: Passworteingabe mit Schleife *(PAP)*

Zeichnen Sie den PAP für folgende Aufgabe:

> Das Programm fragt den Benutzer nach einem Passwort. Er hat **maximal 3 Versuche**. Nach dem richtigen Passwort (`"java2024"`) → `"Willkommen!"`. Nach 3 Fehlversuchen → `"Gesperrt!"`.

---

## Teil C – Aufgaben auf Stufe-3-Niveau

---

### Aufgabe 13 — Komplexer PAP auswerten *(PAP-Trace + Single Choice)*

```
START
  │
  ▼
Lies arr[] mit n Elementen
  │
  ▼
i = 0, getauscht = true
  │
  ▼
◇ getauscht == true ?──Nein──► Ausgabe arr ──► ENDE
  │ Ja
  ▼
getauscht = false
  │
  ▼
j = 0
  │
  ▼  ┌───────────────────────────────────────┐
◇ j < n-1 ?──Nein──► (zurück zu getauscht == true ?)
  │ Ja
  ▼
◇ arr[j] > arr[j+1] ?
 /                   \
Ja                   Nein
 ▼                     │
temp = arr[j]          │
arr[j] = arr[j+1]      │
arr[j+1] = temp        │
getauscht = true        │
  │                     │
  └──────────┬──────────┘
             ▼
           j = j + 1
             └──► (zurück zu j < n-1 ?)
```

Welcher Sortieralgorithmus wird hier beschrieben?

- [ ] A) Selection Sort
- [ ] B) Insertion Sort
- [ ] C) Bubble Sort
- [ ] D) Quick Sort

**Bonus:** Verfolgen Sie den Algorithmus für `arr = {3, 1, 4, 1}` und schreiben Sie alle Zwischenzustände auf.

---

### Aufgabe 14 — PAP für Schaltjahr vervollständigen *(PAP)*

Gegeben ist ein unvollständiger PAP:

```
START
  │
  ▼
Lies jahr
  │
  ▼
◇ jahr % 4 == 0 ?
 /               \
Ja               Nein
 ▼                 ▼
???           "Kein Schaltjahr"
```

**a)** Vervollständigen Sie den PAP so, dass er die vollständige Schaltjahrlogik abbildet (100er-Regel und 400er-Ausnahme).

**b)** Schreiben Sie den zugehörigen Java-Code als Methode `boolean istSchaltjahr(int jahr)`.

---

### Aufgabe 15 — PAP → Code + Analyse *(PAP + Coding + Multiple Choice)*

**a)** Zeichnen Sie den PAP für folgende Methode:

```java
public static int summeGerade(int[] arr) {
    int summe = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
            summe += arr[i];
        }
    }
    return summe;
}
```

**b)** Was gibt `summeGerade(new int[]{1, 2, 3, 4, 5, 6})` zurück?

- [ ] A) `21`
- [ ] B) `12`
- [ ] C) `6`
- [ ] D) `9`

**c)** Wie müsste die Methode heißen und was müsste sich ändern, wenn stattdessen die Summe der **ungeraden** Zahlen berechnet werden soll?
