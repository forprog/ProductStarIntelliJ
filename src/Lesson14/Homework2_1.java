package Lesson14;

import java.util.*;
import java.util.stream.Collectors;

public class Homework2_1 {

    public static void main(String[] args) {
        String input = "колба - бокал - блок; - Клоун каприз, карта - карат - каТар. Клоун - колун - уклон - кулон Приказ";

        HashSet<String> wordsDistinct = Homework2.getWordsLowerCase(input);

        HashMap<String, TreeSet<String>> anagramToWords = new HashMap<>();

        for (String word:wordsDistinct) {
            var key = getKey(word);
            var curWords = anagramToWords.getOrDefault(key, new TreeSet<>());
            curWords.add(word);
            anagramToWords.put(key,curWords);
        }

        Comparator<Set<String>> listSizeComparator = Comparator.comparing(Set::size);

        var answer = anagramToWords.values().stream()
                        .sorted(listSizeComparator.reversed())
                                .limit(3)
                                        .map(ArrayList::new)
                                                .collect(Collectors.toList());

        System.out.println(answer);
    }

    private static String getKey(String word) {
        var result = word.toCharArray();
        Arrays.sort(result);
        return new String(result);
    }

}
