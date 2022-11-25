package Lesson13;


import java.util.TreeMap;

public class HomeWork2 {
    public static void main(String[] args) {
        var visitorToVisitorCount = new TreeMap<String, Integer>();

        for (String visitor : args) {
            visitorToVisitorCount.put(visitor,visitorToVisitorCount.getOrDefault(visitor,0)+1);
        }
        System.out.println(visitorToVisitorCount);
    }

}
