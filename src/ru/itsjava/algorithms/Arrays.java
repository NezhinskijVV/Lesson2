package ru.itsjava.algorithms;


import java.util.Scanner;

/**
 * Created by Nezhinskij VV on 02.10.2019.
 */
public class Arrays {
    public static void main(String[] args) {
//        int a = 12;
//        int b = 10;
//        System.out.println("Максимум из двух чисел");
////        int resultMax = max(a, b);  // в данном случае переменная resultMax нам не нужна
//        //считаем максимум с помощью нашего метода
////        System.out.println("Максимум из чисел " + a + " и " + b + " равен: " + max(a, b));
//        //считаем максимум с помощью встроенного пакета Math
//        System.out.println("Максимум из чисел " + a + " и " + b + " равен: " + Math.max(a, b));
//        {int invisibleVariable = 5;}
        Scanner scanner = new Scanner(System.in);
//        int firstNumber = enterIntValue(scanner);
//        int secondNumber = enterIntValue(scanner);
//        int maximum = max(firstNumber, secondNumber);
//        printMaximum(maximum);

//        printMaximum(max(5,6));
        printMaximum(max(enterIntValue(scanner),enterIntValue(scanner)));
        scanner.close();
    }

    //   введем значение типа int
    private static int enterIntValue(Scanner scanner) {
        System.out.println("Введите целое число:");
        return scanner.nextInt();
    }

    //максимум из двух чисел
    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    public static void printMaximum(int maximum) {
        System.out.println("Максимум: " + maximum);
    }

    public static void emptyMethod(String s, int num1, boolean bool, double doubleNum) {
    }
}


