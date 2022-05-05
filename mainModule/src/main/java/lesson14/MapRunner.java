package lesson14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class MapRunner {

    public static void main(String[] args) {
        Map<Integer, String> regoins = new LinkedHashMap<>();
        regoins.put(77, "Москва");
        regoins.put(63, "Самара");
        regoins.put(64, "Саратов");
        regoins.put(16, "Казань");
        regoins.put(78, "Санкт-Петербург");
        regoins.put(61, "Ростов-на-Дону");
        regoins.put(64, "Саратов2");
        regoins.put(71, null);
        regoins.put(null, null);
        int key = 71;
        System.out.println(regoins);

        String searchValue = "Ростов-на-Дону";

        System.out.println(regoins.get(77));
        if (regoins.containsKey(key)) { // логика проверки наличия null в значениях.
            System.out.println(regoins.get(key));
        }
        System.out.println("Покажи размер: " + regoins.size());
        System.out.println("Покажи все ключи: " + regoins.keySet()); // выдаёт в консоль все ключи
        System.out.println("Покажи все значения: " + regoins.values()); // выдаёт в консоль все значения
        System.out.println("Есть ли значение Самара?: " + regoins.containsValue("Самара")); // проверка наличия значения

        System.out.println("Ищем ключ по значению - " + getKeyByValue(regoins, searchValue));
    }

    public static Integer getKeyByValue (Map<Integer, String> regions, String searchValue) {
        for (Map.Entry<Integer, String> entry: regions.entrySet ()) {
            if (Objects.equals(searchValue, entry.getValue())) {
                return entry.getKey();
            }
        }
        throw new IllegalArgumentException("Ключа по значению " + searchValue + " не найдено");
    }

}
