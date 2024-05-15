package io.alecrim.itacademy.sprint1.task6.n2exercise2;

public class GenericMethods {

    public static <T> void getPersonInfo(T... args) {
        System.out.println("Arguments received:");
        for (T arg : args) {
            System.out.println(arg);
        }
    }
}
