package ru.itsjava.oop;

/**
 * Created by Nezhinskij VV on 23.10.2019.
 */
public class Car {
    private String color;
    private double engineVolume;
    private int countOfWheels;
    private boolean isBeep;

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


}
//HW: 1. set и get для всех полей
//    2. метод toString  будет писать строковое представление объекта (все поля)
//    3. создать несколько объектов и повызывать написанные методы в Гараже
//    4. посмотреть лекцию про git + создать все, что там есть(внутри видео)
//    5. Создать свой класс ручек ( Марка, Толщина стержня, пишет/ не пиишет, год выпуска) Написать set get.
//    6. Прочесть первые (~20 страниц) Философия Java Брюс Эккель
