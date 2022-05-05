package lesson15;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRunner {

    private static final Integer THRESHOLD = 1000;

    public static void main(String[] args) {
        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            digits.add(new Random().nextInt(THRESHOLD));
        }
        System.out.println(digits);
        System.out.println("Сума через итерирование - " + summa(digits));
        System.out.println("Сума через StreamAPI - " + summaStream(digits));

        Stream<Integer> stream = digits.stream();

        Stream.Builder<Integer> builder = Stream.builder();
        for (int i = 0; i < 100; i++) {
            builder.add(new Random().nextInt(THRESHOLD));
        }

        Stream<String> names = Stream.of("Кирилл", "Виталий", "Анна", "Пётр");
        List<Integer> lengthsOfNames = names
                .peek(System.out::println) // берёт элементы и выводит их на экран
                .map(String::length) // лямбда метода length класса String и преобразует имена в числа по количеству букв в имен
                .filter(i -> i % 2 == 0) // фильтрация -> убирается значение с нечётным количеством букв
                .distinct() // убираются дубляжи
                .collect(Collectors.toList()); // оборачиваем всё это в лист
        System.out.println("Длина имён - " + lengthsOfNames);


    }

    public static long summa(Collection<Integer> ints) {
        long result = 0;
        for (Integer val: ints) {
            result += val;
        }
        return result;
    }

    public static long summaStream(Collection<Integer> ints) {
        //return ints.stream().reduce(0, (a, b) -> a + b);
        return ints.stream().reduce(0, Integer::sum);
    }
}

