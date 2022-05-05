package lesson10.Inter;

import lesson10.enumeration.Language;

public interface Printable {

    int INDEX = 1; // константа
    void print();

    static void print(String str){
        System.out.println(str);
    }
    
    default void print(int index) { // такой метод не требует переопределения в классе.
        System.out.println(index);
    }

    default void printHelloWorld(Language language) {
        switch (language) {
            case RUSSIAN -> System.out.println("Привет Мир");
            case ENGLISH -> System.out.println("Hello World");
            case GERMAN -> System.out.println("Hallo Welt");
            case FRENCH -> System.out.println("Salut le monde");
        }
    }
}
