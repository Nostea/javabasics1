package de.home.playgrounds.javabasics.exercise3_collections;


public class CountryCodes {

    private CountryCodes(){}

    public static final String GERMANY_CODE = "DE";
    public static final String FRANCE_CODE = "FR";
    public static final String AMERICA_CODE = "US";

    public static boolean isValidCountryCode(String countryCode) {

        if(countryCode.equals(GERMANY_CODE) || countryCode.equals(FRANCE_CODE) || countryCode.equals(AMERICA_CODE)) {
            return true;
        }
        else {
            return  false;
        }

    }
}
