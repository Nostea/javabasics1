package de.home.playgrounds.javabasics.lecture10_switch_case_and_enums;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
            Switch-Case:
                Alternative zu komplexen if-else-Blöcken IMMER DANN, wenn wir auf eine abzählbare, endliche Menge prüfen.
                Geht auf den meisten primitiven Datentypen, sowie (seit Java 7) auf Strings, geht auch auf sogenannten Enums (lernen wir im Laufe der Session kennen)
                Klassisches switch-case - Aufbau:
                        switch(variable) {
                            case value1:
                                    doSomething();
                                    doEvenMore();
                                    break;
                            case value2:
                                    doOtherStuff();
                                    break;
                            default:
                                    doDefaultStuff();
                                    break;
                        }
         */
        System.out.println("Möchtest du das Programm beenden? (Ja/Nein)");
        String userInput = scanner.nextLine();

        // Prüfung mit klassischem if-else ist unelegant
        if (userInput.equals("Ja")) {
            System.out.println("Programm fährt runter");
           //  System.exit(0);
        } else if (userInput.equals("Nein")) {
            System.out.println("Programm läuft weiter");
        } else {
            System.out.println("Falsche Benutzereingabe");
        }

        System.out.println("-----");

        // Für endliche Wertemenge einer Variable lieben wir switch case (klassisches switch-case)
        switch (userInput) {
            case "Ja":
                System.out.println("Programm fährt runter");
                // System.exit(0);
                break;
            case "Nein":
                System.out.println("Programm läuft weiter");
                break;
            default:
                System.out.println("Falsche Benutzereingabe");
                break;
        }

        System.out.println("--");
        // bzw. in der modernen Schreibweise
        switch (userInput) {
            case "Ja", "Yes" -> System.out.println("Programm fährt runter");
            case "Nein", "No" -> System.out.println("Programm läuft weiter");
            default -> System.out.println("Falsche Benutzereingabe");
        }

        System.out.println("++++");

        // Benutzen von Enums
        UserInput germanYes = UserInput.GERMAN_YES;
        System.out.println(germanYes.name()); // Gibt den Namen des enum values aus
        System.out.println(germanYes.ordinal());
        System.out.println(germanYes.getValidInputs());

        // auf enum-klasse zugreifen
        UserInput inputByUser = UserInput.byInput(userInput);
        System.out.println(inputByUser.name());

        switch (inputByUser) {
            case GERMAN_YES, ENGLISH_YES -> System.out.println("Programm fährt runter");
            case GERMAN_NO, ENGLISH_NO -> System.out.println("Programm läuft weiter");
            default -> System.out.println("Falsche Benutzereingabe");
        }

        System.out.println("+++++++++++");
        String userCountryCode = scanner.nextLine();
        // switch case über country codes als Konstanten -> machbar, aber nicht so elegante
        switch (userCountryCode) {
            case ConstantsForMobilePhoneNumberPrefixes.GERMAN -> System.out.println("its germany!");
            case ConstantsForMobilePhoneNumberPrefixes.FRENCH -> System.out.println("its France!");
            case ConstantsForMobilePhoneNumberPrefixes.NETHERLANDS -> System.out.println("its Netherlands!");
            default -> System.out.println("Unbekannter country code");
        }

        // switch case über country codes als enum -> charmanter
        MobilePhoneNumberGlobalPrefix prefix = MobilePhoneNumberGlobalPrefix.byCountryCode(userCountryCode);
        switch (prefix) {
            case GERMAN -> System.out.println("its germany!");
            case FRENCH -> System.out.println("its France!");
            case NETHERLANDS -> System.out.println("its Netherlands!");
            case UNSUPPORTED -> System.out.println("Unbekannter country code");
        }
    }
}
