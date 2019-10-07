package ru.itsjava.algorithms;

/**
 * Created by Nezhinskij VV on 07.10.2019.
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println("Факториал числа: " + factorial(5));
        System.out.println("Сумма цифр числа: " + sumOfDigits(573));
    }

    //5! = 5 * 4 * 3 * 2 * 1
    public static int factorial(int num) {
        if ((num == 0) || (num == 1)) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static int sumOfDigits(int num) {
        if (num / 10 == 0) {
            return num;
        }
        return num % 10 + sumOfDigits(num / 10);
    }
}

//HW: 0. Проект
//    1. Бинарный поиск [1, 3, 6, 10]   Найти элемент(задан) в отсортированном по возрастанию массиве. Вывести индекс.
//    2. Разложить число на множители ( Вывести все множители)
