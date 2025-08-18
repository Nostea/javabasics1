package de.home.playgrounds.javabasics.exercise21_smallApp_Jpane_enums;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyDrawingPanel extends JPanel {

    public MyDrawingPanel() {
        this.setLayout(new FlowLayout());
        JButton buttonContinue = new JButton("Programm läuft weiter");
        buttonContinue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked continue");
            }
        });
        this.add(buttonContinue);



        JButton buttonEnd = new JButton("Programm beenden");
        buttonEnd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked end program");
            }
        });
        this.add(buttonEnd);
    }



}
