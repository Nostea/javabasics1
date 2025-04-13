package de.home.playgrounds.javabasics.exercise5_ReadAndWriteFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;


public class PersonsCsvWriter {

    public static String writeNewPersonInCsv (String filePath, String csvName) throws IOException {
        String newPersonString = null;
        String delimiter = ";";

        Scanner scanner = new Scanner(System.in);

        Path pathToFile = Paths.get(filePath + csvName);
        if(!Files.exists(pathToFile)) {
            System.out.println("fehler bei path to file");
            return newPersonString;
        }

        System.out.println("Enter Data for new Person, Format: id, firstName, lastName, age(int), city, isAtParty(bool)");
        String id = scanner.nextLine();
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String age = scanner.nextLine();
        String city = scanner.nextLine();
        String isAtParty = scanner.nextLine();
        // Hier kann kein boolean/int stehen weil sonst wird InputMismatchException geworfen
        // sollte kein problem sein, weil in der Methode nur Strings geschrieben werden sollen.
        // Im CSVreader werden die typen zugewiesen
        scanner.close();

        newPersonString = "\n" + id + delimiter + firstName + delimiter + lastName + delimiter + age + delimiter + city + delimiter + isAtParty;
        System.out.println("DEBUG: " + newPersonString);

        Files.writeString(pathToFile, newPersonString, StandardOpenOption.APPEND);

        return newPersonString;
    }





}

