package ru.job4j.condition;

public class Max {
    public static int chooseMax(int first, int second) {
        return first > second ? first : second;
    }

    public static int chooseMax(int first, int second, int third) {
        return first > second ? chooseMax(first, third) : chooseMax(second, third);
    }

    public static int chooseMax(int first, int second, int third, int fourth) {
       return chooseMax(first, second, third) > fourth ? chooseMax(first, second, third) : second;
    }
}
