package de.home.playgrounds.javabasics.klausurvorbereitung;

import java.util.Scanner;

public class Tasks {

    public static void getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Die Zahl eingeben: ");
        int userinput= scanner.nextInt();
        System.out.println();

        if(userinput < 0 ) {
            System.out.println("Die Zahl ist negativ");
        } else {
            System.out.println("Die Zahl ist positiv");
        }
    }

    public static void getEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        int numberInput = scanner.nextInt();

        if(numberInput % 2 == 0) {
            System.out.println(numberInput + " is even");
        }
        else {
            System.out.println(numberInput + " is odd");
        }
    }

    public static void minAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gebe dein alter ein: ");
        int age = scanner.nextInt();

        if(age >= 18) {
            System.out.println("Zutritt erlaubt");
        } else {
            System.out.println("Zutritt verweigert");
        }
    }

    public static void getGrade() {
        Scanner scanner = new Scanner(System.in);
        int userinput = scanner.nextInt();

        switch(userinput) {
            case 1: System.out.println("Sehr gut");
            break;
            case 2: System.out.println("Gut");
            break;
            case 3: System.out.println("Befriedigend");
                break;
            case 4: System.out.println("Ausreichend");
                break;
            case 5: System.out.println("Mangelhaft");
                break;
            case 6: System.out.println("Ungenügend");
                break;
            default: System.out.println("Ungültige Note");
        }
    }

    public static void commentTask () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatur: ");
        double temp = sc.nextDouble();   // user double zwischenspeichern

        if (temp < 0) {                  // check nach minusgraden
            System.out.println("Frost");
        } else if (temp < 20) {          // check 0 - 19 grad
            System.out.println("Kühl");
        } else {                         // alles über 20grad ist warm
            System.out.println("Warm");
        }
    }

    public static void rabatteShop() {
        Scanner scanner = new Scanner(System.in);
        double userinput = scanner.nextDouble();
        double newPrice = 0.0;

        if(userinput > 500.0) {
            newPrice = userinput * 0.85; // 15%
            System.out.printf("%.2f Preis", newPrice);
            System.out.println();
        } if ( userinput <= 500.0 && userinput > 100.0) {
            newPrice = userinput * 0.9; // 10%
            System.out.printf("%.2f Preis", newPrice);
            System.out.println();
        } if ( userinput <= 100 && userinput > 50) {
            newPrice = userinput * 0.95; // 5%
            System.out.printf("%.2f Preis", newPrice);
            System.out.println();
        } if ( userinput <= 50) {
            System.out.printf("%.2f Preis ohne Rabatt", userinput);
        }

    }


    public static void main(String[] args) {
        //getNumber();
        //getEvenOrOdd();
        //minAge();
        // Aufgabe 5: A) klammer fehlt und B)
        //getGrade();
        // C)
        rabatteShop();

    }
}
