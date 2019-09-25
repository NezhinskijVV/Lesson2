package ru.itsjava;

/**
 * Created by Nezhinskij VV on 25.09.2019.
 */
public class MainArrays {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        System.out.println(numbers);
        System.out.println("Первый элемент массива: " + numbers[0]);
        System.out.println("Десятый элемент массива: " + numbers[9]);

        numbers[4] = 5;
        System.out.println("Пятый элемент массива: " + numbers[4]);

        //вывод массива
        System.out.println("Вывод массива: ");
        System.out.print(numbers[0] + " "); //ctrl + D копировать предыдущую строку
        System.out.print(numbers[1] + " "); //огромный курсор (левая кнопка мыши + alt)
        System.out.print(numbers[2] + " ");
        System.out.print(numbers[3] + " ");
        System.out.print(numbers[4] + " ");
        System.out.print(numbers[5] + " ");
        System.out.print(numbers[6] + " ");
        System.out.print(numbers[7] + " ");
        System.out.print(numbers[8] + " ");
        System.out.print(numbers[9] + " ");

        System.out.println("\nДлина массива: " + numbers.length);

        System.out.println("Вывод с помощью цикла for");
        for (int i = 0; i < numbers.length; i++) { // fori цикл
            System.out.print(numbers[i] + " ");
        }

        //Task:
        // Дан массив.
        // Найти идекс элемента, который равен 5.
        // 0 0 0 0 5 0 0 0 0 0 --> индекс 4
        // 0 0 0 5 0 0 0 0 0 0 --> индекс 3
        // 0 0 0 0 0 0 0 0 0 5 --> индекс 9
        // 0 0 0 0 0 0 0 0 0 0 -->

        System.out.println("\nTASK");
        int[] arrayTask = new int[]{0, 5, 1, -1, 5, 0};

        for (int i = 0; i < arrayTask.length; i++) {
            System.out.print(arrayTask[i] + " ");
        }
        //1. Пишем цикл который пробегает по всем элементам
        //2. Если элемент равен 5, то выводим индекс.

//      System.out.println(arrayTask[10]); //ArrayIndexOutOfBoundsException выход за границу массива
        System.out.println();
        for (int i = 0; i < arrayTask.length; i++) {
            if (arrayTask[i] == 5){
                System.out.println("Искомый индекс: " + i);
                break;
            }
        }

        //Homework:
        //1. ?: оператор Элвиса
        //2. Вывести сумму всех элементов массива.
        //3. Вывести массив в обратном порядке.
        //4. Вывести элементы массива, которые делятся на 5 или на 3.

    }
}
