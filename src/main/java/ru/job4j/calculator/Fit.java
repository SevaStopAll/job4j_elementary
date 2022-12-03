package ru.job4j.calculator;

public class Fit {

    public static double calculateManWeight(short height) {
        return (height - 100) * 1.15;

    }

    public static double calculateWomanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.calculateManWeight(height);
        System.out.println("Man 187 is " + man);
    }

}
