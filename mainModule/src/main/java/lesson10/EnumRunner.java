package lesson10;

import lesson10.Inter.Printable;
import lesson10.enumeration.Language;

public class EnumRunner {

    public static void main(String[] args) {
        Printer printable = new Printer();
        printable.printHelloWorld(Language.ENGLISH);
        printable.print();
        printable.printHelloWorld(Language.as(3));
    }
}
