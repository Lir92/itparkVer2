package lesson17.Thread;

import java.util.concurrent.atomic.AtomicBoolean;

public class FlagThread extends Thread {

    private AtomicBoolean flag;

    public FlagThread(AtomicBoolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        //while (!isInterrupted()) {} // проверка на то не прервал ли какой-то другой поток
        while (!flag.get()) {
            System.out.println("Привет из потока " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt(); // прерывает поток
            }
        }
    }
}
