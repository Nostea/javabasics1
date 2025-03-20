package de.home.playgrounds.javabasics.lecture3_collections_and_more_about_classes;

public class Application {

    public static void main(String[] args) {
        Address address1 = new Address("Lustiger Damm", "32", "12333", "BÖRLIN", CountryCodes.GERMAN_CODE);
        Address address2 = new Address("Taubenstraße", "3", "12033", "Berlin", CountryCodes.GERMAN_CODE);
        Person p1 = new Person("Christopher", "Skamrahl", Person.GENDER_MALE, 33, address1);
        Person p2 = new Person("Anna", "Gofman", Person.GENDER_FEMALE, 30, address2);
        System.out.println("We created " + Person.getPersonCounter() + " persons.");
        p2.move(address2, address1);
        System.out.println("Person " + p2.getFirstName() + " moved. Is now living in " + p2.getAddress().getCity());
    }
}
