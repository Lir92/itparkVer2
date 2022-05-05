package lesson16.concurrency;

import java.math.BigDecimal;

public class AccountChangeBalanceThread extends Thread {

    private final Account account;

    public AccountChangeBalanceThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        try {
            synchronized (account) { // метод для синхронизации потока. Он необходим, что бы при многопоточности выполнялся блок целиком, а не частично
                System.out.println("Осуществляем изменение баланса на счёте из " + Thread.currentThread().getName());
                account.deposit(new BigDecimal(2000));
                Thread.sleep(1000);
                account.deposit(new BigDecimal(2000));
            }
            System.out.println("Текущее состояние счёта: " + account.getBalance());
        }catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt(); // при обработке InterruptedException необходимо писать данный код для
            // выяснения является ли поток прерван из вне
        }
    }
}
