package ru.job4j.condition;

public class Club {
    public static void givePermission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        givePermission(true, true);
        givePermission(true, false);
        givePermission(false, true);
        givePermission(false, false);
    }
}
