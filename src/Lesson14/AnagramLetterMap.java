package Lesson14;

import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.TreeMap;

public class AnagramLetterMap implements Comparable<AnagramLetterMap> {
    private TreeMap<Character,Integer> letters;

    public Map<Character, Integer> getLetters() {
        return letters;
    }

    public AnagramLetterMap(String word) {
        this.letters = new TreeMap<>();
        for (char curChar:word.toCharArray()) {
            letters.put(curChar,letters.getOrDefault(curChar,0)+1);
        }
    }

    public void setLetters(TreeMap<Character, Integer> letters) {
        this.letters = letters;
    }

    public boolean equals(AnagramLetterMap letterMap1){
        if (this.getLetters().size() == letterMap1.getLetters().size()){
            var ar1 = letterMap1.getLetters().entrySet().toArray();
            var ar2 = this.getLetters().entrySet().toArray();
            for (int i = 0; i < ar1.length; i++) {
                Map.Entry<Character,Integer> element1 = (Map.Entry<Character,Integer>) ar1[i];
                Map.Entry<Character,Integer> element2 = (Map.Entry<Character,Integer>) ar2[i];
                if (!(element1.getKey().equals(element2.getKey()) && element1.getValue().equals(element2.getValue()))){
                    return false;
                }
            }
            return true;
        } else return false;
    }

    @Override
    public int compareTo(@NotNull AnagramLetterMap o) {
        if (this.equals(o)) return 0;
        else return this.letters.size() - o.letters.size();
    }
}
