package de.home.playgrounds.javabasics.exercise20_StartEndProgramWith_EnumsSwitchcase;

import java.util.Collections;
import java.util.List;

public enum UserInput {
    GERMAN_YES(List.of("ja","Ja", "JA","J","j")),
    GERMAN_NO(List.of("nein","Nein")),
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
        for(UserInput userInput: UserInput.values()) {
            if(userInput.validInputs.contains(input)) {
                return userInput;
            }
        }
        return INVALID_INPUT;
    }
}
