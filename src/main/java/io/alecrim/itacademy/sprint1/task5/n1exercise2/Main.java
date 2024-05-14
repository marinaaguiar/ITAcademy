package io.alecrim.itacademy.sprint1.task5.n1exercise2;

public class Main {
    public static void main(String[] args) {

        DirectoryLister directoryList = new DirectoryLister();
        String directoryPath = args[0];
        directoryList.listDirectoryContents(directoryPath);
    }
}
