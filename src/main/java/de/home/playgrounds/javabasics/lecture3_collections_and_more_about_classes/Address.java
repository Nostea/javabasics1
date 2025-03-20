package de.home.playgrounds.javabasics.lecture3_collections_and_more_about_classes;

public class Address {

    // Address-Eigenschaften
    private String streetName;
    private String houseNumber;
    private String zipCode;
    private String city;
    private String countryCode;

    public Address(String streetName, String houseNumber, String zipCode, String city, String countryCode) {
        if (!CountryCodes.isValidCountryCode(countryCode)) {
            System.out.println("WARN: Countrycode " + countryCode + " is not a valid country code.");
        }
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.countryCode = countryCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
