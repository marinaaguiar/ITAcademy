package io.alecrim.itacademy.sprint1.task8.n1exercise4;

import java.util.Arrays;
import java.util.List;

public class MonthsOfTheYearGenerator {
    public static void printMonthsOfTheYear() {
        List<String> months = Arrays.asList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        );
        months.forEach(System.out::println);
    }
}
