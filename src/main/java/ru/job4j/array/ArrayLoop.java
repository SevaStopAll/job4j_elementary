package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numMass = new int[5];
        for (int i = 0; i < numMass.length; i++) {
            numMass[i] = i * 2 + 3;
        }
        for (int j = 0; j < numMass.length; j++) {
            System.out.println(numMass[j]);
        }
    }
}
