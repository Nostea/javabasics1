package de.home.playgrounds.javabasics.exercise3_collections_2;

public class Song {
    private String songname;
    private String duration;
    private Musician artist; // create connection to Musician with class
    private String genre;
    private static int songcounter = 0;
    private static int songsPlayedCounter = 0;

    public Song (String songname, String duration, Musician artist, String genre) {
        Song.songcounter++;
        this.songname = songname;
        this.duration = duration;
        this.artist = artist;   // song to artist connection, beziehung
        this.genre = genre;
        this.artist.addSongToArrayList(this); // the just created song is added to array list

    }

    public static void playSong(String songname, Musician artist,String duration, String genre) {
        Song.songsPlayedCounter++;
        System.out.println("You are now playing: " + songname + " by " + artist.getName() + " -  Duration: " + duration + " Genre: " + genre );
        System.out.println("Songs played in total: " + songsPlayedCounter);
    }

    // getter and setter

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Musician getArtist() {
        return artist;
    }

    public void setArtist(Musician artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public static int getSongcounter() {
        return songcounter;
    }

}
