package lesson15;

@FunctionalInterface
public interface DefaultLambda {

    default void print(String str) {
        System.out.println(str);
    }

    void print(); //обязательно должен быть абстрактный метод, если мы хотим пользоваться интерфейсом с дефолтным методом
}
