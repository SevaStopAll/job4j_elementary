package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        if (n == 0 || n == 1) {
            return result;
        } else {
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        }
        return result;
    }
}
