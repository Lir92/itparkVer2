package lesson17.Locks;

import java.util.Random;
import java.util.concurrent.locks.Lock;

public class AccountThread implements Runnable {

    private Account account;
    private Lock lock;

    public AccountThread(Account account, Lock lock) {
        this.account = account;
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            while (!lock.tryLock()) { // в .tryLock() можно указывать на какое время мы хотим "захватить" поток ->
                // tryLock(5, TimeUnit.SECONDS) - значит, что lock захватит поток на 5 секунд, если он никем не занят
                Thread.sleep(100); // если захват потока не прошёл, т.е. блок while выдал false, то он засыпает на
                // 100 милисекунд и потом повторяет
            }

            int value = new Random().nextInt(500); // создаём случайное число от 0 до 500 не включая
            System.out.println("Пополнение осуществляется на " + value);
            account.fill(value);
            System.out.println("Текущий баланс " + account.getBalance());
        }catch (InterruptedException ie) {
            ie.printStackTrace();
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock(); // при использовании lock-ов, обязательно в блоке try-finally пользоваться lock.unlock(),
            // для того, чтобы, если в try части что-то пойдёт не так, код будет высвобождён.
        }
    }
}
