package lesson14;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapRunner {

    public static void main(String[] args) {
        Map<String, String> words = new TreeMap<>(new Comparator<String>() { // определяем как будут выводиться значения по ключу
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        words.put("yellow", "жёлтый");
        words.put("red", "красный");
        words.put("green", "зелёный");
        words.put("black", "чёрный");

        // words.put(null, null);// в TreeMap null использовать как ключ запрещено
        System.out.println(words);
    }
}