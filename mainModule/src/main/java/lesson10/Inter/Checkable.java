package lesson10.Inter;

public interface Checkable {
    boolean check();

    default void print(int index) { // такой метод не требует переопределения в классе.
        System.out.println("Совершенно другой текст");
    }
}
