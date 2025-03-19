package de.home.playgrounds.javabasics.exercise2;

public class TransactionLogger {

    private static int logMessageCounter = 0;

    private TransactionLogger(){}

    public static void makeLogEntry (int input) {
        System.out.println(input);
        logMessageCounter++;
    }

    public static void makeLogEntry (double input) {
        System.out.println(input);
        logMessageCounter++;
    }

    public static void makeLogEntry (String input) {
        System.out.println(input);
        logMessageCounter++;
    }

    public static int getLogMessageCounter() {
        return TransactionLogger.logMessageCounter;
    }
}
