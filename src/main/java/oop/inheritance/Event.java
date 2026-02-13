package oop.inheritance;

public class Event {

    protected String title;

    public Event(String title) {
        this.title = title;
    }

    public void start() {
        System.out.println("Event startet: " + title);
    }

    public String getDescription() {
        return "Allgemeines Event";
    }

    public static void handleEvent(Event e) {
        System.out.println("Mache etwas mit dem Event");
    }

}
