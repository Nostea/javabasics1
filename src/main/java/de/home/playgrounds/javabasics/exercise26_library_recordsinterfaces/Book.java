package de.home.playgrounds.javabasics.exercise26_library_recordsinterfaces;

public record Book(String title, int borrowDuration) implements Borrowable{

    public Book (String title, int borrowDuration) {
        this.title = title;

        if (borrowDuration <= 0) {
            throw new IllegalArgumentException("borrowDuration can't be 0 or lower");
        } else {
        this.borrowDuration = borrowDuration;
        }
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public int getBorrowDuration() {
        return this.borrowDuration;
    }
}
