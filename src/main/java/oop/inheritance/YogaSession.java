package oop.inheritance;

public class YogaSession extends Event{

    public YogaSession(String title) {
        super(title);
    }

    @Override
    public String getDescription() {
        return "Entspannte Dehneinheit";
    }

}
