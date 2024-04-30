package io.alecrim.itacademy.sprint1.task3.n1exercise1;

public class Main {

    public static void main(String[] args) {

        Month january = new Month("January");
        Month february = new Month("February");
        Month march = new Month("March");
        Month april = new Month("April");
        Month may = new Month("May");
        Month june = new Month("June");
        Month july = new Month("July");
        Month august = new Month("August");
        Month september = new Month("September");
        Month october = new Month("October");
        Month november = new Month("November");
        Month december = new Month("December");

        Months.addMonth(january);
        Months.addMonth(january);
        Months.addMonth(february);
        Months.addMonth(march);
        Months.addMonth(april);
        Months.addMonth(may);
        Months.addMonth(june);
        Months.addMonth(july);
        Months.addMonth(september);
        Months.addMonth(october);
        Months.addMonth(november);
        Months.addMonth(december);

        Months.addMonthAtSpecificOrder(august, 8);
        Months.convertArrayListToSet();

        Months.printArrayList();
        Months.printSetList();
    }
}