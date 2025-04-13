package de.home.playgrounds.javabasics.exercise5_ReadAndWriteFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PersonsCsvReader {
    // 1.. eine arraylist für die personen erstellen und exception schreiben falls file nicht existiert
    // 2.
   public static final String FILE_PATH = "src/main/java/de/home/playgrounds/javabasics/exercise5_ReadAndWriteFile/";

    public static ArrayList<Person> readCsvFileIntoPersonList(String fullFilePath) throws IOException {

        ArrayList<Person> persons = new ArrayList<>();

        Path pathToFile = Paths.get(fullFilePath);
        if (!Files.exists(pathToFile)) {
            System.out.println("Fehler bei path to file");
            return persons;
        }
        List<String> fileContentAsList = Files.readAllLines(pathToFile);
        fileContentAsList.removeFirst(); // Erste zeile entfernen

        // jede Zeile wird eingelesen und bei ; die Wörter in ein Array gepackt.
        for (String line : fileContentAsList) {
            String[] lineParts = line.split(";");
            //System.out.println(lineParts);
            String idPart = lineParts[0];
            String firstName = lineParts[1];
            String lastName = lineParts[2];
            int age = Integer.parseInt(lineParts[3]);
            String city = lineParts[4];
            boolean isAtParty = Boolean.parseBoolean(lineParts[5]);

            //System.out.println("DEBUG: " + idPart + ", " + firstName + ", " + lastName + ", " + age + ", " + city + ", " + isAtParty); // debug

            // die variablen wurden aus dem Array extrahiert. Damit wird eine neue person erstellt
            Person newPerson = new Person(idPart,firstName,lastName,age,city,isAtParty);
            persons.add(newPerson); // und die gerade erstellte Person in die Arraylist persons gepackt

        }
        return persons;
    }
}
