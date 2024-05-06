package io.alecrim.itacademy.sprint1.task4.n1exercise1;

import java.util.ArrayList;

public class Months {
    private ArrayList<Month> monthsList = new ArrayList<Month>();
    String[] monthsNames = new String[]{
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
    };

    public void addAllMonths() {
        for (String name : monthsNames) {
            Month month = new Month(name);
            monthsList.add(month);
        }
    }

    public void printMonths() {
        System.out.println("\nMonths List:");
        for (Month month : monthsList) {
            System.out.println(month.name);
        }
    }

    public ArrayList<Month> getMonthsList() {
        return monthsList;
    }
}
