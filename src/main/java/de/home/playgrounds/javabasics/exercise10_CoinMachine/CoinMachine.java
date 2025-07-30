package de.home.playgrounds.javabasics.exercise10_CoinMachine;

import java.util.Scanner;

public class CoinMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coin2euro = 0;
        int coin1euro = 0;
        int coin50cent = 0;
        int coin20cent = 0;
        int coin10cent = 0;
        int coin5cent = 0;
        int coin2cent = 0;
        int coin1cent = 0;

        System.out.println("Gebe ein wieviel geld du eingeworfen hast (in cent)");
        int money = Integer.parseInt(scanner.nextLine());

        //int remainingMoney = money;

        System.out.println("Du kriegst folgende münzen zurück:");

        if(money == 0) {
            System.out.println("0 is not a valid value");
        }

        coin2euro = money / 200;
        money = money % 200;
        System.out.println(coin2euro + " x 2euro coins ");

        coin1euro = money / 100;
        money = money % 100;
        System.out.println(coin1euro + " x 1euro coins ");

        coin50cent = money / 50;
        money = money % 50;
        System.out.println(coin50cent + " x 50 cent coins ");

        coin20cent = money / 20;
        money = money % 20;
        System.out.println(coin20cent + " x 20 cent coins ");

        coin10cent = money / 10;
        money = money % 10;
        System.out.println(coin10cent + " x 10 cent coins ");

        coin5cent = money / 5;
        money = money % 5;
        System.out.println(coin5cent + " x 5 cent coins ");

        coin2cent = money / 2;
        money = money % 2;
        System.out.println(coin2cent + " x 2 cent coins ");

        coin1cent = money / 1;
        money = money % 1;
        System.out.println(coin1cent + " x 1 cent coins ");


    }
}
