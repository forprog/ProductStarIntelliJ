package Lesson17;

import java.util.ArrayList;
import java.util.List;

public class HeapOverflow {
    public static void main(String[] args) {
        List<String> infiniteList = new ArrayList<>();
        while (true){
            infiniteList.add(new String("Hello, world!"));
        }
    }
}
