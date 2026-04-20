# Lösungsblatt 5 – Programmablaufpläne (PAP)

---

## Aufgabe 1 — PAP auswerten

**Lösung: C) `4`**

`x = -4` → Bedingung `x >= 0` ist `false` → `y = x * -1 = -4 * -1 = 4` → Ausgabe `4`

---

## Aufgabe 2 — PAP auswerten

**Lösung: C) `24`**

Berechnet wird: `1 * 2 * 3 * 4 = 24` (Fakultät von 4)

---

## Aufgabe 3 — Schleifen-Trace

| Schritt | i | produkt | Bedingung `i <= 4` |
|---------|---|---------|---------------------|
| Start   | 1 | 1       | —                   |
| 1       | 2 | 1       | Ja                  |
| 2       | 3 | 2       | Ja                  |
| 3       | 4 | 6       | Ja                  |
| 4       | 5 | 24      | Ja                  |
| Ende    | 5 | 24      | Nein → Ausgabe `24` |

*Hinweis: `produkt * i` wird berechnet, dann `i` erhöht. In Schritt 1: `produkt = 1 * 1 = 1`, dann `i = 2`.*

---

## Aufgabe 4 — PAP auswerten

**Lösung: A) `a=3, b=7`**

`a=3, b=7` → Bedingung `a > b` → `3 > 7` ist `false` → kein Tausch → Ausgabe: `a=3, b=7`

---

## Aufgabe 5 — PAP → Code

```java
import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n eingeben: ");
        int n = sc.nextInt();

        int i = n;
        while (i >= 1) {
            System.out.println(i);
            i = i - 1;
        }
    }
}
```

---

## Aufgabe 6 — Was macht der Algorithmus?

**Lösung: C) Prüft ob `zahl` gerade oder ungerade ist**

`rest = zahl % 2`: Wenn `rest == 0` → gerade, sonst → ungerade.

---

## Aufgabe 7 — PAP-Trace: Mitgliedschaft

| Eingabe `alter` | Ausgabe        |
|-----------------|----------------|
| 16              | `"Jugendlich"` |
| 19              | `"Erwachsen"`  |
| 25              | `"Senior-Mitglied"` |

Begründungen:
- 16: `16 >= 18` → `false` → `"Jugendlich"`
- 19: `19 >= 18` → `true` → `19 >= 21` → `false` → `"Erwachsen"`
- 25: `25 >= 18` → `true` → `25 >= 21` → `true` → `"Senior-Mitglied"`

---

## Aufgabe 8 — PAP → Code: Summe Vielfache von 3

```java
public class SummeVielfache {
    public static void main(String[] args) {
        int summe = 0;
        int i = 1;

        while (i <= 100) {
            if (i % 3 == 0) {
                summe += i;
            }
            i++;
        }

        System.out.println("Summe: " + summe);  // 1683
    }
}
```

---

## Aufgabe 9 — PAP: Notenbewertung

```
        ┌──────────────────┐
        │      START       │
        └────────┬─────────┘
                 ▼
        ┌──────────────────┐
        │   Lies note      │
        └────────┬─────────┘
                 ▼
        ◇ note >= 1 && note <= 6 ?
       /                           \
     Ja                            Nein
      ▼                              ▼
◇ note <= 2 ?                  "Ungültige Note"
 /          \                        │
Ja          Nein                     ▼
 ▼            ▼                    ENDE
"Sehr gut /  ◇ note <= 4 ?
 Gut"        /           \
  │        Ja            Nein
  │         ▼              ▼
  │  "Befriedigend/   "Nicht
  │   Ausreichend"    bestanden"
  │        │              │
  └────────┴──────┬───────┘
                  ▼
                ENDE
```

---

## Aufgabe 10 — PAP: Minimum im Array

```
        ┌──────────────────────┐
        │         START        │
        └──────────┬───────────┘
                   ▼
        ┌──────────────────────┐
        │  min = arr[0]        │
        │  i = 1               │
        └──────────┬───────────┘
                   ▼
        ◇  i < arr.length ?
       /                    \
     Ja                     Nein
      ▼                       ▼
◇ arr[i] < min ?       ┌────────────────┐
 /             \        │  return min    │
Ja             Nein     └───────┬────────┘
 ▼               │              ▼
min = arr[i]     │            ENDE
  │              │
  └──────┬───────┘
         ▼
       i = i + 1
         └──► (zurück zu i < arr.length ?)
```

---

## Aufgabe 11 — PAP lesen und Code schreiben

**a) Ausgabe für n = 4:**

```
1
1 2
1 2 3
1 2 3 4
```

**b) Java-Code:**

