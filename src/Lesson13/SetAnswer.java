package Lesson13;

import java.util.Arrays;
import java.util.HashSet;

public class SetAnswer {
    public static void main(String[] args) {
        var uniqueVisitors = new HashSet<String>();
        uniqueVisitors.addAll(Arrays.asList(args));
        System.out.println(uniqueVisitors);

    }
}
