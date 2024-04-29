package io.alecrim.itacademy.sprint1.task2.n2exercise1;

public class StringValidatorUtils {

    public static boolean containsOnlyLetters(String string) {
        for (char c : string.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasAtLeastFourDigits(int number) {
        String numberString = String.valueOf(number);
        return numberString.length() >= 4;
    }

}
