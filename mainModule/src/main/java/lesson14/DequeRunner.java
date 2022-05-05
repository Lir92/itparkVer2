package lesson14;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeRunner {

    public static void main(String[] args) {
        Deque<Double> doubles = new ArrayDeque<>();
        doubles.add(15.);
        doubles.add(-1.78);
        doubles.addFirst(10.78); // addFirst - вставляет значение в голову очереди, не сморя на полседующие добавления
        // методом add.
        doubles.add(3.14); //
        doubles.add(103.19);
        doubles.addFirst(0.);
        System.out.println(doubles);
        doubles.remove(doubles.removeLast()); // удаляем последнее значение
        System.out.println(doubles);
        doubles.remove(doubles.remove()); // удаляем первое значение
        System.out.println(doubles);
    }
}