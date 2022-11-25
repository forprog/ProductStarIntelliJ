package Lesson13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class HomeWork1 {
    public static void main(String[] args) {
        var uniqueVisitors = new TreeSet<String>();
        uniqueVisitors.addAll(Arrays.asList(args));
        System.out.println(uniqueVisitors);

    }

}
