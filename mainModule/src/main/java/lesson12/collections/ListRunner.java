package lesson12.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListRunner {

    public static void main(String[] args) {
        int [] ints = {1, 2, 3, 4 };

        List<Integer> integers = List.of(1,2,3,4,5,6); /* <Integer> - это generic - способ ограничения списка по типам
        значений, которые принимают элементы этого списка. Это значит, что в списке должны храниться элементы определённого типа. */
        for (/*Object*/Integer value: integers) { // так как у нас список неизвестного типа, мы используем Object
            //int index = (int) value; // преобразование к нужному типу
            System.out.print(/*index*/value + " ");
        }
        System.out.println();
        System.out.println("========1111111111111111111111111111111111111111111111111========");
        for (Iterator<Integer> iterator = integers.iterator(); iterator.hasNext();) {
            Integer value = iterator.next();
            System.out.print(value + " ");

            /*Так как изначально созданный список был неизменяемым, то и добавить элементы не получится */
        }

        System.out.println();
        System.out.println("========22222222222222222222222222222222222222222222222222========");

        /* ниже представлен пример списка с изменяемыми значениями*/

        List<String> names = new ArrayList<>(); // здесь мы можем указать размерность листа, указав максимальное
        // кол-во элементов в скобках, или оставить пустым и будет безразмерный список
        names.add("Vitaliy");
        names.add("Anatoliy");
        names.add("Sergey");
        names.add("Natalya");
        names.add("Olga");
        names.add("Eduard");
        System.out.println(names);
        String name = "Pyotr";
        System.out.println("В списке имён " + name + " " + (names.contains(name) ? "найден": "не найден"));
        names.remove("Sergey");
        System.out.println(names);
        System.out.println(names.size());
        names.sort(Comparator.naturalOrder());
        System.out.println(names);
        System.out.println("На первом месте - " + names.get(0));
        System.out.println(names.get(names.size() - 1));
        names.addAll(List.of("Vitaliy", "Kirill", "Marina"));
        System.out.println(names);
        System.out.println(names.indexOf("Vitaliy"));
        System.out.println(names.lastIndexOf("Vitaliy"));
    }
}