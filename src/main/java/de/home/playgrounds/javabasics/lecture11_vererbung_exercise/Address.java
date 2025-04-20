package de.home.playgrounds.javabasics.lecture11_vererbung_exercise;

public class Address {
    private String street;
    private String houseNumber;
    private String postalCode;
    private String city;
    private String country;
    private Person person;

    public Address(String street, String houseNumber, String postalCode, String city, String country) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void printAsLetterLabel(boolean shouldPrintCountry) {
        if (this.person == null) {
            System.out.println("no person assigned yet.");
        } else {
            System.out.println(this.person.getFirstName() + " " + this.person.getLastName());
            System.out.println(this.street + " " + this.houseNumber);
            System.out.println(this.postalCode + " " + this.city);
            if (shouldPrintCountry) {
                System.out.println(this.country);
            }
        }
    }
}
