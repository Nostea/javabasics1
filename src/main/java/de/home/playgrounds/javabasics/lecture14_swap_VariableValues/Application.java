package de.home.playgrounds.javabasics.lecture14_swap_VariableValues;

public class Application {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // y soll den Wert von x annehmen, während x den Wert von y annimmt ( Annas naive Lösung, absolut ok, aber es geht etwas kürzer)
        int newX = y;
        int newY = x;

        x = newX;
        y = newY;

        System.out.println(x); // 20
        System.out.println(y); // 10

        // simpler swap algo
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }

}
