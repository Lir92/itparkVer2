package lesson17;

public class Counter {

    private volatile int value; // volatile - используется только на объекте, не на методах или классах

    public int getValue() {
        return value;
    }

    public synchronized void increment() {
        value++;
    }

    public int incrementAndGet() {
        value ++;
        return value;
    }
}