package lesson13;

import java.util.*;

public class LinkedListRunner {

    public static void main(String[] args) {
        List<String> words = new LinkedList<>();
        List<String[]> wordsOfWords = new LinkedList<>();
        List<Product> products = new LinkedList<>();
        words.add("Skoda");
        words.add("VW");
        words.add("Vaz");
        words.add("Bentley");
        words.add("Audi");
        words.add("BMW");
        words.add("Mercedes");
        words.add("Geely");
        ListIterator<String> wordListIterator = words.listIterator(); // у listIterator можно задать начальный индекс обхода
        // или задать обход с конца.
        while   (wordListIterator.hasNext()) { // Обход списка с начала, получение значения следующего элемента
            String word = wordListIterator.next();
            System.out.print(word + ", ");
        }

        System.out.println("");

        while   (wordListIterator.hasPrevious()) { // Обход списка с конца, получение значения предыдущего элемента
            String word = wordListIterator.previous();
            System.out.print(word + ", ");
        }
        System.out.println("");

        System.out.println(words);
        for (Iterator<String> iterator =  words.iterator(); iterator.hasNext();) { // уаление элементов коллекции при помощи итератора
            String next = iterator.next();
            //System.out.println(next);
            if (new Random().nextBoolean()) { // здесь случайным образом определяется элемент для удаления и здесь задаём свой принцип удаления
                System.out.println("Удаляемый элемент: " + next); // тут мы видим какие элементы будут удалены из списка
                iterator.remove();
            }
        }
        System.out.println(words);

        List<String> anotherWords = List.of("Lamborgini", "Suzuki", "Ford");
        List<String> yetAnotherListOfWords = new ArrayList<>(anotherWords); // конвертация одного типа списка в другой -
        // из LinkedList в ArrayList
        words.addAll(anotherWords); // добавление списка в другой список. Элементы при таком добавлении, идут в конец списка.
        words.addAll(yetAnotherListOfWords);
        words.set(5, "Jeep"); // замена элемента: (индекс элемента, новый элемент)
        System.out.println(words);

        swap(words, 1, 3);

        System.out.println(words);
    }

    private static void swap(List<String> list, int begin, int finish) { // метод для смены местами разных элементов в списке
        if (begin >= list.size() || finish >= list.size()){
            return;
        }
        String firstElement = list.get(begin);
        String secondElement = list.get(finish);

        list.set(begin, secondElement);
        list.set(finish, firstElement);
    }
}