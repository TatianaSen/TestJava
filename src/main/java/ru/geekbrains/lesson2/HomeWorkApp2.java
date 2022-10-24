package ru.geekbrains.lesson2;

public class HomeWorkApp2 {


    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        System.out.println(checkSum(a, b));

        printPositiveNegative(-7);

        int i = -15;
        System.out.println(returnPositiveNegative(i));

        printStringNTimes("Hello", 10);

        int year = 2020;
        System.out.println(checkLeapYear(year));

    }


    private static boolean checkSum(int a, int b) {

        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static void printPositiveNegative(int c) {
        if (c >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    private static boolean returnPositiveNegative(int i) {
        if (i >= 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void printStringNTimes(String text, int count) {

        for (int i = 1; i <= count; i++) {
            System.out.println(text);
        }
    }

    private static boolean checkLeapYear(int year) {

        if (year > 1584 && year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            return true;

        } else {
            return false;
        }
    }


}

