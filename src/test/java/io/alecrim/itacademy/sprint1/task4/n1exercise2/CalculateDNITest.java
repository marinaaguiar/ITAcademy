package io.alecrim.itacademy.sprint1.task4.n1exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateDNITest {

    @ParameterizedTest
    @CsvSource ({
            "12345678, Z",
            "29083192, Z",
            "10923191, P",
            "98347982, M",
            "21908330, W",
            "19203810, Y",
            "97565782, N",
            "10392109, L",
            "98475947, K",
            "73847398, X"
    })

    public void checkIfDNIIsValid(int dni, char letter) {
        var calculateDNI = new CalculateDNI();
        char calculatedLetter = calculateDNI.calculateLetterDNI(dni);
        System.out.println("Expected letter: " + letter + "; Calculated letter: " + calculatedLetter);
        assertEquals(letter, calculatedLetter);
    }
}