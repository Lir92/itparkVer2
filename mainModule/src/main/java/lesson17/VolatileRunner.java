package lesson17;

import lesson17.Thread.CounterThread;

public class VolatileRunner {

    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 0; i < 5; i++) {
            new CounterThread(counter, i).start();
        }
    }
}