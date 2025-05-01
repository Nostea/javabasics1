package de.home.playgrounds.javabasics.exercise8_simpleNotebook;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    public UserInterface() {}

    public void displayMenu() {

    }

    public String getInput(){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();
        return userInput;
    }

    public void displayNote(Note note) {
        System.out.println("Titel: " + note.getTitle() + " Content: " + note.getContent());

    }

    public void displayAllNotes(ArrayList<Note> notes) {
        System.out.println("Zeige alle Notizen an");
        for(Note note : notes) {
            displayNote(note);
        }
    }
}