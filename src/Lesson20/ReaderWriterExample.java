package Lesson20;

import javax.annotation.processing.Filer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ReaderWriterExample {

    public static void main(String[] args) throws IOException {
        List<String> linesFromFile = new ArrayList<>();
        File inFile = new File("in.txt");
        BufferedReader reader = new BufferedReader(new FileReader(inFile));
        while (reader.ready()){
            linesFromFile.add(reader.readLine());
        }
        reader.close();

        List<String> linesFromFile2 = Files.readAllLines(inFile.toPath(), StandardCharsets.UTF_8);
        System.out.println(linesFromFile2.size());

    }
}
