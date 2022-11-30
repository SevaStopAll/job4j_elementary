package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount += amount * (percent / 100);
            amount -= salary;
            year++;
        }
        return year;
    }
}
