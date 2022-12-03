package ru.job4j.condition;

public class Games {
    public static void givePermission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the computer club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Games.givePermission(true, true);
        Games.givePermission(true, false);
        Games.givePermission(false, true);
        Games.givePermission(false, false);
    }
}
