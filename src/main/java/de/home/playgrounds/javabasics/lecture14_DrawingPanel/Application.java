package de.home.playgrounds.javabasics.lecture14_DrawingPanel;

import com.formdev.flatlaf.FlatDarculaLaf; // in pom.xml noch einrichten
import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;
import java.awt.*;

public class Application {
    public static void main(String[] args) {
        FlatDarkLaf.setup(); // GUI setup dark
        //FlatDarculaLaf.setup();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Java Swing Application");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setBounds(100, 100, 450, 450);

        JPanel panel = new JPanel();
        // MyFirstPanel panel = new MyFirstPanel();
        // MyDrawingPanel panel = new MyDrawingPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
