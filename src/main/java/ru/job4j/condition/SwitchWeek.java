package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Понедельник";
                return name;
            case 2:
                name = "Вторник";
                return name;
            case 3:
                name = "Среда";
                return name;
            case 4:
                name = "Четверг";
                return name;
            case 5:
                name = "Пятница";
                return name;
            case 6:
                name = "Суббота";
                return name;
            case 7:
                name = "Воскресенье";
                return name;
            default:
                return "Ошибка";
        }

    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(1));
    }
}
