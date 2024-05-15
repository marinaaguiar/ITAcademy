package io.alecrim.itacademy.sprint1.task5.n1exercise4;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the path to the TXT file.");
            return;
        }

        String filePath = args[0];
        FileTextReader fileReader = new FileTextReader();
        fileReader.getTextFileContents(filePath);
    }
}
