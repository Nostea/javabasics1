package de.home.playgrounds.javabasics.exercise6_vererbungBankAccount;

public class Address {
    private String street;
    private String houseNumber;
    private String zipCode;
    private Country country;

    public Address(String street, String houseNumber, String zipCode, Country country) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.country = country;
    }


}
