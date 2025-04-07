package de.home.playgrounds.javabasics.lecture6_ReadAndWriteFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) throws IOException {
        // Dateien schreiben

        // 1. Alte Variante 1
        // Mehrere Schritte:
        // FileWriter mit Zieldatei und Optionen erzeugen
        // => BufferedWriter erzeugen als Wrapper für FileWriter
        // => Zeilen schreiben
        // => am Ende BufferedWriter schließen
        FileWriter fileWriter = new FileWriter("my_first_file.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("BYE WORLD");
        bufferedWriter.newLine();
        bufferedWriter.write("Foo");
        bufferedWriter.close();

        FileWriter fileWriter2 = new FileWriter("my_second_file.txt", true);
        BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter2);
        bufferedWriter2.write("HELLO WORLD");
        bufferedWriter2.newLine();
        bufferedWriter2.write("Foo");
        bufferedWriter2.newLine();
        bufferedWriter2.close();

        File f1 = new File("sub_folder/my_third_file.txt");
        if (!f1.exists()) {
            f1.createNewFile();
        }
        FileWriter fileWriter3 = new FileWriter(f1);
        BufferedWriter bufferedWriter3 = new BufferedWriter(fileWriter3);
        bufferedWriter3.write("HELLO WORLD");
        bufferedWriter3.newLine();
        bufferedWriter3.write("Foo");
        bufferedWriter3.newLine();
        bufferedWriter3.close();

        File f4 = new File("sub_folder");
        if (f4.exists()) {
            System.out.println(f4.getAbsolutePath());
            System.out.println(f4.isDirectory());
            System.out.println(f4.isFile());
        }

        // Alter Weg Nr2: Ähnlich, aber nicht vorzeignötig

        // NEUER MODERNER WEG
        Path p1 = Paths.get("my_fourth_file.txt");
        Files.writeString(p1, "HELLO WORLD");

        Path p2 = Paths.get("my_fifth_file.txt");
        if (!Files.exists(p2)) {
            Files.createFile(p2);
        }
        // Files.writeString(p2, "HELLO WORLD\n", StandardOpenOption.APPEND);
        // Files.writeString(p2, "AND ANOTHER ONE\n", StandardOpenOption.APPEND);

        // Dateien einlesen!
        // Alter Weg kann sich selbst angeschaut werden
        // Hinweise: FileReader + BufferedReader

        System.out.println("--------");
        System.out.println();
        // Neuer Weg:
        Path p3 = Paths.get("my_fifth_file.txt");
        // Ganze Datei einlesen:
        String fileContent = Files.readString(p3);
        System.out.println(fileContent);
        // Ganze Datei als Liste von Strings einlesen anstelle eines einzelnen Strings (jede Zeile ist dann ein Listeneintrag)
        List<String> fileContentAsList = Files.readAllLines(p3);
        System.out.println("---");
        System.out.println(fileContentAsList.size());
        for (String lineItem : fileContentAsList) {
            System.out.println(lineItem.length());
        }

        System.out.println("-----------");
        System.out.println();
        ArrayList<Person> persons = PersonsCsvReader.readCsvFileIntoPersonList("persons.csv");
        for (Person person : persons) {
            System.out.println(person.getId() + ": " + person.getFirstName() + " " + person.getLastName() + ": " + person.getAge());
        }
    }
}