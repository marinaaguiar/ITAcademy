package io.alecrim.itacademy.sprint1.task3;

import java.util.ArrayList;
import java.util.HashSet;

public class Months {
    public static ArrayList<Month> monthsList = new ArrayList<Month>();
    public static HashSet<Month> monthsListSet = new HashSet<>();

    public static void addMonth(Month month) {
        monthsList.add(month);
    }

    public static void addMonthAtSpecificOrder(Month month, int monthInNumber) {
        try {
            monthInNumber -= 1;
            monthsList.add(monthInNumber, month);
            System.out.println("Added " + month.name + " as month " + (monthInNumber + 1) + ", at index: " + monthInNumber);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds. Cannot add month at position " + (monthInNumber + 1));
            System.out.println(e.getMessage());
        }
    }

    public static void convertArrayListToSet() {
        monthsListSet = new HashSet<>(monthsList);
    }

    public static void printArrayList() {
        System.out.println("\nMonths Array List:");
        for (Month month : monthsList) {
            System.out.println(month.name);
        }
    }

    public static void printSetList() {
        System.out.println("\nMonths Set List:");
        for (Month month : monthsListSet) {
            System.out.println(month.name);
        }
    }
}
