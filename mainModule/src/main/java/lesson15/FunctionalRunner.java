package lesson15;

import lesson15.dto.Account;

import java.util.Random;
import java.util.function.*;

public class FunctionalRunner {

    public static void main(String[] args) {
        Function<String, Integer> str2Int = str ->Integer.decode(str);
        Integer result123 = str2Int.apply("123");
        System.out.println(result123);
        Integer result1 = str2Int.apply("1");
        System.out.println(result1);
        System.out.println(summa("123", "325", str2Int));

        Function<Account, Integer> account2Integer = account -> account.hashCode();
        Predicate<Account> activeAccountPredicate = account -> account.getBalance() > 0;// Predicate - возвращает булево значение
        Consumer<Account> printAccount = account -> System.out.println(account); // просто выполняет какое-то действие
        BiFunction<String, String, String> concatStrings = (str1, str2) -> str1 + str2;
        Supplier<Integer> generatorInt = () -> new Random().nextInt(); // не требует параметров на вход, просто генерирует что-то
        System.out.println("Generate random number: " + generatorInt);
    }

    public static int summa(String arg1, String arg2, Function<String, Integer> converter) {
        return converter.apply(arg1) + converter.apply(arg2);
    };
}
