package de.home.playgrounds.javabasics.exercise7_JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class textInputField  {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mini Taschenrechner");
        frame.setPreferredSize(new Dimension(400, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Layout
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10,5));

        // GUI Elemente
        JLabel numberLabel1 = new JLabel("Zahl 1:");
        JTextField numberInput1 = new JTextField("5",5);

        JLabel numberLabel2 = new JLabel("Zahl 2:");
        JTextField numberInput2 = new JTextField("12",5);
        
        JLabel resultLabel = new JLabel("Result");
        JButton submitButton = new JButton("Berechnen");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // 1. Texte aus den Eingabefeldern holen
                    String number1Text = numberInput1.getText();
                    String number2Text = numberInput2.getText();

                    // 2. Texte in Zahlen umwandeln
                    int number1 = Integer.parseInt(number1Text);
                    int number2 = Integer.parseInt(number2Text);

                    // 3. Addition durchführen
                    int sum = number1 + number2;

                    // 4. Ergebnis im Label anzeigen
                    resultLabel.setText("Ergebnis: " + sum);

                } catch (NumberFormatException ex) {
                    // Fehlerbehandlung, falls die Eingabe keine gültige Zahl ist
                    resultLabel.setText("Ungültige Eingabe!");
                }
            }
        });

        frame.add(numberLabel1);
        frame.add(numberInput1);
        
        frame.add(numberLabel2);
        frame.add(numberInput2);
        
        frame.add(submitButton);
        frame.add(resultLabel); 

        frame.pack();
        frame.setVisible(true);

    }


}
