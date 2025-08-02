package de.home.playgrounds.javabasics.exercise13_BruteforceNumbers;

public class BruteforceNumbers {
    public static void main(String[] args) {

        int maxVal = 10;

        for(int x = 1; x <= maxVal; x++) {
            for (int o = 1; o <= maxVal; o++) {
                int l = o +x;
                int t = x + l;

                if (l <= maxVal && t <= maxVal) {
                    System.out.println("Lösung gefunden:");
                    System.out.println("x = " + x);
                    System.out.println("o = " + o);
                    System.out.println("l = " + l);
                    System.out.println("t = " + t);

                }
            }
        }
    }
}