package de.home.playgrounds.javabasics.lecture6_UML_part1;

public class Address {
    private String street;
    private String city;
    private String postalCode;
    private String houseNumber;
    private Person person;

    public Address(String street, String city, String postalCode, String houseNumber) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.houseNumber = houseNumber;
    }

    public String getFullAddress() {
        return street + " " + city + " " + postalCode + " " + houseNumber;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
}
