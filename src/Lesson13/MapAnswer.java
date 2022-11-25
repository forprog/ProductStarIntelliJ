package Lesson13;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class MapAnswer {
    public static void main(String[] args) {
        var visitorToVisitorCount = new HashMap<String, Integer>();

        for (String visitor : args) {
//            if (!visitorToVisitorCount.containsKey(visitor)){
//                visitorToVisitorCount.put(visitor,1);
//            } else {
//                int curCount = visitorToVisitorCount.get(visitor);
//                visitorToVisitorCount.put(visitor,curCount+1);
//            }
            visitorToVisitorCount.put(visitor,visitorToVisitorCount.getOrDefault(visitor,0)+1);
        }
        System.out.println(visitorToVisitorCount);
    }
}
