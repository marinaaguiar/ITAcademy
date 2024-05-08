package io.alecrim.itacademy.sprint1.task4.n1exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateDNITest {

    @Test
    void checkIfDNIIsValid() {
        int[] testCases = { 12345678, 29083192, 10923191, 98347982, 21908330, 19203810, 97565782, 10392109, 98475947, 73847398 };
        char[] expectedLetters = {'Z', 'Z', 'P', 'M', 'W', 'Y', 'N', 'L', 'K', 'X'};
        var calculateDNI = new CalculateDNI();

        for (int i = 0; i < testCases.length; i++) {
            int dni = testCases[i];
            char expectedLetter = expectedLetters[i];
            char calculatedLetter = calculateDNI.calculateLetterDNI(dni);
            System.out.println("Expected letter: " + expectedLetter + "; Calculated letter: " + calculatedLetter);
            assertEquals(expectedLetter, calculatedLetter);
        }
    }
}