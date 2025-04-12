package de.home.playgrounds.javabasics.exercise5_ReadAndWriteFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {


        String filename1 = "first_file.txt";
        String csvName1 = "persons.csv";
        String fileDirectory = "src/main/java/de/home/playgrounds/javabasics/exercise5_ReadAndWriteFile/";

        //Path path1 = Paths.get("src","main","java","de","home", "playgrounds", "javabasics","exercise5_ReadAndWriteFile", filename1);
        Path path1 = Paths.get(fileDirectory + filename1);

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
    }
}
