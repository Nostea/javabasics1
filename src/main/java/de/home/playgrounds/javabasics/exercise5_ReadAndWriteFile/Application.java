package de.home.playgrounds.javabasics.exercise5_ReadAndWriteFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {


        String filename1 = "first_file.txt";
        String csvName1 = "persons.csv";

        //Path path1 = Paths.get("src","main","java","de","home", "playgrounds", "javabasics","exercise5_ReadAndWriteFile", filename1);
        Path path1 = Paths.get(PersonsCsvReader.FILE_PATH + filename1);

        if(!Files.exists(path1)) {
            Files.createFile(path1);
            System.out.println("file " + filename1 + " created.");
        }
        Files.writeString(path1, "Hello World\n", StandardOpenOption.APPEND);
        Files.writeString(path1, "And Another!\n", StandardOpenOption.APPEND);
        System.out.println("Wrote in file " + filename1);

        // Dateien einlesen

        String fileContent = Files.readString(path1);
        //System.out.println(fileContent);  //output: Alles, was in der txt datei steht, wird im terminal angezeigt
        List<String> fileContentAsList = Files.readAllLines(path1);
        System.out.println(fileContentAsList.size()); //output: 8 (die menge an aktuell geschriebenen Strings)
        for (String lineItem : fileContentAsList) {
            System.out.println(lineItem);
        }

        System.out.println("--------");

        ArrayList<Person> generatedListOfPersonsFromCsv = PersonsCsvReader.readCsvFileIntoPersonList(PersonsCsvReader.FILE_PATH + csvName1);

        System.out.println(generatedListOfPersonsFromCsv.get(1).getFirstName());

        System.out.println("Willkommen zu meiner Partyliste. \nWer ist anwesend?");
        for (Person person : generatedListOfPersonsFromCsv) {
            if(person.isAtParty() == true) {
                System.out.println(person.getFirstName() + " ist da ");
            } else{
                System.out.println(person.getFirstName() + " ist nicht da ");
            }
        }

        System.out.println("--writeCSV--");

        // die Konstante macht jetzt da ich einen writer habe im reader keinen sinn
        PersonsCsvWriter.writeNewPersonInCsv(PersonsCsvReader.FILE_PATH, csvName1);




    }
}
