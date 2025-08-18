package de.home.playgrounds.javabasics.exercise21_smallApp_Jpane_enums;

public class DBConnectorSingleton {
    private static DBConnectorSingleton instance = null;

    private static String username = "Ska";
    private static String password = "password";
    private boolean isConnected = false;

    private DBConnectorSingleton() {}

    public static DBConnectorSingleton getInstance() {
        if(instance == null) {
            // beim ersten start (instanz existiert noch nicht) wird eine neue angelegt
            System.out.println("DBconnector singleton angelegt");
            instance = new DBConnectorSingleton(); // hier neue instanz angelegt
        }
        return instance; //bei jedem getInstance Aufruf wird die einzige DB instanz wiedergegeben
    }


    public void connect() {
        System.out.println("Connecting to database...");
        isConnected = true;
        System.out.println("Connected to database.");
    }
}
