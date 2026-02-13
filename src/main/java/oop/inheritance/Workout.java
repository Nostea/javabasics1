package oop.inheritance;

public class Workout extends Event{

    public Workout(String title) {
        super(title);
    }

    @Override
    public String getDescription() {
        return "Ein intensives Workout";
    }

    public void burnCalories() {
        System.out.println("Kalorien werden verbrannt!");
    }

}
