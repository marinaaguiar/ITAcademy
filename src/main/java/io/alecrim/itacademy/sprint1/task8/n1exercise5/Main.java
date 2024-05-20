package io.alecrim.itacademy.sprint1.task8.n1exercise5;

public class Main {
    public static void main(String[] args) {
        PiValueGenerator piValueGenerator = () -> 3.1415;
        System.out.println("The value of Pi is: " + piValueGenerator.getPiValue());
    }
}
