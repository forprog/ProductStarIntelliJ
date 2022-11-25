package Lesson14;

import java.util.Arrays;
import java.util.stream.Stream;

public class Homework1 {
    public static void main(String[] args) {
        String[] input = {"abcd5","abcde6","abc4","abcd5","abcde6","abcdef8"};

        Arrays.stream(input)
                .filter(curString -> curString.length() > 5)
                .map(curString -> curString.substring(0,1).toUpperCase()+curString.substring(1,curString.length()).toLowerCase())
                .forEach(System.out::println);

    }
}
