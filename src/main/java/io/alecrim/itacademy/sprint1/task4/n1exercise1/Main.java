package io.alecrim.itacademy.sprint1.task4.n1exercise1;

public class Main {

    public static void main(String[] args) {

        Months months = new Months();
        months.addAllMonths();
        months.printMonths();
        System.out.println("Months size: " + months.getMonthsList().size());
    }
}
