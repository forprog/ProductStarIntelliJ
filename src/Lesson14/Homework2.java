package Lesson14;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework2 {
    public static void main(String[] args) {
        String input = "колба - бокал - блок; - Клоун каприз, карта - карат - каТар. Клоун - колун - уклон - кулон Приказ";

        HashSet<String> wordsDistinct = getWordsLowerCase(input);

        HashMap<AnagramLetterMap,Integer> lettersToWordCount = new HashMap<>();
        HashMap<AnagramLetterMap,ArrayList<String>> lettersToWords = new HashMap<>();

        for (String word:wordsDistinct) {
            AnagramLetterMap anagramLetterMap = new AnagramLetterMap(word);
            lettersToWordCount.put(anagramLetterMap,lettersToWordCount.getOrDefault(anagramLetterMap,0)+1);
            var curWords = lettersToWords.getOrDefault(anagramLetterMap, new ArrayList<>());
            curWords.add(word);
            lettersToWords.put(anagramLetterMap,curWords);
        }

        TreeMap<AnagramLetterMap,Integer> newMap = valueSort(lettersToWordCount);
        newMap.putAll(lettersToWordCount);

        lettersToWordCount.entrySet().stream()
                .limit(3)
                .forEach(anagramLetterMapIntegerEntry -> lettersToWords.get(anagramLetterMapIntegerEntry.getKey())
                        .forEach(System.out::println));
    }

     private static HashSet<String> getWordsLowerCase(String str){
        String WORD_PATTERN = "[a-zA-Zа-яА-Я]+";
        Pattern pattern = Pattern.compile(WORD_PATTERN);
        Matcher matcher = pattern.matcher(str);
        HashSet<String> result = new HashSet<>();
        while (matcher.find()) {
            result.add(matcher.group().toLowerCase());
        }
        return result;
    }

    public static <K, V extends Comparable<V> > TreeMap<K, V>
    valueSort(final Map<K, V> map)
    {
        // Static Method with return type Map and
        // extending comparator class which compares values
        // associated with two keys
        Comparator<K> valueComparator = new Comparator<K>() {

            // return comparison results of values of
            // two keys
            public int compare(K k1, K k2)
            {
                int comp = map.get(k1).compareTo(
                        map.get(k2));
                if (comp == 0)
                    return 1;
                else
                    return comp;
            }

        };

        // SortedMap created using the comparator
        TreeMap<K, V> sorted = new TreeMap<K, V>(valueComparator);

        sorted.putAll(map);

        return sorted;
    }
}
