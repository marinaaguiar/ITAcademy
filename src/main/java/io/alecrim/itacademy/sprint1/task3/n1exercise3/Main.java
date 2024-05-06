package io.alecrim.itacademy.sprint1.task3.n1exercise3;

import java.util.HashMap;
import java.io.File;
import java.io.*;
import java.util.*;

public class Main {
    static Map<String, String> dataMap;
    static String userName;
    static int usersScore;
    static Set<Integer> uniqueNumbers = new HashSet<>();
    static int numberOfQuestionsMade = 0;

    public static void main(String[] args) {
        storeData();
        Input input = new Input();
        getUserName();
        askUserQuestion();
        saveInfoInAFile(userName, usersScore);
    }

    public static void storeData() {
        dataMap = getDataHashMapFromTextFile();
        Map<String, String> newDataMap = new HashMap<>();

        for (String key : dataMap.keySet()) {
            String value = dataMap.get(key);
            String modifiedValue = value.replace("_", " ");
            String modifiedKey = key.replace("_", " ");
            newDataMap.put(modifiedKey, modifiedValue);
        }
        dataMap = newDataMap;
    }

    public static Map<String, String> getDataHashMapFromTextFile() {

        final String filePath = "/Users/marina/Developer/ITAcademy/src/main/java/io/alecrim/itacademy/sprint1/task3/n1exercise3/countries.txt";
        Map<String, String> map = new HashMap<String, String>();

        File file = new File(filePath);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");

                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim();
                    map.put(key, value);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    public static void getUserName() {
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

    public static void askUserQuestion() {
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

    public static boolean isUserAnswerCorrect(String countryName, String usersAnswer) {
        return (dataMap.get(countryName).equalsIgnoreCase(usersAnswer));
    }

    public static String generateRandomCountry() {
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

    public static void saveInfoInAFile(String userName, int score) {
        String fileName = "classification.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write("Username: " + userName + "," + " Total Score: " + score);
            writer.newLine();
            System.out.println("Data saved at " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}

