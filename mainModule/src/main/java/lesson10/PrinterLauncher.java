package lesson10;

import lesson10.Inter.Printable;

public class PrinterLauncher {

    public static void main(String[] args) {
        Printable printable = new Printer();
        printable.print();
        System.out.println(Printable.INDEX);
        Printable.print("Hello World");
        printable.print(3);
    }
}
