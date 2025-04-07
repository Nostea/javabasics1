package de.home.playgrounds.javabasics.lecture6_ReadAndWriteFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PersonsCsvReader {

    public static ArrayList<Person> readCsvFileIntoPersonList(String fileName) throws IOException {
        ArrayList<Person> persons = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        if (!Files.exists(pathToFile)) {
            System.out.println("Ouch");
            return persons;
        }
        List<String> fileContentAsList = Files.readAllLines(pathToFile);
        fileContentAsList.removeFirst(); // Erste Zeile aus unserer Logik entfernen, weil uns die nicht interessiert
        for (String line: fileContentAsList) {
            String[] lineParts = line.split(";");
            String idPart = lineParts[0];
            String lastNamePart = lineParts[1];
            String firstNamePart = lineParts[2];
            String agePart = lineParts[3];
            Person p = new Person(idPart, lastNamePart, firstNamePart, agePart);
            persons.add(p);
        }
        return persons;
    }
}
