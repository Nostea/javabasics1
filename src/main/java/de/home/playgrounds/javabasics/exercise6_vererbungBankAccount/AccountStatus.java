package de.home.playgrounds.javabasics.exercise6_vererbungBankAccount;

import java.util.Collections;
import java.util.List;

public enum AccountStatus {
    ACTIVE(List.of("a","active", "A", "ACTIVE")),
    FROZEN(List.of("f", "frozen", "F", "FROZEN")),
    CLOSED(List.of("c", "closed", "C", "CLOSED")),
    INVALID_INPUT(Collections.emptyList());


    private final List<String> validInputs;

    //Constructor
    AccountStatus(List<String> validInputs) {
        this.validInputs = validInputs;
    }

    //Getter
    public List<String> getValidInputs() {
        return validInputs;
    }

    public static AccountStatus accountStatusByUserInput(String input) {
        for (AccountStatus userInput : AccountStatus.values()) {
            if(userInput.validInputs.contains(input)) {
                return userInput;
            }
        }
        return INVALID_INPUT;
    }

}
