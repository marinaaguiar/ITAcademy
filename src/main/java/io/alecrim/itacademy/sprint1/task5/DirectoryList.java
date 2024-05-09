package io.alecrim.itacademy.sprint1.task5;
import java.io.File;
import java.util.Arrays;

public class DirectoryList {

    public static void getContentList(String filePath) {
        File fileDirectory = new File(filePath);

        if ((fileDirectory.exists()) && (fileDirectory.isDirectory())) {
            String[] contentList = fileDirectory.list();

            Arrays.sort(contentList);
            for (String item : contentList) {
                System.out.println(item);
            }
        } else {
            System.out.println("The specified directory does not exist or is not a directory.");
        }
    }
}
