package io.alecrim.itacademy.sprint1.task5.n1exercise1;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        String directoryPath = args[0];
        try {
            DirectoryList.getContentList(directoryPath);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
