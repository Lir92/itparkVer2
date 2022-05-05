package lesson12;

import lesson12.exception.NotEnoughMoneyException;

public class AccountRunner {

    public static void main(String[] args) {
        Account account = new Account(1000);
        System.out.println("Текущий баланс - " + account.getBalance());
        try {
            account.withdraw(5000); // возможный проблемный момент, т.е. если попытаются снять больше, чем есть на счету
        } catch (NotEnoughMoneyException exception) {
            exception.printStackTrace();
            System.out.println("На балансе недостаточно средств. Состояние баласнса " + exception.getBalance());
        }
        System.out.println("Текущий баланс - " + account.getBalance());
    }
}
