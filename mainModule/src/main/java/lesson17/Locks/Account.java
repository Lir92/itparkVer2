package lesson17.Locks;

public class Account {

    private int balance;

    public void fill(int money) {
        this.balance += money;
    }

    public int getBalance() {
        return balance;
    }
}
