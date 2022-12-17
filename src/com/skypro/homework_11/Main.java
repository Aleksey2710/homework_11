package com.skypro.homework_11;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");

        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            printLeapYear(year);
        } else {
            printNotLeapYear(year);
        }
    }

    public static void printLeapYear(int yearValue) {
        System.out.println(yearValue + " год - високосный.");
    }
    public static void printNotLeapYear(int yearValue) {
        System.out.println(yearValue + " год - не високосный.");
    }
    public static void task2() {
        System.out.println("Задача 2");

        int clientOS = 0;
        int clientDeviceYear = 2011;
        choiceOS(clientOS, clientDeviceYear);
        }

    public static void choiceOS(int a, int b) {
        if (a == 0 && b < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (a == 0 && b >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (a == 1 && b < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (a == 1 && b >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такой версии не существует!");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");

        int deliveryDistance = 95;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет!");
        } else {
            int deliveryDay = day(deliveryDistance);
            System.out.println("Потребуется дней: " + deliveryDay);
        }
    }

    public static int day(int distance) {
        int day = 0;
        if (distance <= 20) {
            day++;
        } else if (distance > 20 && distance <= 60) {
            day += 2;
        } else { //if (distance > 60 && distance <= 100)
            day += 3;
        }
        return day;
    }
}


