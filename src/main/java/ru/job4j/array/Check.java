package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean model = data[0];
        for (boolean goal: data) {
            if (goal != model) {
                result = false;
                break;
            }
        }
        return result;
    }
}
