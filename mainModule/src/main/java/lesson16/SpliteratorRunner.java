package lesson16;

import java.util.List;
import java.util.Spliterator;

public class SpliteratorRunner {

    public static void main(String[] args) {

        List<String> names = List.of("Виталий", "Андрей", "Пётр", "Алина", "Андрей", "Дмитрий", "Наталья");
        Spliterator<String> spliterator = names.stream().spliterator();
        Spliterator<String> anotherSpliterator = spliterator.trySplit();
        while (spliterator.tryAdvance(System.out::println)) {

        };
        System.out.println("-----------------------------");
        while(anotherSpliterator.tryAdvance(System.out::println)){ // альтернатива forEacRemaining

        };
    }
}