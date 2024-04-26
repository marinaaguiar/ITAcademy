package io.alecrim.itacademy.sprint1.task1.n1exercise2;

public class Car {
    static final String brand = "Citroen";
    static String model;
    final int power;

    public Car(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public static void breakCar() {
        System.out.println("The vehicle is breaking");
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating");
    }

}
