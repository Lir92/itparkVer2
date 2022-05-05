package lesson10;

import lesson10.Inter.Checkable;
import lesson10.Inter.Printable;
import lesson10.Inter.PrintableAndCheckable;

public class Printer extends AbstractPrinter implements PrintableAndCheckable {

    public Printer() {
        super("Консоль");
    }

    // Printer.class.getName() - получение имени класса
    @Override
    public void print() {
        System.out.println("Печать из класса " + Printer.class.getName() + " в " + getSource());
    }

    @Override
    public void otherPrint() {

    }

    @Override
    public boolean check() {
        return false;
    }
}
