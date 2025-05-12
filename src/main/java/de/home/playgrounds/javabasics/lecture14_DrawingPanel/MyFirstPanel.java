package de.home.playgrounds.javabasics.lecture14_DrawingPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFirstPanel extends JPanel {

    public MyFirstPanel() {
        System.out.println("hallo vom panel");
        this.setLayout(new BorderLayout());
        JButton button = new JButton("Hallo");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked");
            }
        });
        this.add(button, BorderLayout.CENTER);
    }


}
