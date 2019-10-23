package ru.itsjava.oop;

/**
 * Created by Nezhinskij VV on 23.10.2019.
 */
public class Garage {
    public static void main(String[] args) {
        Car lamborgini = new Car();
        Car ladaKalina = new Car();

        lamborgini.setColor("Yellow");
        ladaKalina.setColor("Purple");

        System.out.println("Цвет lamborgini " + lamborgini.getColor());
        System.out.println("Цвет lada kalina " + ladaKalina.getColor());

        Car failingCar = new Car();
        System.out.println("Цвет failing car: " + failingCar.getColor());

        Car notFailingCar = new Car("red");
        System.out.println("Цвет not failing car: " + notFailingCar.getColor());

        notFailingCar.setColor("blue");
        System.out.println("Цвет not failing car: " + notFailingCar.getColor());



    }
}
