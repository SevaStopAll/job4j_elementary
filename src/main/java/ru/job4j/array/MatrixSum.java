package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] partArray : array) {
            for (int j = 0; j < partArray.length; j++) {
                rsl += partArray[j];
            }
        }
        return rsl;
    }
}
