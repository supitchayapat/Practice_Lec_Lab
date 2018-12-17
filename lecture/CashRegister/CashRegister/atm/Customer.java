package CashRegister.atm;

public class Customer {
    private int id;
    private int pin;
    private double balance;

    public Customer(int id, int pin, double balance) {
        this.id = id;
        this.pin = pin;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        if (amount > 0){
            balance -= amount;
        }
    }
}
