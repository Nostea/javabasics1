package de.home.playgrounds.javabasics.lecture13_MultiArrays;

public class MultiArrayApplication {
    public static void main(String[] args) {
        // Zur Erinnerung: Arrays initialisieren
        int[] simpleIntArray = new int[3];
        simpleIntArray[0] = 10;
        simpleIntArray[1] = 20;
        simpleIntArray[2] = 30;
        int[] directFilledIntArray = {1, 2, 3};
        System.out.println(simpleIntArray.length); // Arraylänge
        for (int i : simpleIntArray) { // Über Array-Elemente iterieren
            System.out.println(i);
        }
        System.out.println("------");

        // Nun ein zweidimensionales Array Multiplikationstabelle 1-10
        int[][] multiDimensionalIntArray = new int[10][10];
        for (int x = 0; x <10; x++) {
            for (int y = 0; y < 10; y++) {
                multiDimensionalIntArray[x][y] = (x+1) * (y+1);
            }
        }

        // So könnte man das ausgeben:
        System.out.print("   ");
        for (int x = 0; x< multiDimensionalIntArray.length; x++) {
            System.out.print((x+1) + " ");
        }
        System.out.println();
        for (int x = 0; x < multiDimensionalIntArray.length; x++) {
            System.out.print((x+1) + ": ");
            for (int y = 0; y < multiDimensionalIntArray[x].length; y++) {
                System.out.print(multiDimensionalIntArray[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println("------");

        // Andere Form der Initialisierung von Multi-Arrays
        int[][] pascalschesDreieckArray = {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}};
        System.out.println(pascalschesDreieckArray.length);
        System.out.println(pascalschesDreieckArray[0].length);
        System.out.println(pascalschesDreieckArray[1].length);
        System.out.println(pascalschesDreieckArray[2].length);
        System.out.println(pascalschesDreieckArray[3].length);
        System.out.println("--");

        for (int x = 0; x < pascalschesDreieckArray.length; x++) {
            int[] secondDimensionArray = pascalschesDreieckArray[x];
            for (int y = 0; y < secondDimensionArray.length; y++) {
                System.out.println(pascalschesDreieckArray[x][y]);
            }
        }
    }
}
