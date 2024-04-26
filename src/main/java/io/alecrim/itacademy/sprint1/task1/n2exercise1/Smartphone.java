package io.alecrim.itacademy.sprint1.task1.n2exercise1;

public class Smartphone extends Phone implements Camera, Clock {

    public Smartphone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void photograph() {
        System.out.println("A picture is being taken");
    }

    public void alarm() {
        System.out.println("The alarm is sounding");
    }
}
