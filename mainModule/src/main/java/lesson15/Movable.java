package lesson15;

@FunctionalInterface
public interface Movable {

    void move();

    default void moveAndPrint() {
        print("Начало движения");
        move();
        print("Конец движения");
    }

    static void print (String str) {
        System.out.println(str);
    }
}
