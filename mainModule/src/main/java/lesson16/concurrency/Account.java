package lesson16.concurrency;

import java.math.BigDecimal;

public class Account {
    
    private BigDecimal balance = BigDecimal.ZERO; // BigDecimal используется для денег

    public synchronized void deposit(BigDecimal money) { // здесь пополнение счёта
        this.balance = this.balance.add(money); // принцип работы: запрос баланса -> изменение его -> присвоение нового значения
    }

    public void withdraw(BigDecimal money) { // здесь снятие
        this.balance = this.balance.subtract(money); // принцип работы: запрос баланса -> изменение его -> присвоение нового значения
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
