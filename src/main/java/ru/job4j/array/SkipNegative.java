package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int index1 = 0; index1 < array.length; index1++) {
            for (int index2 = 0; index2 < array[index1].length; index2++) {
                if (array[index1][index2] < 0) {
                    array[index1][index2] = 0;
                }
            }
        }
        return array;
    }
}
