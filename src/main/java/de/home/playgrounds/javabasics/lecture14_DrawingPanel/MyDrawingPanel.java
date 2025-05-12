package de.home.playgrounds.javabasics.lecture14_DrawingPanel;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyDrawingPanel extends JPanel {

    MyDrawingPanel() {
        this.setLayout(null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // drawX(g2d);
        // drawChessBoard(g2d);
        // drawColorFullChessBoard(g2d);
    }

    private void drawX(Graphics2D g2d) {
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, getWidth(), getHeight());
        g2d.setColor(Color.WHITE);
        g2d.drawLine(0, 0, getWidth(), getHeight());
        g2d.drawLine(0, getHeight(), getWidth(), 0);
    }

    private void drawChessBoard(Graphics2D g2d) {
        int tileWidth = this.getWidth() / 8;
        int tileHeight = this.getHeight() / 8;
        for (int x = 0; x < 8; x++) {
            // 1. Farbe mit der das erste Kästchen in der Reihe gemalt wird, hängt vom Index der Spalte ab
            Color currentColor = (x % 2 == 0) ? Color.BLACK : Color.WHITE;
            g2d.setColor(currentColor);
            for (int y = 0; y < 8; y++) {
                // 1. Quadrat an richtiger Positon mit richtiger Größe malen
                g2d.fillRect(x * tileWidth, y * tileHeight, tileWidth, tileHeight);
                // 2. Farbe switchen für nächstes Quadrat
                currentColor = (currentColor == Color.BLACK) ? Color.WHITE : Color.BLACK;
                g2d.setColor(currentColor);
            }
        }
    }

    private void drawColorFullChessBoard(Graphics2D g2d) {
        Random rand = new Random();
        int tileWidth = this.getWidth() / 8;
        int tileHeight = this.getHeight() / 8;
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                // 1. Farbe random bestimmen
                Color currentColor = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
                g2d.setColor(currentColor);
                // 2. Quadrat an richtiger Positon mit richtiger Größe malen
                g2d.fillRect(x * tileWidth, y * tileHeight, tileWidth, tileHeight);
            }
        }
    }
}
