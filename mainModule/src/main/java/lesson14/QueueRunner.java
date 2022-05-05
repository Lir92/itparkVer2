package lesson14;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueRunner {

    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> numbers = new LinkedList<>();
        System.out.println(numbers.peek());
        numbers.add(1);
        numbers.add(5);
        numbers.add(-1);
        numbers.add(28);
        for (Integer value: numbers){
            System.out.println(value + " ");
        }
        System.out.println(numbers);

//        List<String> sharedResources = new ArrayList<>(); // код ниже проверяет список и если не находит искомое значение
//        // программа "засыпает" на время и затем повторяет процесс. Такой подход не всегда хорош, так как программа будет
//        // проверять список постоянно, тратя ресурсы.
//        while (true){
//            if (!sharedResources.isEmpty()) {
//                String word = sharedResources.get(0);
//                print(word);
//            }
//            Thread.sleep(1000);
//        }

        PriorityQueue priorityQueue = new PriorityQueue(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2); // здесь представлена обратная сортировка очереди. Добавление пользовательской
                // логики сравнения иногда не работает корректно из-за того, что логика очереди Queue начинает спорить с
                // переопределённым компаратором.
            }
        });
        priorityQueue.offer(185);
        priorityQueue.offer(1857);
        priorityQueue.offer(18);
        priorityQueue.offer(10000);
        priorityQueue.offer(-1);
        System.out.println(priorityQueue);

        Deque <Double> doubles = new ArrayDeque<>();
        doubles.addFirst(1.0); // добавление в голову очереди
        doubles.addLast(-1.0); // добавление в хвост очереди
        doubles.add(0.1); // добавление по умолчанию - в хвост очереди



        BlockingQueue<String> anotherSharedResources = new ArrayBlockingQueue<>(10); // данный код срабатывает
        // только тогда, когда в очереди появляются элементы. То есть цикл срабатывает не каждый раз, как в коде выше.
        while (true) {
            String take = anotherSharedResources.take();
            print(take);
        }

    }


    public static void print (String str) {
        System.out.println(str);
    }
}
