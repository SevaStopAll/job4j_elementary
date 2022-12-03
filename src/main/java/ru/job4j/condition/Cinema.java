package ru.job4j.condition;

public class Cinema {
    public static void allowAccess(int age) {
        System.out.println("The age of the customer is : " + age);
        if (age > 17) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("It is not for you.");
        }
    }

    public static void main(String[] args) {
        Cinema.allowAccess(21);
        Cinema.allowAccess(16);
        Cinema.allowAccess(18);

    }
}
