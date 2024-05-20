
import java.util.*;

public class Question {
    private Input input;
    private static Set<Integer> uniqueNumbers;
    private static String userName;
    private static int numberOfQuestionsMade;
    private static Map<String, String> dataMap;
    int lastClueNumber = 1;

    public Question(Map<String, String> data) {
        this.dataMap = data;
        this.input = new Input();
        this.uniqueNumbers = new HashSet<>();
        getUserName();
        askUserQuestion();
    }

    private void getUserName() {
        try {
            String input = Input.readString("Please enter your name: ");
            if (!Input.isStringValid(input)) {
                System.out.println("Invalid Format.");
                getUserName();
            }
            userName = input;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            getUserName();
        }
    }

    private void askUserQuestion() {
        if (dataMap == null || dataMap.isEmpty()) {
            System.out.println("No data available.");
        }

        try {
            while (numberOfQuestionsMade < 5) {
                String guessWord = "Fries";
                String clue = generateClues();
                String userInput = Input.readString(clue + " ");
                String usersAnswer;

                if (!Input.isStringValid(userInput)) {
                    System.out.println("Invalid Format.");
                    numberOfQuestionsMade += 1;
                    askUserQuestion();
                }
                usersAnswer = userInput;
                if (isUserAnswerCorrect(guessWord, usersAnswer)) {
                    System.out.println("Correct Answer! Congratulations! You did it! :D");
                    return;
                } else {
                    numberOfQuestionsMade += 1;
                    lastClueNumber += 1;
                    System.out.println("Sorry! Wrong Answer! Try again!");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            askUserQuestion();
        }
    }

    private boolean isUserAnswerCorrect(String guessWord, String usersAnswer) {
        return guessWord.equalsIgnoreCase(usersAnswer);
    }

    private String generateClues() {
        return dataMap.get("Clue " + lastClueNumber);
    }

    public String getUsersName() {
        return userName;
    }
}
