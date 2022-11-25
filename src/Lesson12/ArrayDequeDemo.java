package Lesson12;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> countries = new ArrayDeque<>();

        countries.add("Zanzibar");
        countries.addFirst("Jamaica");
        countries.push("Belarus");
        countries.addLast("Albania");
        countries.add("UAE");

        System.out.println(countries);

        String first = countries.getFirst();
        System.out.println(first);
        System.out.println(countries.size());

        String last = countries.getLast();
        System.out.println(last);
        System.out.println(countries.size());
    }
}
