package io.alecrim.itacademy.sprint1.task4.n1exercise2;

public class CalculateDNI {
    public char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public char calculateLetterDNI(int dni) {
        return letters[dni % 23];
    }
}
