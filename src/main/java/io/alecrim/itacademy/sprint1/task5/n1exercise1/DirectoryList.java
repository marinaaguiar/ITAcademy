package io.alecrim.itacademy.sprint1.task5.n1exercise1;
import java.io.File;
import java.util.Arrays;

public class DirectoryList {

    public static void getContentList(String filePath) {
        File directory = new File(filePath);

        String[] contents = directory.list();
        Arrays.sort(contents);

        if (!directory.isDirectory()) {
            System.out.println("The provided path is not a directory.");
            return;
        }

        for (String content : contents) {
            System.out.println(content);
        }
    }
}
