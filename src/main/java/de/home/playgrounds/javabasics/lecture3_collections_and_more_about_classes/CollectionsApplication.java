package de.home.playgrounds.javabasics.lecture3_collections_and_more_about_classes;

import java.util.ArrayList;

public class CollectionsApplication {
    public static void main(String[] args) {
        // Arrays
        int[] ganzZahlenArray = new int[4]; // Leeres Array vom Typ int mit 4 Elementen anlegen
        Address[] addressArray = new Address[2]; // Leeres Array vom Typ Address mit 2 Elementen

        // Auf Array-Elemente zugreifen
        int erstesElementGanzzahlenArray = ganzZahlenArray[0];
        System.out.println(erstesElementGanzzahlenArray);

        Address zweiteAddresseImArray = addressArray[1];
        System.out.println(zweiteAddresseImArray);

        // Standarverhalten beim Erzeugen über Größenangabe: Nimmt Default-Values abhängig vom Datentyps. (zB. für int => 0, boolean => false, für komplexe Datentypen (wie Address) => null)

        // Weitere Variante zum Erzeugen
        boolean[] wahrheitsWertArray = new boolean[] {false, true, true, false, false, true, true}; // Array mit initialen Werten ohne Größenangabe => in diesem Fall mit 7 Wahrheitswerten
        int wahrheitsWertArrayLaenge = wahrheitsWertArray.length; // Länge des Arrays
        System.out.println(wahrheitsWertArrayLaenge);

        // Auf einen Wert außerhalb des Arrays zugreifen
        // int negativIndexWert = ganzZahlenArray[-1]; // Negativer Index wird in einen ArrayIndexOutOfBounds Fehler laufen
        // int zuGroßerIndexWert = ganzZahlenArray[10000]; // Auch hier wird ein ArrayIndexOutOfBounds Fehler kommen

        // Wertzuweisung
        Address address1 = new Address("Buckower Damm", "137", "12349", "BÄRLIN", CountryCodes.GERMAN_CODE);
        addressArray[0] = address1;
        System.out.println(addressArray[0].getCity());
        // addressArray[10000] = address1; // Auch beim Zuweisen auf eine Indexposition außerhalb des Arrays wird ein ArrayIndexOutOfBounds Fehler kommen

        ganzZahlenArray[0] = 10;
        ganzZahlenArray[1] = 100;
        ganzZahlenArray[2] = 500;
        ganzZahlenArray[3] = 69;

        // Aktion für jedes Array-Element über Schleifen => For-Loop mit 0 als Start und lenght als Ende
        for (int i = 0; i < ganzZahlenArray.length; i++) {
            System.out.println(ganzZahlenArray[i]);
        }

        // Alternativ: In den meisten Fällen besser eine foreach:
        for (int element : ganzZahlenArray) {
            System.out.println(element);
        }

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        // INTRO in die erste Collection von Java => ArrayList
        ArrayList<Address> addressArrayList = new ArrayList<>();
        System.out.println(addressArrayList.size());
        Address address2 = new Address("Dovestraße", "13", "10587", "Gölln", CountryCodes.GERMAN_CODE);
        addressArrayList.add(address1);
        System.out.println(addressArrayList.size());
        addressArrayList.add(address2);
        System.out.println(addressArrayList.size());
        addressArrayList.add(address1);
        System.out.println(addressArrayList.size());

        // Auf Elemente zugreifen => .get(index) Funktion (Verhalten) mit Index aufrufen
        System.out.println(addressArrayList.get(1).getCity());
        // System.out.println(addressArrayList.get(-1)); // Hier wird analog zum Array ein Fehler kommen (Index out of Bounds)
        // System.out.println(addressArrayList.get(10000)); // Hier wird analog zum Array ein Fehler kommen

        // for loop fürs Ausführen von Logik für jedes Element
        System.out.println("--For--");
        for (int i = 0; i < addressArrayList.size(); i++) {
            System.out.println(addressArrayList.get(i).getStreetName() + " " + addressArrayList.get(i).getHouseNumber() + ", " + addressArrayList.get(i).getZipCode() + " " + addressArrayList.get(i).getCity());
        }
        System.out.println("--Foreach--");
        // Das selbe Spielchen können wir, analog zu Arrays, auch wieder über eine foreach-Loop lösen
        for (Address element : addressArrayList) {
            System.out.println(element.getStreetName() + " " + element.getHouseNumber() + ", " + element.getZipCode() + " " + element.getCity());
        }

        // Listen können komplett geleert werden

        System.out.println("--Clear list--");
        addressArrayList.clear();
        System.out.println(addressArrayList.size());
    }
}
