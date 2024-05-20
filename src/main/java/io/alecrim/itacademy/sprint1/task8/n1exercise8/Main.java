package io.alecrim.itacademy.sprint1.task8.n1exercise8;

public class Main {
    public static void main(String[] args) {
        StringReverser reverser = input -> {
            StringBuilder reversed = new StringBuilder(input);
            return reversed.reverse().toString();
        };

        String inputString = "Hello, World!";
        String reversedString = reverser.reverse(inputString);

        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reversedString);
    }

}
