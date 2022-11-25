package Lesson13;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class HomeWork3 {
    public static void main(String[] args) {
        var visitorToVisitorCount = new TreeMap<String, Integer>();

        for (String visitor : args) {
            visitorToVisitorCount.put(visitor,visitorToVisitorCount.getOrDefault(visitor,0)+1);
        }
        System.out.println(visitorToVisitorCount);

        printVisitorsByDescendingFrequency(visitorToVisitorCount);
    }
    public static void printVisitorsByDescendingFrequency(Map<String, Integer> visitorsToVisitsCount) {
        Comparator<Map.Entry<String, Integer>> comparing = Map.Entry.comparingByValue();
        var sortedEntries = new TreeSet<>(comparing.thenComparing(Map.Entry::getKey));
        sortedEntries.addAll(visitorsToVisitsCount.entrySet());
        System.out.println(sortedEntries);
    }
}
