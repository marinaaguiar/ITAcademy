package io.alecrim.itacademy.sprint1.task6.n2exercise1;

public class GenericMethods {

    public static <T, U> void getPersonInfo(T firstName, U lastName, int age) {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
    }
}
