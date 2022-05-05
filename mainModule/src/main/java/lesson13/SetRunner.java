package lesson13;

import java.util.*;

public class SetRunner {

    public static void main(String[] args) {
        System.out.println(Set.of(13, 15, -1, 28, 75));
        Set<Product> products = new LinkedHashSet<>(); //LinkedHashSet - даёт возможность выводить элементы в том порядке, в котором его задавали.
        products.add(new Product(1, "Хлеб", 35));
        products.add(new Product(10, "Хлеб", 35));
        products.add(new Product(2, "Молоко", 70));
        products.add(new Product(3, "Яблоки", 120));
        products.add(new Product(4, "Зубная паста", 300));
        products.add(new Product(5, "Мусорные пакеты", 20));
        System.out.println(products);

        Set<Integer> values = new TreeSet<>(); // TreeSet - добавление элементов будет по возрастающей или в алфавитном порядке
        values.add(150);
        values.add(1);
        values.add(138);
        values.add(-5);
        values.add(17);
        values.add(1);
        System.out.println(values);

        // 1-й способ определения порядка следования объектов в TreeSet
//        Set<Product> products2 = new TreeSet<>(new Comparator<Product>() { // Comparator - интерфейс, который сравнивает
//            // объекты способом, который мы определяем ниже
//            @Override
//            public int compare(Product o1, Product o2) {
//                return o1.getId().compareTo(o2.getId());
//            }
//        });
//
//        products2.add(new Product(145, "Хлеб", 35));
//        products2.add(new Product(10, "Хлеб", 35));
//        products2.add(new Product(21, "Молоко", 70));
//        products2.add(new Product(3, "Яблоки", 120));
//        products2.add(new Product(47, "Зубная паста", 300));
//        products2.add(new Product(-5, "Мусорные пакеты", 20));
//        System.out.println(products2);

        // 2-й способ определения порядка следования объектов в TreeSet
        // В данном методе в классе указываем имплементацию интерфейса Comparable и реализуем там логику сравнения элементов
        Set<Product> products3 = new TreeSet<>(new Comparator<Product>() { // Comparator - интерфейс, который сравнивает
            // объекты способом, который мы определяем ниже
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getId().compareTo(o1.getId());
            }
        });

        products3.add(new Product(145, "Хлеб", 35));
        products3.add(new Product(10, "Хлеб", 35));
        products3.add(new Product(21, "Молоко", 70));
        products3.add(new Product(3, "Яблоки", 120));
        products3.add(new Product(47, "Зубная паста", 300));
        products3.add(new Product(-5, "Мусорные пакеты", 20));
        System.out.println(products3);
    }
}