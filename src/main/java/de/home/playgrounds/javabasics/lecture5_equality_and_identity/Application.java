package de.home.playgrounds.javabasics.lecture5_equality_and_identity;

public class Application {
    public static void main(String[] args) {
        int aNumber = 10; // auf dem Speicher IMMER 32 bit (bzw. abhängig der Kiste kann das auch mal 64bit) // Speicheradresse wird xFEEE10087, Größe ist 32 bit
        int aSecondNumber = 100;
        aNumber = 5;
        aNumber = aSecondNumber;

        MyComplexDatatype d1 = new MyComplexDatatype(10);
        d1.number = 100;
        int aThirdNumber = d1.number;
        d1.number = 1000;

        MyComplexDatatype d2 = new MyComplexDatatype(5);
        d2.number = d1.number;

        MyComplexDatatype d3 = d1;
        System.out.println("d1: " + d1.number);
        System.out.println("d3: " + d3.number);
        d3.number = 2;
        System.out.println("d1: " + d1.number);
        System.out.println("d3: " + d3.number);
        MyComplexDatatype d4 = new MyComplexDatatype(5);
        d3 = d4;

        System.out.println("----------------s");

        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1 == b2); // Bei Elementaren Datentypen wird der Wert verglichen -> demnach gibt die Syso hier "false" aus
        b2 = true;
        System.out.println(b1 == b2); // Bei Elementaren Datentypen wird der Wert verglichen -> demnach gibt die Syso hier "true" aus

        MyComplexDatatype d5 = new MyComplexDatatype(5);
        MyComplexDatatype d6 = new MyComplexDatatype(5);

        System.out.println("---");
        System.out.println(d5 == d6); // Bei komplexen Datentypen wird mit "==" die IDENTITÄT geprüft => Sprich, Zeigen beide auf den gleichen Speicherbereich -> demnach gibt die Syso hier "false" aus
        d6 = d5; // d6 zeigt nun auf den gleichen Speicherbereich wie d5
        System.out.println(d5 == d6); // Bei komplexen Datentypen wird mit "==" die IDENTITÄT geprüft => Sprich, Zeigen beide auf den gleichen Speicherbereich -> demnach gibt die Syso hier "true" aus

        System.out.println("-----");
        d6 = new MyComplexDatatype(5); // Zum Präsentieren von GLEICHHEIT d6 NOCHMAL auf neuen Speicherbereich zeigen lassen
        System.out.println(d5.equals(d6)); // Standard-Equals ist in Java gleichzusetzen mit Identitätsprüfung
        d6 = d5; // Zum Beweis wieder auf den gleichen Speicherberich referenzieren
        System.out.println(d5.equals(d6)); // Standard-Equals ist in Java gleichzusetzen mit Identitätsprüfung

        // In der Regel soll aber für uns als Menschen Gleichheit bedeuten, dass die Werte von Objekten "gut genug" übereinstimmen
        Article a1 = new Article("1", "Buch");
        Article a2 = new Article("2", "Buch");

        // Als DB Entwickler sind für mich zwei Artikel GLEICH, wenn ihre Ids übereinstimmen => MEINE CUSTOM LOGIK
        System.out.println(a1.isDatabaseEquals(a2)); // Da Implementierung Ids checkt, und diese unterschiedlich sind => false, Sie sind für den DB entwickler NICHT GLEICH
        System.out.println(Article.databaseCompare(a1, a2)); // Anderer Aufruf, gleich check => false
        Article a3 = new Article("1", "Buch");
        System.out.println(a3.isTrueEquals(a1)); // Da Implementierung alle Werte vergleicht und diese komplett gleich sind => true
        System.out.println(a3.isTrueEquals(a2)); // Da Id unterschiedlich => false

        System.out.println("----"); // Wir benutzen nun überschriebenes Equals
        System.out.println(a3.equals(a1)); // hoffentlich, da gleiche Implementierung wie unser custom code => true
        System.out.println(a3.equals(a2)); // hoffentlich, da gleiche Implementierung wie unser custom code => false

    }
}
