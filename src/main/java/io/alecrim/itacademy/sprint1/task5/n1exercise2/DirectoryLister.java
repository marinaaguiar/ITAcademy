package io.alecrim.itacademy.sprint1.task5.n1exercise2;
import java.io.File;
import java.util.Arrays;
import java.text.SimpleDateFormat;

public class DirectoryLister {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public void listDirectoryContents(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory: " + directoryPath);
            return;
        }
        listDirectory(directory, 0);
    }

    public void listDirectory(File filePath, int level) {
        File[] files = filePath.listFiles();

        String levelBase = "    ".repeat(level);

        if (filePath.isFile()) {
            System.out.println(levelBase + "F: " + filePath.getName() + " Last Modified: " + dateFormat.format(filePath.lastModified()) + ")");

        } else if (filePath.isDirectory()) {
            System.out.println(levelBase + "D: " + filePath.getName() + " Last Modified: " + dateFormat.format(filePath.lastModified()) + ")");
            if (files != null) {
                Arrays.sort(files);
                for (File content : files) {
                    listDirectory(content, level + 1);
                }
            }
        }
    }
}
