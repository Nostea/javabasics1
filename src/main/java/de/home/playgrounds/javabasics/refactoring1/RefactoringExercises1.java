package de.home.playgrounds.javabasics.refactoring1;

public class RefactoringExercises1 {
    // TODO: Magic Numbers durch Konstanten ersetzen, Methoden sinnvoll benennen

    public static double multiplyByPiDoubled(double number) {
        double pi = 3.14159265;
        double result = number * pi * 2;
        return result;
    }

    public static boolean checkIfNumberWithinRange(int number, int lowerLimit, int upperLimit) {
        if (lowerLimit <= number && number <= upperLimit) {
        }
        return number >= 18 && number <= 67;
    }

    public static double multiplySquaredNumberByPi(double number) {
        double pi = 3.14159265;
        double result = Math.pow(number, number) * pi;
        return result;
    }

    public static double getDiscount(DiscountType discountType) {
        return switch (discountType) {
            case DiscountType.STUDENT -> 0.15;
            case DiscountType.SENIOR -> 0.20;
            case DiscountType.EMPLOYEE -> 0.30;
            default -> 0.0;
        };
        //if (type.equals("STUDENT")) return 0.15;
        //if (type.equals("SENIOR")) return 0.20;
        //if (type.equals("EMPLOYEE")) return 0.30;
        //return 0.0;
    }

    public static double finalPrice(double price, DiscountType discountType) {
        double discount = getDiscount(discountType);
        double discountedPrice = price - (price * discount);
        return discountedPrice;
        //double discount = 0.0;
        //if (discountType.equals("STUDENT")) discount = 0.15;
        //if (discountType.equals("SENIOR")) discount = 0.20;
        //if (discountType.equals("EMPLOYEE")) discount = 0.30;
        //return price - (price * discount);
    }

    public static void main(String[] args) {
        System.out.println(multiplyByPiDoubled(4));
        System.out.println(checkIfNumberWithinRange(10, 18, 67));
        System.out.println(multiplySquaredNumberByPi(4));
        System.out.println();
        System.out.println(finalPrice(12.29, DiscountType.STUDENT));
        System.out.println(DiscountType.SENIOR);
    }

    // TODO: Duplikaten Code entfernen, Enum oder Konstanten verwenden
    public enum DiscountType {
        STUDENT, SENIOR, EMPLOYEE
    }
}
