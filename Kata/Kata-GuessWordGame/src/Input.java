import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String readString(String message) {
        try {
            System.out.print(message);
            String stringInfo = scanner.nextLine();
            return stringInfo;
        } catch (Exception e) {
            scanner.nextLine();
            System.out.println("Input Invalid! Format Error: Expected a String format.");
        }
        return "";
    }

    public static boolean isStringValid(String string) {
        return ((containsOnlyCharactersOrSpaces(string)) && (!string.isEmpty()) && (!string.isBlank()));
    }

    public static boolean containsOnlyCharactersOrSpaces(String str) {
        return str.matches("[a-zA-Z -]*");
    }
}