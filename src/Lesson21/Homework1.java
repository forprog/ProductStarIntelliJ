package Lesson21;
import java.io.*;

public class Homework1 {
    public static void main(String[] args) throws IOException {

/*        String sTest = "2332up987jup";
        highlightString(sTest);*/
        InputStreamReader isReader = new InputStreamReader(System.in);
        BufferedReader bufReader = new BufferedReader(isReader);

        String inputStr = "";
        while(inputStr != null) {
            inputStr=bufReader.readLine();
            if(inputStr != null) {
                highlightString(inputStr);
            }
        }
    }

    public static void highlightString(String strIn){
        String WORD_PATTERN = "up";
        String splitterStart = "\033[31m";
        String splitterEnd = "\033[39m";

        String strOut = strIn.replace(WORD_PATTERN,splitterStart+WORD_PATTERN+splitterEnd);
        System.out.print(strOut);

    }
}
