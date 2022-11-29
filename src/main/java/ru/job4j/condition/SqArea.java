package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
       return (p / (2 * (k + 1))) * ((p / (2 * (k + 1)) * k));

    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, real = " + result1);
        result1 = SqArea.square(6, 2);
        System.out.println("p = 6, k = 2, real = " + result1);
    }

}
