package ru.itsjava.introduction;

import java.util.Scanner;

/**
 * Created by Nezhinskij VV on 30.09.2019.
 */
public class Arrays {
    public static void main(String[] args) {
        //Вычислить факториал числа
        //Факториал 5! = 5 * 4 * 3 * 2 * 1  0! = 1! = 1
//        int iFact = 5;
//        int result = 1;
//
//        System.out.println("Введите число");
//        System.out.println("Ваше число:" + iFact);
//        if (iFact < 0) {
//            System.out.println("Введите положительное число");
//            System.exit(-1);
//        }
//
//        if (iFact == 0) {
//            iFact = 1;
//        } else if (iFact != 0) {
//            for (int i = 1; i <= iFact; i++) {  //fori - цикл for
//                result = result * i;
//            }
//        }
//        System.out.println("Факториал числа равен " + result);

//        int number = 5;
//        while (number != 0) {
//            System.out.println(number);
//            number--;
//        }
//
//        Scanner scan = new Scanner(System.in);  //создали объект типа Scanner
//        int enterValue = scan.nextInt();  //вызвали метод nextInt ожидаем получить значение int с клавиатуры
//        System.out.println(enterValue);   //вывели значение на экран
//
//        scan.close();                     //Не забываем закрывать поток ввода-вывода!
//

//        //Ввести число 5. Если ввели не 5  -> ошибка :( Вы ввели не 5 , а ... . Введите пожалуйста число 5!
//        Scanner scan = new Scanner(System.in);
//        int res;
//        while ((res = scan.nextInt()) != 5) {
//            System.out.println("Вы ввели не 5 , а " + res + " . Введите пожалуйста число 5!");
//        }
//        System.out.println("Спасибо, что ввели 5");
//        scan.close();
//
//        String[] arrayOfString = new String[10];
//        arrayOfString[0] = "Элемент 0";
//        arrayOfString[1] = "Элемент 1";
//        arrayOfString[2] = "Элемент 2";
//        arrayOfString[3] = "Элемент 3";
//        arrayOfString[4] = "Элемент 4";
//        arrayOfString[5] = "Элемент 5";
//        arrayOfString[6] = "Элемент 6";
//        arrayOfString[7] = "Элемент 7";
//        arrayOfString[8] = "Элемент 8";
//        arrayOfString[9] = "Элемент 9";
//
//        //for each
//        for(String elem : arrayOfString){
//            System.out.println(elem);
//        }

        System.out.println(63 % 2);
        System.out.println(63/2);
    }
}

//HW:
//1. Написать программу факториала через while
//2. Написать через while сумму цифр числа.  567 -> 5 + 6 + 7 = 18