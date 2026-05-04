package de.home.playgrounds.javabasics.exercise26_library_recordsinterfaces;

public interface Borrowable {
    String getTitle();
    int getBorrowDuration();

    default String borrowInfo() {
        String message = "Hary Potter can't be borrowed for 14 days";
        return message;
    }
}
