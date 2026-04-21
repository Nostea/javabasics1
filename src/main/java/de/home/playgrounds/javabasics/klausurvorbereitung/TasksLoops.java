package de.home.playgrounds.javabasics.klausurvorbereitung;

import java.util.ArrayList;
import java.util.Scanner;

public class TasksLoops {

    public static void tastOneToN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tippe zahl ein");
        int userNumber = scanner.nextInt();

        for( int i = 1; i <= userNumber; i++) {
            System.out.print(i + " ");
        }
    }

    public static void multTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tippe zahl ein");
        int userInput = scanner.nextInt();
        for( int i = 1 ; i <= 10 ; i++) {
            int result = i * userInput;
            System.out.println(userInput + " x " + i + " = " +  result) ;
        }
    }

    public static void doWhileLoop() {
        int counter = 5;
        do{
            System.out.println(counter);
            if (counter == 0) {
                System.out.println("Start!");
            }
            counter--;
        } while (counter >= 0);
    }

    public static void validationTask () {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        do {
            userInput = scanner.nextLine().trim();
            if (userInput.equals("geheim123")) {
                System.out.println("Zugang gewährt!");
            }
        }
        while (!userInput.equals("geheim123"));
    }

    public static void drawRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Breite: ");
        int userinputWidth = scanner.nextInt();
        System.out.println();
        System.out.print("höhe: ");
        int userinputHeight = scanner.nextInt();

        for(int i = 1; i <= userinputHeight; i++) {
            for(int j = 1; j <= userinputWidth; j++) {
                System.out.print("*");
            }
            System.out.print("*");
            System.out.println();
        }

    }




    public static void main(String[] args) {
        //tastOneToN();
        //10 7 4 1     A)
        //multTable();
        // C) variable i wird nie erhöht, endlosschleife
        //doWhileLoop();
        // 6) i = 1 summe= 1, i = 2 summe= 5,  i = 3  summe= 5 + 9   i = 4, summe = 14 + 16  i = 5 , summe = 30 + 25   i= 6    C) 55
        // bereich 1-5 wird iteriert , auf jedem eintrag von der äußeren schleife wird in der inneren schleife ein stern mehr im terminal ausgegeben , ausgabe wird * ** *** **** ***** sein
        // 1 3 5    B)
        //validationTask();
        //drawRectangle();
        // Aufgabe 13 ergebnis mit 0 initiaisiert, produkt bleibt immer 0


    }



}
