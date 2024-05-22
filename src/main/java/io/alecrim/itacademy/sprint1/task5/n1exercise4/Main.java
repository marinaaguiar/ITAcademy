package io.alecrim.itacademy.sprint1.task5.n1exercise4;

import io.alecrim.itacademy.sprint1.task5.n1exercise1.DirectoryList;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        FileTextReader fileReader = new FileTextReader();

        try {
            fileReader.checkIfFileIsValid(args);
            String filePath = args[0];
            fileReader.getTextFileContents(filePath);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
