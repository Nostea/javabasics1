package de.home.playgrounds.javabasics.exercise17_KommandozeilenArgs;

import java.util.Arrays;

public class SortNumbersArgs {
    public static void main(String[] args) {
        if (args.length > 0) {
            double[] numbers = new double[args.length];
            for (int i = 0; i < args.length; i++)
                numbers[i] = Double.parseDouble(args[i]);

            Arrays.sort(numbers);
            for (double number : numbers)
                System.out.println(number);
        }
    }
}

// in den Run -> edit configurations, program arguments kann man die parameter eingeben 1.24, 2.535, 25.876
