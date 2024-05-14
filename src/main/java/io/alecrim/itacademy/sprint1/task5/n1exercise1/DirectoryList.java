package io.alecrim.itacademy.sprint1.task5.n1exercise1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
