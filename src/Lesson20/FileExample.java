package Lesson20;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) {
        testFile2();
     }

     public static void testFile1(){
         File dirProgramFiles = new File("C:\\Program files");
         if (dirProgramFiles.isDirectory()){
             for (File file:dirProgramFiles.listFiles()) {
                 if (file.isFile()){
                     System.out.println(file.getPath()+"\t file");
                 }
                 else {
                     System.out.println(file.getPath()+"\t dir");
                 }
             }
         }
     }

    public static void testFile2() {
        File file =new File("NewFile.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.isAbsolute());
        System.out.println(file.lastModified());
        System.out.println(new Date(file.lastModified()));
    }
}
