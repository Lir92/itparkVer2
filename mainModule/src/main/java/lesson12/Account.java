package lesson12;

import lesson12.exception.NotEnoughMoneyException;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public /*void*/ double withdraw (double amount) {
        if (this.balance < amount) {
            throw new NotEnoughMoneyException(this.balance, "Произошла ошибка снятия денежных средств. Текущий балланс меньше суммы снятия");
        }
        balance -= amount;
        return this.balance;
    }

    public double getBalance() {
        return balance;
    }
}
