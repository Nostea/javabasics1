package de.home.playgrounds.javabasics.lecture8_design_patterns_singleton;

public class Application {

    public static void main(String[] args) {


        // Mit dem Singleton Pattern kann man sicherstellen, dass nur EINE Instanz von einer Klasse erzeugt werden kann.
        // Nützlich für Prozesse, die nur einmal gestartet werden sollen.

        // Unten sind Beispiele, was ein Singleton verhindert.

        DataBaseConnector connector1 = new DataBaseConnector();
        DataBaseConnector connector2 = new DataBaseConnector();
        DataBaseConnector connector3 = new DataBaseConnector();

        connector1.connect();
        connector2.connect();
        connector3.connect();

        DataBaseConnectorSingleton singleton1 = DataBaseConnectorSingleton.getInstance();

        DataBaseConnectorSingleton singleton2 = DataBaseConnectorSingleton.getInstance();

    }
}
