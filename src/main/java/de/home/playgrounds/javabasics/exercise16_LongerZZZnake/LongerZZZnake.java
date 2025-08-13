package de.home.playgrounds.javabasics.exercise16_LongerZZZnake;

import java.awt.*;
import java.util.Arrays;

public class LongerZZZnake {
    public static void main(String[] args) {
        Point playerPosition = new Point(10, 9);
        Point goldPosition = new Point(6, 6);
        Point doorPosition = new Point(0, 5);
        Point[] snakePositions = new Point[5];
        int snakeIdx = 0;
        snakePositions[snakeIdx] = new Point(30, 2);
        boolean rich = false;

        while (true) {
            if (rich && playerPosition.equals(doorPosition)) {
                System.out.println("You won!");
                break;
            }
            if (Arrays.asList(snakePositions).contains(playerPosition)) {
                System.out.println("SSSSSS. You were bitten by the snake!");
                break;
            }
            if (playerPosition.equals(goldPosition)) {
                rich = true;
                goldPosition.setLocation(-1, -1);
            }

            // Draw grid and symbols
            for (int y = 0; y < 10; y++) {
                for (int x = 0; x < 40; x++) {
                    Point p = new Point(x, y);
                    if (playerPosition.equals(p)) System.out.print('&');
                    else if (Arrays.asList(snakePositions).contains(p)) System.out.print('S');
                    else if (goldPosition.equals(p)) System.out.print('$');
                    else if (doorPosition.equals(p)) System.out.print('#');
                    else System.out.print('.');
                }
                System.out.println();
            }

            // Console input and change player position
            switch (new java.util.Scanner(System.in).next()) {
                case "t" -> playerPosition.y = Math.max(0, playerPosition.y - 1);
                case "b" -> playerPosition.y = Math.min(9, playerPosition.y + 1);
                case "l" -> playerPosition.x = Math.max(0, playerPosition.x - 1);
                case "r" -> playerPosition.x = Math.min(39, playerPosition.x + 1);
            }

            // Snake moves towards the player
            Point snakeHead = new Point(snakePositions[snakeIdx].x, snakePositions[snakeIdx].y);

            if (playerPosition.x < snakeHead.x) snakeHead.x--;
                else if (playerPosition.x > snakeHead.x) snakeHead.x++;

            if (playerPosition.y < snakeHead.y) snakeHead.y--;
                else if (playerPosition.y > snakeHead.y) snakeHead.y++;

            snakeIdx = (snakeIdx + 1) % snakePositions.length;
            snakePositions[snakeIdx] = snakeHead;
        } // end while
    }
}

