package lesson15;

import java.util.ArrayList;
import java.util.List;

public class AnonymousRunner {

    public static void main(String[] args) {
        final String value = "Тестовая строка";
        Comparable<String> comparator = name -> {
            System.out.println("На вход получили значение " + name);
            return value.compareTo(name);
        };

//        Movable movable = new Movable() { // полный вариант анонимного класса
//            @Override
//            public void move() {
//            }
//        };

        Movable movable = () -> { // лямбда-функция
            System.out.println("Мы находимся в движении");
        };

        Copyable<String> methodForCopy = (origin, copyCount) -> {
            String result = "";
            for (int i = 0; i < copyCount; i++){
              result+= origin;
          }
            return result;
        };

        List<String> words = new ArrayList<>();
        words.add("New line");
        words.add("Old line");
        words.add("one more new line");
        words.add("Last line");
        words.sort((str1, str2) -> str2.length() - str1.length());

        System.out.println(words);
    }
}