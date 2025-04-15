package de.home.playgrounds.javabasics.lecture8_design_patterns_singleton;

public class DataBaseConnectorSingleton {

    // Mit dem Singleton Pattern kann man sicherstellen, dass nur EINE Instanz von einer Klasse erzeugt werden kann.
    // Nützlich für Prozesse, die nur einmal gestartet werden sollen.

    private static DataBaseConnectorSingleton instance = null; // Null  Instanz der Klasse als Klassenvariable. Teil des Singletons

    private static String username = "Ska";
    private static String password = "password";

    private boolean isConnected = false;

    private DataBaseConnectorSingleton() {} // Privater Konstruktor. Teil des Singletons

    public static DataBaseConnectorSingleton getInstance() { // GetInstance Funktion als Klassenfunktion. Teil des Singletons
        if (instance == null) {
            System.out.println("Erster Aufruf der getInstance. Erzeugt unsere Instanz und gibt diese dann zurück");
            instance = new DataBaseConnectorSingleton();
        }
        System.out.println("Bei jedem Aufruf: Gib die Instanz zurück");
        return instance;
    }

    public void connect() {
        System.out.println("Connecting to database...");
        isConnected = true;
        System.out.println("Connected to database.");
    }
}
