package strategy;

public class Account {
    private String name;
    private double balance;

    public Account(String name) {
        this.name = name;
    }

    public void deposit(double money) {
        if (money > 0)
            balance += money;
    }

    public void withdraw(double money) {
        if (balance > money && money > 0) {
            balance -= money;
        }
    }

    public double getBalance() {
        return balance;
    }
}