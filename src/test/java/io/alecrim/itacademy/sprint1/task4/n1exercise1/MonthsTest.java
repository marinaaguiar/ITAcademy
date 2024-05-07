package io.alecrim.itacademy.sprint1.task4.n1exercise1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MonthsTest {

    @Test
    void checkIfListHas12Elements() {
        var  months = new Months();
        months.addAllMonths();
        assertEquals(12, months.getMonthsList().size());
    }

    @Test
    void checkIfMonthEightIsAugust() {
        var months = new Months();
        months.addAllMonths();
        ArrayList<Month> monthsList = months.getMonthsList();
        String monthEight = monthsList.get(7).name;
        assertEquals("August", monthEight);
    }

    @Test
    void checkIfMonthsListIsNotNull() {
        var months = new Months();
        months.addAllMonths();
        ArrayList<Month> monthsList = months.getMonthsList();
        assertNotNull(months);
    }
}