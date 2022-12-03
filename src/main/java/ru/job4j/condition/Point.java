package ru.job4j.condition;

public class Point {
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = Point.calculateDistance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) is " + result);
        result = Point.calculateDistance(1, 2, 2, 3);
        System.out.println("result (1, 2) to (3, 4) is " + result);
        result = Point.calculateDistance(5, 2, 10, 3);
        System.out.println("result (5, 2) to (10, 3) is " + result);
    }
}
