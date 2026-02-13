package oop.inheritance;

public class Main {

    public static void handleEvent(Event e) {
        if (e instanceof Workout) {
            Workout w3 = (Workout) e;
            w3.burnCalories();
        } else if(e instanceof YogaSession) {
            System.out.println("Teilnehmer entspannen sich");
        } else if(e instanceof Running) {
            System.out.println("Strecke wird aufgezeichnet");
        }
    }

    public static void main(String[] args) {
        Event e = new Event("Fitness Messe");
        e.start();
        System.out.println(e.getDescription());

        Event e1 = new Workout("Beine Training");   //Referenztyp Event (links vor =)   Objekttyp (rechts vom =)
        Event e2 = new YogaSession("Morning Flow");
        Event e3 = new Running("5km Parklauf");

        System.out.println(e1.getDescription());
        System.out.println(e2.getDescription());
        System.out.println(e3.getDescription());
        Event e4 = new Workout("HIIT");
        System.out.println("Welche description kommt jetzt?");
        e4.getDescription();  // es kommt nix in der konsolenausgabe
        //e4.burnCalories();  // Ohne Cast sieht der Compiler die methode bei Typ Workout nicht.

        Workout w = (Workout) e4;  //Downcast
        w.burnCalories();
        ((Workout)e4).burnCalories();

        Workout w2 = new Workout("Gewichte heben");
        Event e5 = w2;  // Upcasting, automatische typumwandlung


        Event e6 = new YogaSession("Relax");

        //Workout w3 = (Workout) e6;    //classcast exception
        //w.burnCalories();

        System.out.println("=======");
        handleEvent(e1);
        handleEvent(e2);
        handleEvent(e3);

    }
}
