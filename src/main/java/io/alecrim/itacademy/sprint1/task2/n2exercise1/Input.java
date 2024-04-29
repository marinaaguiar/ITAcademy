package io.alecrim.itacademy.sprint1.task2.n2exercise1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Input extends InputMismatchException {

    static Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        try {
            System.out.print(message);
            byte byteInfo = scanner.nextByte();
            return byteInfo;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            throw new InputMismatchException("Input Invalid! Format Error: Expected a Byte format - (e.g. 30).");
        }
    }

    public static int readInt(String message) {
        try {
            System.out.print(message);
            int intInfo = scanner.nextInt();
            return intInfo;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            throw new InputMismatchException("Input Invalid! Format Error: Expected an Int format - (e.g. 1994).");
        }
    }

    public static float readFloat(String message) {
        try {
            System.out.print(message);
            float floatInfo = scanner.nextFloat();
            return floatInfo;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            throw new InputMismatchException("Input Invalid! Format Error: Expected a Float format - (e.g. 5.0).");
        }
    }

    public static double readDouble(String message) {
        try {
            System.out.print(message);
            double doubleInfo = scanner.nextDouble();
            return doubleInfo;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            throw new InputMismatchException("Input Invalid! Format Error: Expected a Double format - (e.g. 100,000.00).");
        }
    }
}
