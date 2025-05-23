package de.home.playgrounds.javabasics.exercise9_QuestTracker;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.*;
import java.awt.*;

public class Application {
    public static void main(String[] args) {
        FlatDarkLaf.setup(); // GUI setup dark
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Quest Manager");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setBounds(100, 100, 450, 450);

        JPanel panel = new JPanel();
        // MyFirstPanel panel = new MyFirstPanel();
        // MyDrawingPanel panel = new MyDrawingPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
    }

