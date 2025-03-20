package de.home.playgrounds.javabasics.exercise3_collections;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        ArrayList<Address> addressArrayListRemy = new ArrayList<>();

        Address addressRemy1 = new Address("Ratatouillestr.", "12", "19222", "Paris", CountryCodes.FRANCE_CODE);
        Address addressRemy2 = new Address("Fromagestr.", "2", "13322", "Paris", CountryCodes.FRANCE_CODE);
        addressArrayListRemy.add(addressRemy1);
        addressArrayListRemy.add(addressRemy2);

        //TODO - in der Klasse Adresse eine methode getFullAddress() erstellen
        //TODO - eine neue Adresse soll direkt der passenden Arraylist hinzugefügt werden

        Person remy = new Person("Remy", "Ratatouille", 'M', 2, addressRemy1 );

        System.out.println(remy.getFirstName());
        System.out.println(addressArrayListRemy.getLast());  // TODO hier soll statt einer Objektreferenz die Adresse zusammengebaut werden

        System.out.println(remy.getFirstName() + " is thinking about moving. His current Address is: " + addressRemy1);
        remy.move(addressRemy1, addressRemy2);
/*

        for( Address element : addressArrayListRemy) {
            System.out.println();
        }
*/
    }
}
