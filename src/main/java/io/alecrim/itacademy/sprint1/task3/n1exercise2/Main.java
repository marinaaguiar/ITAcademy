package io.alecrim.itacademy.sprint1.task3.n1exercise2;
import io.alecrim.itacademy.sprint1.task3.n1exercise1.Month;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<Integer> reversedIntList = new ArrayList<>();

        intList.add(0);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        System.out.println("First list in order: " + intList);

        reversedIntList = intList.reversed();
        System.out.println("Reversed list using the first list in reverse order: " + reversedIntList);

        ListIterator<Integer> iterator = intList.listIterator();
        while (iterator.hasPrevious()) {
            int num = iterator.previous();
            reversedIntList.add(num);
        }
        System.out.println("Reversed list using the ListIterator: " + reversedIntList);
    }
}
