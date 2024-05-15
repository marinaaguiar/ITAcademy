package io.alecrim.itacademy.sprint1.task6.n1exercise2;

public class GenericMethods {

    public static <T> void getPersonInfo(T firstName, T lastName, T age) {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
    }
}
