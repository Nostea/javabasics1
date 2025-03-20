package de.home.playgrounds.javabasics.lecture3_collections_and_more_about_classes;

public class CountryCodes {

    private CountryCodes() {}

    public static final String GERMAN_CODE = "DE";
    public static final String USA = "US";
    public static final String AUSTRALIA = "AU";

    public static boolean isValidCountryCode(String countryCode) {
        if (countryCode.equals(GERMAN_CODE) || countryCode.equals(USA) || countryCode.equals(AUSTRALIA)) {
            return true;
        } else {
            return false;
        }
    }
}
