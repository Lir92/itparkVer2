package lesson14.cornercase;

import java.util.HashMap;
import java.util.Map;

public class InterestingMap {
    public static void main(String[] args) {
        Map<Pair, Value> dictionaryMap = new HashMap<>();
        Pair pair = new Pair("Ключ 1", "Атрибут 1");
        dictionaryMap.put(pair, new Value("Значение 1"));
        dictionaryMap.put(new Pair("Ключ 10", "Атрибут 10"), new Value("Значение 10"));
        dictionaryMap.put(new Pair("Ключ 100", "Атрибут 100"), new Value("Значение 100"));
        dictionaryMap.put(new Pair("Ключ 1000", "Атрибут 1000"), new Value("Значение 1000"));

        System.out.println(dictionaryMap.get(pair));
        System.out.println(dictionaryMap.get(new Pair("Ключ 1", "Атрибут 1")));
    }
}