```java
public class Zahlendreieck {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
```

---

## Aufgabe 12 — PAP: Passwort mit 3 Versuchen

```
        ┌──────────────────────────┐
        │           START          │
        └────────────┬─────────────┘
                     ▼
        ┌──────────────────────────┐
        │  versuche = 0            │
        └────────────┬─────────────┘
                     ▼
        ◇  versuche < 3 ?
       /                  \
     Ja                   Nein
      ▼                     ▼
Lies passwort           "Gesperrt!"
      │                     │
      ▼                     ▼
◇ passwort == "java2024" ?   ENDE
 /                        \
Ja                        Nein
 ▼                          ▼
"Willkommen!"         versuche = versuche + 1
      │                     │
      ▼                     └──► (zurück zu versuche < 3 ?)
    ENDE
```

---

## Aufgabe 13 — Sortieralgorithmus identifizieren

**Lösung: C) Bubble Sort**

Erkennungsmerkmale: Benachbarte Elemente werden verglichen und getauscht. Die Variable `getauscht` ermöglicht einen frühzeitigen Abbruch. Dies ist ein optimierter Bubble Sort.

**Bonus-Trace für `{3, 1, 4, 1}`:**

Durchlauf 1 (getauscht=false, j von 0 bis 2):
- j=0: `3 > 1` → tausch → `{1, 3, 4, 1}`, getauscht=true
- j=1: `3 > 4` → false → kein Tausch
- j=2: `4 > 1` → tausch → `{1, 3, 1, 4}`, getauscht=true

Durchlauf 2 (getauscht=false, j von 0 bis 2):
- j=0: `1 > 3` → false
- j=1: `3 > 1` → tausch → `{1, 1, 3, 4}`, getauscht=true
- j=2: `3 > 4` → false

Durchlauf 3 (getauscht=false, j von 0 bis 2):
- j=0: `1 > 1` → false
- j=1: `1 > 3` → false
- j=2: `3 > 4` → false
- getauscht bleibt false → Ende

Ergebnis: `{1, 1, 3, 4}` ✓

---

## Aufgabe 14 — Schaltjahr vervollständigen

**a) Vollständiger PAP:**

```
        ┌──────────────────┐
        │      START       │
        └────────┬─────────┘
                 ▼
        ┌──────────────────┐
        │   Lies jahr      │
        └────────┬─────────┘
                 ▼
        ◇ jahr % 4 == 0 ?
       /                  \
     Ja                   Nein
      ▼                     ▼
◇ jahr % 100 == 0 ?    "Kein Schaltjahr"
 /                \           │
Ja               Nein         ▼
 ▼                 ▼        ENDE
◇ jahr % 400 == 0 ?  "Schaltjahr"
 /               \
Ja               Nein
 ▼                 ▼
"Schaltjahr"  "Kein Schaltjahr"
```

**b) Java-Methode:**

```java
public static boolean istSchaltjahr(int jahr) {
    if (jahr % 4 == 0) {
        if (jahr % 100 == 0) {
            if (jahr % 400 == 0) {
                return true;   // Schaltjahr (z.B. 2000)
            } else {
                return false;  // Kein Schaltjahr (z.B. 1900)
            }
        } else {
            return true;       // Schaltjahr (z.B. 2024)
        }
    } else {
        return false;          // Kein Schaltjahr (z.B. 2023)
    }
}
```

---

## Aufgabe 15 — PAP + Code + Analyse

**a) PAP für `summeGerade`:**

```
        ┌──────────────────────────┐
        │          START           │
        └────────────┬─────────────┘
                     ▼
        ┌──────────────────────────┐
        │  summe = 0, i = 0        │
        └────────────┬─────────────┘
                     ▼
        ◇  i < arr.length ?
       /                    \
     Ja                     Nein
      ▼                       ▼
◇ arr[i] % 2 == 0 ?     return summe ──► ENDE
 /                  \
Ja                  Nein
 ▼                    │
summe += arr[i]        │
  │                    │
  └──────────┬─────────┘
             ▼
           i = i + 1
             └──► (zurück zu i < arr.length ?)
```

**b) Rückgabewert:**

**Lösung: B) `12`**

Gerade Zahlen in `{1, 2, 3, 4, 5, 6}`: `2 + 4 + 6 = 12`

**c) Methode für ungerade Zahlen:**

Name: `summeUngerade`  
Änderung: Bedingung `arr[i] % 2 == 0` zu `arr[i] % 2 != 0` (oder `arr[i] % 2 == 1`)

```java
public static int summeUngerade(int[] arr) {
    int summe = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 != 0) {
            summe += arr[i];
        }
    }
    return summe;
}
```
