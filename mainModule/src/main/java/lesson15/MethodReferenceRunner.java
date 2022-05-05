package lesson15;

import lesson15.dto.Account;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceRunner {

    public static void main(String[] args) {
        //Function<String, Integer> str2Int = str -> Integer.decode(str); // тоже самое, что снизу
        Function<String, Integer> str2Int = Integer::decode; // здесь метод-референс - это сокращённая запись лямбды



        //Function<Long, Long> self2self = val -> val;
        Function<Long, Long> self2self = Function.identity(); // аргумент, который приходит на вход функции будет возвращён результатом

        //Supplier<Account> accountGenerator = () -> new Account(); // здесь лямбда
        Supplier<Account> accountGenerator = Account::new; // здесь метод референс
    }
}
