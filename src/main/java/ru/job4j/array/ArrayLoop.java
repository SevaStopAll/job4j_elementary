package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numMass = new int[5];
        for (int index = 0; index < numMass.length; index++) {
            numMass[index] = index * 2 + 3;
        }
        for (int i : numMass) {
            System.out.println(i);
        }
    }
}
