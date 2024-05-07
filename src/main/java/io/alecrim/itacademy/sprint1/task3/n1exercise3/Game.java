package io.alecrim.itacademy.sprint1.task3.n1exercise3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Game {
    static Map<String, String> dataMap;

    public void startGame() {
        storeData();
        Questions questions = new Questions(dataMap);
        String username = questions.getUsersName();
        int usersScore = questions.getUsersScore();
        saveInfoInAFile(username, usersScore);
    }

    private void storeData() {
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

    private Map<String, String> getDataHashMapFromTextFile() {
        Map<String, String> map = new HashMap<String, String>();
        final FileReader fileReader;

        try {
            fileReader = new FileReader("src/main/java/io/alecrim/itacademy/sprint1/task3/n1exercise3/countries.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");

                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim();
                    map.put(key, value);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error to read File");
        }
        return map;
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
