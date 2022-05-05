package lesson9;

public abstract class Account {
    private final boolean blocked; // инициализировать переменные можно сразу здесь, но они будут затираться, если есть
    private double balance; // конструктор, которые использует эти переменные.
    private final String owner; // при помощи final мы определяем, что пользователь один и никогда не изменится. поле с
    // final можно проинициализировать только 1 раз через конструктор этого же класса.

    public Account(String name) { //  - конструктор
        this.owner = name;
        this.balance = 0.0;
        this.blocked = false;
    }

//    public Account() {
//        this.owner = "Unknown";
//    }

    public boolean activated() {
        return true;
    }

    protected boolean isBlocked() {
        return this.blocked;
    }

    public boolean deposit(double amount) { // пополнение баланса
        if (isBlocked()) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) { // снятие денег
        if (isBlocked()) {
            return false;
        }
        if (this.balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    protected abstract void printBalance(); // при указании абстрактного метода, тело метода отсутствует, т.е. {} не указываются.

}
