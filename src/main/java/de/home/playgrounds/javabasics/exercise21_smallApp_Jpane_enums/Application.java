package de.home.playgrounds.javabasics.exercise21_smallApp_Jpane_enums;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // TODO: Jpane fenster, while loop starten beenden des programms, singleton database connector

        FlatDarkLaf.setup();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setTitle("Continue and End Program Application");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setBounds(100,100,450,450);

        //JPanel panel = new JPanel();
        MyDrawingPanel panel2 = new MyDrawingPanel();

        frame.getContentPane().add(panel2, BorderLayout.CENTER);
        frame.setVisible(true);

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        boolean continueProgram = true;

        while(continueProgram) {
            switch (userInput) {
                case "yes" -> System.out.println("Programm geht weiter");
                case "no" -> {
                    System.out.println("Programm wird beendet");
                    continueProgram = false;
                }
                default -> System.out.println("Ungültige Eingabe");
            }
        }
    }
}
