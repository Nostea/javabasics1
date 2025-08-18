package de.home.playgrounds.javabasics.exercise20_StartEndProgramWith_EnumsSwitchcase;

import de.home.playgrounds.javabasics.exercise21_smallApp_Jpane_enums.DBConnectorSingleton;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        // db wird verbunden
        DBConnectorSingleton dbConnection1 = DBConnectorSingleton.getInstance();

        while(continueProgram) {

            System.out.println("Möchtest du das programm beenden? y/n");
            String userInput = scanner.nextLine();

        /*
        Version mit statischen Werten ohne ENUMS

        switch(userInput){
            case "y","Y","j","J" -> System.out.println("Programm wird beendet");
            case "N","n" -> System.out.println("Programm läuft weiter");
            default -> System.out.println("Falsche Benutzereingabe");
        }
         */


            // Mithilfe der byInput-Methode des Enums UserInput wird die Eingabe
            // auf einen passenden Enum-Wert (GERMAN_YES, ENGLISH_NO, usw.) abgebildet
            UserInput inputByUserForEnums = UserInput.byInput(userInput);

            // Switch-Case entscheidet anhand des Enum-Wertes, was passieren soll
            switch(inputByUserForEnums){
                case GERMAN_YES,ENGLISH_YES -> {
                    System.out.println("Programm wird beendet");
                    continueProgram = false;
                }
                case GERMAN_NO,ENGLISH_NO -> System.out.println("Programm läuft weiter");
                default -> System.out.println("Falsche Benutzereingabe");
            }

        }



    }
}
