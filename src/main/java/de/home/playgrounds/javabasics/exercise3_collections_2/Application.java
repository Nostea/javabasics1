package de.home.playgrounds.javabasics.exercise3_collections_2;


public class Application {
    public static void main(String[] args) {

        Musician pink = new Musician("Pink", false, 8.2 , Musician.MUSICLABEL );
        Musician chiliPeppers = new Musician("Chili Peppers", false, 7.1 , Musician.MUSICLABEL );
        Musician unknownArtist = new Musician ("Unknown Artist", false, 1.0, Musician.MUSICLABEL);

        Song song1 = new Song ("Raise your glass", "3.12", pink, "Pop"); //TODO duration to double, create a duration formatting function
        Song song2 = new Song ("A Pink Life", "3.33", pink, "Pop");

        Song song3 = new Song ("Spicy Chili", "3.02", chiliPeppers, "Rock");
        Song song4 = new Song ("Chiling Day and Night", "4.10", chiliPeppers, "Rock");

        System.out.println("The radio is on and there is music playing");
        Song.playSong(song1.getSongname(), song1.getArtist(), song1.getDuration(), song1.getGenre());
        Song.playSong(song2.getSongname(), song2.getArtist(), song2.getDuration(), song2.getGenre());
        Song.playSong(song3.getSongname(), song3.getArtist(), song3.getDuration(), song3.getGenre());
        Song.playSong(song4.getSongname(), song4.getArtist(), song4.getDuration(), song4.getGenre());

        System.out.println("-----");

        System.out.println("There are " + Musician.musiciancounter + " musicians total in the database");

        System.out.println("Output all songs by Pink");
        System.out.println("Amount of songs in library: " + pink.getSongList().size());
        for (Song element : pink.getSongList()) {
            System.out.println(element.getSongname());
        }

        System.out.println("--------");
        pink.goOnTour();
        chiliPeppers.goOnTour();
        unknownArtist.goOnTour();
    }
}
