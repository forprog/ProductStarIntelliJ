package Lesson20;

import java.io.*;

public class FileAdaptersUsage {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("NewFile2.txt"));
        outputStreamWriter.write("Hello");
        outputStreamWriter.close();

    }
}
