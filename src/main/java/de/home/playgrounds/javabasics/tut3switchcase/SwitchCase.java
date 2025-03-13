package de.home.playgrounds.javabasics.tut3switchcase;

public class SwitchCase {
    public static void main(String[] args) {
        if (args.length >= 1) {
            int points = 0;
            try {
                points = Integer.parseInt(args[0]);
            } catch(NumberFormatException e) {
                System.out.println("Ihre Eingabe ist keine Zahl.");
                System.exit(1);
            }
            int grade;

            if (points < 30) {
                grade = 6;
            } else if (points < 50) {
                grade = 5;
            } else if (points < 67) {
                grade = 4;
            } else if (points < 81) {
                grade = 3;
            } else if (points < 92) {
                grade = 2;
            } else {
                grade = 1;
            }
            switch (grade) {
                case 6:
                    System.out.println("Ungenügend");
                    break;
                case 5:
                    System.out.println("Mangelhaft");
                    break;
                case 4:
                    System.out.println("Ausreichend");
                    break;
                case 3:
                    System.out.println("Befriedigend");
                    break;
                case 2:
                    System.out.println("Gut");
                    break;
                case 1:
                    System.out.println("Sehr gut");
                    break;
                default:
                    System.out.println("Unzulässige Eingabe!");
            }




            System.out.println("Sie haben die Note " + grade + " erreicht.");
        } else {
// zu wenige Argumente
            System.out.println("Verwendung: java GradeFromPoints PUNKTE");
        }
    }
}
