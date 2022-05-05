package lesson15.HomeWork15Stream;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;


public class CountWordsInText {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите какой-нибудь текст: ");
        String text = scanner.nextLine();
        scanner.close();

        //String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus.
        // Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur.
        // Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem.
        // Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.";
        //String text = "Вводим просто текст. Проверочный текст, где текст проверяют";

        countWords(text);
    }

    public static void countWords(String str) {
        String[] textToCount = str.split("[ ,.:;!?]"); // здесь указываем разделители, которые не должны быть учтены.
        Map<String, Integer> map = Arrays.stream(textToCount)
                .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
        map.entrySet().stream()
                .sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .forEach(System.out::println);
    }
}