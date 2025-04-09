package de.home.playgrounds.javabasics.example4_varArgs_averageNumber;

public class varArgs {

    static double avg(double... array) {
        if (array.length == 0) return 0;

        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        System.out.println(avg(3, 9, 7, 6)); // 6.25
    }
}
