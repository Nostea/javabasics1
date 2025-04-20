package de.home.playgrounds.javabasics.lecture10_switch_case_and_enums;


import java.util.Collections;
import java.util.List;

// Enums sind perfekte Datentypen, um Konstanten für eine bekannte abzählbare Menge anzulegen
public enum UserInput {
    GERMAN_YES(List.of("ja", "Ja", "J", "j", "JA")),
    GERMAN_NO(List.of("nein", "Nein", "N", "n", "NEIN")),
    ENGLISH_YES(List.of("yes", "Yes", "Y", "y", "YES")),
    ENGLISH_NO(List.of("no", "No", "N", "n", "NO")),
    INVALID_INPUT(Collections.emptyList());

    private List<String> validInputs;

    UserInput(List<String> validInputs) {
        this.validInputs = validInputs;
    }

    public List<String> getValidInputs() {
        return validInputs;
    }

    public static UserInput byInput(String input) {
        for (UserInput userInput : UserInput.values()) {
            if (userInput.validInputs.contains(input)) {
                return userInput;
            }
        }
        return INVALID_INPUT;
    }
}
