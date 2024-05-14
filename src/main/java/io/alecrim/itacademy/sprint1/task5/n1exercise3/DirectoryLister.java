package io.alecrim.itacademy.sprint1.task5.n1exercise3;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectoryLister {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public List<String> listDirectoryContents(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory: " + directoryPath);
            return new ArrayList<>();
        }
        return listDirectory(directory, 0);
    }

    private List<String> listDirectory(File filePath, int level) {
        List<String> result = new ArrayList<>();
        File[] files = filePath.listFiles();

        String levelBase = "    ".repeat(level);

        if (filePath.isFile()) {
            result.add(levelBase + "F: " + filePath.getName() + " Last Modified: " + dateFormat.format(filePath.lastModified()));

        } else if (filePath.isDirectory()) {
            result.add(levelBase + "D: " + filePath.getName() + " Last Modified: " + dateFormat.format(filePath.lastModified()));
            if (files != null) {
                Arrays.sort(files);
                for (File content : files) {
                    result.addAll(listDirectory(content, level + 1));
                }
            }
        }
        return result;
    }

    public void saveToFile(List<String> contentList, String directoryPath) {
        File directory = new File(directoryPath);
        File file = new File(directory, "FilesList.txt");
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            for (String content : contentList) {
                writer.println(content);
            }
            System.out.println("Content saved to file: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Failed to save content to file: " + e.getMessage());
        }
    }
}