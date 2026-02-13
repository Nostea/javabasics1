package oop.inheritance;

public class Running extends Event{

    public Running(String title) {
        super(title);
    }

    @Override
    public String getDescription() {
        return "Intensive Laufeinheit";
    }

}
