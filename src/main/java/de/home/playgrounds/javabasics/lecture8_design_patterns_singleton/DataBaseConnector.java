package de.home.playgrounds.javabasics.lecture8_design_patterns_singleton;

public class DataBaseConnector {

    private static String username = "Ska";
    private static String password = "password";

    private boolean isConnected = false;

    public void connect() {
        System.out.println("Connecting to database...");
        isConnected = true;
        System.out.println("Connected to database.");
    }
}