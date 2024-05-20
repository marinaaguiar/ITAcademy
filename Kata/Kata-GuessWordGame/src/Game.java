import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Game {
    private static Map<String, String> dataMap;

    public void startGame() {
        storeData();
        Question question = new Question(dataMap);
        String username = question.getUsersName();
//        int usersScore = question.getUsersScore();
//        saveInfoInAFile(username, usersScore);
    }

    private void storeData() {
        dataMap = getDataHashMapFromTextFile();
        Map<String, String> newDataMap = new HashMap<>();

        for (String key : dataMap.keySet()) {
            String value = dataMap.get(key);
            newDataMap.put(key, value);
        }
        dataMap = newDataMap;
    }

    private Map<String, String> getDataHashMapFromTextFile() {
        Map<String, String> map = new HashMap<String, String>();
        final FileReader fileReader;

        try {
            fileReader = new FileReader("/Users/marina/Developer/ITAcademy/Kata-GuessWordGame/src/GuessWord.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");

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
}
