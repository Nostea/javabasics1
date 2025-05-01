package de.home.playgrounds.javabasics.exercise8_simpleNotebook;

import java.util.ArrayList;

public class Notebook {
    private ArrayList<Note> notes;

    public Notebook(ArrayList<Note> notes){
        this.notes = new ArrayList<>();
    }

    public void addNote(Note note) {
        // hier noch
    notes.add(note);
    }

    public void removeNoteByTitle(String title) {

    }

    public ArrayList<Note> getAllNotes() {
        return notes;
    }

    public Note findNote(String title) {
        for(Note note : notes) {
            if(note.getTitle().equals(title)) {
                System.out.println("Notiz gefunden");
                return note;
            }
        }
        return null;
    }

}
