package io.alecrim.itacademy.sprint1.task5.n1exercise3;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DirectoryLister directoryLister = new DirectoryLister();
        String directoryPath = args[0];
        List<String> contentList = directoryLister.listDirectoryContents(directoryPath);
        directoryLister.saveToFile(contentList, directoryPath);
    }
}
