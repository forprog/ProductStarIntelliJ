package Lesson14;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Quiz1 {
    public static void main(String[] args) {
        /*Stream.of(1,2,3)
                .map(i -> {
                    System.out.println("jshfjsdhfjk "+i);
                    return  i+1;
                });*/

        /*List<List<String>> input = List.of(List.of("a","b","c"),List.of("1","2","3"));

        Stream<String> stream = input.get(0).stream()
                .flatMap(a -> input.get(1).stream().map(b -> b+a));
        stream.forEach(System.out::println);*/

        var visitors = Stream.of("John","Arnold","Rocky","Dolph");

        Optional<String> firstSemen = visitors.findFirst().filter(name -> name.equals("Semen"));

    }
}
