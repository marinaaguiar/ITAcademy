package io.alecrim.itacademy.sprint1.task5.n1exercise4;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class FileTextReader {

    public void getTextFileContents(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public void checkIfFileIsValid(String[] args) throws FileNotFoundException {
        if (args.length == 0) {
            System.out.println("Please provide the path to the TXT file.");
            throw new FileNotFoundException("The provided path is not a directory.");
        }
    }

}
