package de.home.playgrounds.javabasics.lecture6_UML_part1;

public class Application {
    public static void main(String[] args) {
        Address a1 = new Address("street 1", "Berlin", "11111", "100");

        // Check 1: Person anlegen OHNE richtige Addresse: => Anwendung stirbt mit Fehler
        // Person p1 = new Person("Ska", "Chris", 33, null);

        // Check 2: Person anlegen MIT noch nicht verwendeter Addresse => sollte klappen
        Person p2 = new Person("Ska", "Chris", 33, a1);

        // Check 3: Person anlegen MIT schon verwendeter Addresse => Anwendung stirbt mit Fehler
        // Person p3 = new Person("Gofman", "Anna", 30, a1);
    }
}
