package de.home.playgrounds.javabasics.exercise3_collections_2;

import java.util.ArrayList;

public class Musician {

    private String name;
    private ArrayList<Song> songList = new ArrayList<>();

    private boolean isTouring;
    private double popularity;
    private String[] genre = new String[2];
    private int toursCompleted = 0;
    private final String label;

    public static final String MUSICLABEL = "Coco Music Records";

    public static int musiciancounter = 0;

    public Musician(String name, boolean isTouring, double popularity, String label) {
        this.name = name;
        this.isTouring = isTouring;
        this.popularity = popularity;
        addGenre("Pop","Rock");
        this.label = label;

        Musician.musiciancounter++;
    }

    public void addGenre(String genre1, String genre2) {
        this.genre[0] = genre1;
        this.genre[1] = genre2;
    }

    // connection from musician ---> song
    public void addSongToArrayList(Song song1) {
        this.songList.add(song1);
    }

    public void goOnTour() {
        this.isTouring = true;
        System.out.println(this.name + " is now going on tour around the world!");
        this.toursCompleted++;
        System.out.println(this.name + " has completed a tour " + this.toursCompleted + " times");
    }

    // getter and setter

    public ArrayList<Song> getSongList() {
        return songList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTouring() {
        return isTouring;
    }

    public void setTouring(boolean touring) {
        isTouring = touring;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }
}
