package de.home.playgrounds.javabasics.lecture2;

public class MySystemOutPrintln {

    private static int printlnCounter = 0;

    private MySystemOutPrintln() {}

    public static void println(String input) {
        System.out.println(input);
        printlnCounter++;
    }

    public static void println(int input) {
        System.out.println(input);
        printlnCounter++;
    }
    public static void println(double input) {
        System.out.println(input);
        printlnCounter++;
    }

    public static int getPrintlnCounter() {
        return MySystemOutPrintln.printlnCounter;
    }
}
