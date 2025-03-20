package de.home.playgrounds.javabasics.exercise3_collections;


public class Address {

    public String streetName;
    public String houseNumber;
    public String zipcode;
    public String city;
    public String countryCode;



    public Address(String streetName, String houseNumber, String zipcode, String city, String countryCode) {
        if (!CountryCodes.isValidCountryCode(countryCode)) {
            System.out.println("WARNING: The country code " + countryCode + " is not a valid code");
        }
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.zipcode = zipcode;
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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
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
