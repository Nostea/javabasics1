package de.home.playgrounds.javabasics.exercise27_override;

public class Calculator {
    public static int multiply (int num1, int num2) {
        return num1*num2;
    }

    public static double multiply (double num1, double num2) {
        return num1*num2;
    }

    public static int multiply (int num1, int num2, int num3) {
        return num1*num2*num3;
    }


    public static void main(String[] args) {
        System.out.println(multiply(2,4));
        System.out.println(multiply(2.0 , 4.0));
        System.out.println(multiply(2,4,3));
    }

}
