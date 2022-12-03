package ru.job4j.calculator;

public class ArgMethod {

    public static void sayHello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 6;
        ArgMethod.sayHello(name, age);
        ArgMethod.sayHello(name, age);
        ArgMethod.sayHello(name, age);
        ArgMethod.sayHello(name, age);
    }
}