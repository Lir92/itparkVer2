package lesson15;

public class lesson15LectureLambdaAndStreamAPI {
    /*
======================================= Функциональный стиль программирования ==========================================

    Лямбды - анонимные функции.
====Лямбда - функция, требующая реализацию одного обстрактного метода.
    
    Лямбда-функции можно передавать в качестве аргумента другим методам

========================================= Stream API ====================================================================

    Операции в Stream бывают:
      == Промежуточные (может быть любое кол-во операций, пока в Stream есть данные для обработки)
            пр-р: filter, map, flatMap, peek.
        Результатом работы ПРОМЕЖУТОЧНЫХ операций является объект типа Stream с дженериком какого-то типа.

      == Треминальные (может быть только одна - завершающая операция. Все операции в Stream не будут выполнены, пока не
                     будет выполнена Терминальная операция. Терминальная операция возвращает какой-то конкретный результат.)
            пр-р: count, reduce, max, collect, forEach.
        Результатом работы ТЕРМИНАЛЬНОЙ операций является какой-то конкретный результат, например результат счётчика или
        какое-то множетсво значений и т.д.

     ** После выполнения Терминальной операции, Stream закрывается. Для выполнения операции из того же потока,
        необходимо создать его повторно, старый поток не получится использовать дважды.



     */
}
