package lesson17.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountRunner {

    public static void main(String[] args) {
        Account account = new Account();
        Lock lock = new ReentrantLock();
        for (int i= 0; i < 10; i++) { // здесь создаём 10 потоков, которые одновременно будут пытаться изменить account
            new Thread(new AccountThread(account, lock)).start();
        }
    }
}
