package de.home.playgrounds.javabasics.lecture10_switch_case_and_enums;

public enum MobilePhoneNumberGlobalPrefix {
    GERMAN("+49"),
    FRENCH("+33"),
    NETHERLANDS("+31"),
    ITALIAN("+39"),
    UNSUPPORTED("not yet supported");

    // Attribut für jeden Value der enum (wie bei normalen Klassen zu verstehen, "Parameter" für Konstruktoren der
    // Instanzen)
    private String countryCode;

    MobilePhoneNumberGlobalPrefix(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public static MobilePhoneNumberGlobalPrefix byCountryCode(String countryCode) {
        for (MobilePhoneNumberGlobalPrefix phone : MobilePhoneNumberGlobalPrefix.values()) {
            if (phone.countryCode.equals(countryCode)) {
                return phone;
            }
        }
        return UNSUPPORTED;
    }
}
