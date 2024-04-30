package io.alecrim.itacademy.sprint1.task2.n2exercise1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Input {

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

            if (StringValidatorUtils.hasAtLeastFourDigits(intInfo)) {
                return intInfo;
            }
            throw new InputMismatchException("Input Invalid! Format Error: Expected an Int format - (e.g. 1994).");
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

    public static char readChar(String message) throws Exception {
        try {
            System.out.print(message);
            String stringInfo = scanner.next();
            if ((stringInfo.length() == 1) && (stringInfo.equalsIgnoreCase("F") || stringInfo.equalsIgnoreCase("P"))) {
                return stringInfo.charAt(0);
            }
            throw new Exception("Input Invalid! Format Error: Expected a char format - (e.g. 'P' for Part-time, 'F' for Full-time)");
        } catch (Exception e) {
            scanner.nextLine();
            throw new Exception("Input Invalid! Format Error: Expected a char format - (e.g. 'P' for Part-time, 'F' for Full-time)");
        }
    }

    public static String readString(String message) throws Exception {
        try {
            System.out.print(message);
            String stringInfo = scanner.next();

            if (StringValidatorUtils.containsOnlyLetters(stringInfo)) {
                return stringInfo;
            }
            throw new Exception("Input Invalid! Format Error: Expected a String format - (e.g. 'Marina)'");
        } catch (Exception e) {
            scanner.nextLine();
            throw new Exception("Input Invalid! Format Error: Expected a String format - (e.g. 'Marina)'");
        }
    }

    public static boolean readIfNo(String message) throws Exception {
        try {
            System.out.print(message);
            String stringInfo = scanner.next();

            if (stringInfo.equalsIgnoreCase("Y")) {
                return true;
            } else if (stringInfo.equalsIgnoreCase("N")) {
                return false;
            } else {
                throw new Exception("Input Invalid! Format Error: Expected a String format - (e.g. 'Y' or 'N').");
            }
        } catch (Exception e) {
            throw new Exception("Input Invalid! Format Error: Expected a String format - (e.g. 'Y' or 'N').");
        }
    }
}
