package Lesson20;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        String command;
        Scanner keyBoard = new Scanner(System.in);

        boolean cont = true;
        while (cont) {
            System.out.println("Input command (1-write,2-show,3-exit)");
            command = keyBoard.next();
            switch (command) {
                case "1":
                    readParametersAndWriteToFile();
                    break;
                case "2":
                    showFileText();
                    break;
                case "3":
                    cont = false;
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }


    }

    private static void showFileText() {
        String fileName, dirName;
        Scanner keyBoard = new Scanner(System.in);

        System.out.println("Input directory name: ");
        dirName = keyBoard.next();
        System.out.println("Input file name: ");
        fileName = keyBoard.next();
        try {
            File file = getFile(fileName, dirName);
            if (file.exists()){
                List<String> linesFromFile = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
                System.out.println(linesFromFile);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void readParametersAndWriteToFile(){
        String fileName, dirName, text;
        Scanner keyBoard = new Scanner(System.in);

        System.out.println("Input directory name: ");
        dirName = keyBoard.next();
        System.out.println("Input file name: ");
        fileName = keyBoard.next();
        System.out.println("Input text to write to file: ");
        text = keyBoard.next();
        try {
            File file = getFile(fileName, dirName);
            writeToFile(file, text);
            System.out.println(file.length());
            System.out.println(new Date(file.lastModified()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeToFile(File file, String text) throws IOException {
        OutputStreamWriter streamWriter = new OutputStreamWriter(new FileOutputStream(file));
        streamWriter.write(text);
        streamWriter.close();
    }

    public static File getFile(String fileName, String dirName) throws Exception {
        File parent = new File(dirName);
        if (parent.exists()) {
            if (parent.canWrite()) {
                File file = new File(parent, fileName);
                return file;
            } else {
                throw new Exception("Can't write");
            }
        } else {
            throw new Exception("No such directory");
        }
    }
}
