package io.alecrim.itacademy.sprint1.task3.n1exercise3;

import java.util.*;

public class Questions {
    private Input input = new Input();
    static String userName;
    static int usersScore;
    static Set<Integer> uniqueNumbers = new HashSet<>();
    static int numberOfQuestionsMade = 0;
    static Map<String, String> dataMap;

    public Questions(Map<String, String> data) {
        this.dataMap = data;
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
            return;
        }

        try {
            while (numberOfQuestionsMade < 10) {
                String countryName = generateRandomCountry();
                String userInput = Input.readString("What is the capital of this country " + countryName + ": ");
                String usersAnswer;

                if (!Input.isStringValid(userInput)) {
                    System.out.println("Invalid Format.");
                    numberOfQuestionsMade += 1;
                    askUserQuestion();
                    return;
                }
                usersAnswer = userInput;
                if (isUserAnswerCorrect(countryName, usersAnswer)) {
                    usersScore += 1;
                    numberOfQuestionsMade += 1;
                    System.out.println("Correct Answer! Your score now is: " + usersScore);
                } else {
                    numberOfQuestionsMade += 1;
                    System.out.println("Sorry! Wrong Answer! The correct name is: " + dataMap.get(countryName));
                }
            }
            System.out.println("User's Total Score is: " + usersScore);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            askUserQuestion();
        }
    }

    private boolean isUserAnswerCorrect(String countryName, String usersAnswer) {
        return (dataMap.get(countryName).equalsIgnoreCase(usersAnswer));
    }

    private String generateRandomCountry() {
        List<String> keys = new ArrayList<>(dataMap.keySet());
        Random random = new Random();
        int randomIndex = random.nextInt(keys.size());
        if (!uniqueNumbers.contains(randomIndex)) {
            uniqueNumbers.add(randomIndex);
            String randomCountryName = keys.get(randomIndex);
            return randomCountryName;
        }
        return generateRandomCountry();
    }

    public String getUsersName() {
        return userName;
    }

    public int getUsersScore() {
        return usersScore;
    }
}
