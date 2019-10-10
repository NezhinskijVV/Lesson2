package ru.itsjava.algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Nezhinskij VV on 09.10.2019.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{-3, 0, 5, 2, -7};
        printArray(array);
        printArray(sortArray(array));
        printArray(array);

    }

    public static int[] enterArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи длину массива");
        int lengthOfArray = scanner.nextInt();
        int[] array = new int[lengthOfArray];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < lengthOfArray; i++) {
            System.out.println("Введи " + (i + 1) + "-й элемент:");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortArray(int[] array) {
        int[] sortArray = Arrays.copyOf(array, array.length);
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < sortArray.length - j - 1; i++) {
                if (sortArray[i] > sortArray[i + 1]) {
                    int temp = sortArray[i + 1];
                    sortArray[i + 1] = sortArray[i];
                    sortArray[i] = temp;
                }
            }
        }
        return sortArray;
    }

    public static void printArray(int[] array) {
        System.out.println("Вывод массива:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void switchElements(int[] array, int indexFrom, int indexTo) {
    }
}
//Сортировка: любая n*log(n)

