package lesson10.Inter;

public interface PrintableAndCheckable extends Printable, Checkable{

    void otherPrint();

    default void print (int index) {
        /*Printable*/Checkable.super.print(index);
    }
}
