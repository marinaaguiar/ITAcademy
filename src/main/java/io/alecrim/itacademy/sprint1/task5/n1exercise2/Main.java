package io.alecrim.itacademy.sprint1.task5.n1exercise2;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        DirectoryLister directoryList = new DirectoryLister();
        String directoryPath = args[0];
        try {
            directoryList.listDirectoryContents(directoryPath);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
