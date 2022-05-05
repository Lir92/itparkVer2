package lesson10;

import lesson10.Inter.Checkable;
import lesson10.Inter.Printable;
import lesson10.Inter.PrintableAndCheckable;

public class FilePrinter extends AbstractPrinter implements PrintableAndCheckable {

    public FilePrinter() {
        super("файл");
    }

    @Override
    public void print() {
        // TODO: особый комментарий для отображения, что ещё надо сделать.
    }

    @Override
    public boolean check() {
        return false;
    }

    @Override
    public void otherPrint() {

    }
}
