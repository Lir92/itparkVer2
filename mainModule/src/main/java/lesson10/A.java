package lesson10;

public class A {

    private String str = "";

    private static String GLOBAL_STRING = "Example";

    {
        str = "Test"; // блок инициализации
    }

    static {
        GLOBAL_STRING = ""; // блок иницилизации статичного поля.
    }

    public A() {
        this.str = "Constructor"; // последнее инициализированное значение и будет присвоено
        System.out.println("вызван конструктор класса А");
    }

    protected void print1() {

    }
}
