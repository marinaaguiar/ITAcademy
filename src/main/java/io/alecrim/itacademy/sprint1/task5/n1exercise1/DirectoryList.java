package io.alecrim.itacademy.sprint1.task5.n1exercise1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class DirectoryList {

    public static void getContentList(String filePath) throws FileNotFoundException {
        File directory = new File(filePath);

        String[] contents = directory.list();
        Arrays.sort(contents);

        if (!directory.isDirectory()) {
            throw new FileNotFoundException("The provided path is not a directory.");
        }

        for (String content : contents) {
            System.out.println(content);
        }
    }
}
