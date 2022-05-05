package lesson15.dto;

import java.util.Objects;

public class Account {

    private double balance;
    private String bic;
    private String owner;

    public Account() {

    };

    public Account(double balance, String bic, String owner) {
        this.balance = balance;
        this.bic = bic;
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.balance, balance) == 0 && Objects.equals(bic, account.bic) && Objects.equals(owner, account.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, bic, owner);
    }

    public double getBalance() {
        return balance;
    }
}
