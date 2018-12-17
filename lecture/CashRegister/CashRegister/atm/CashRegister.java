package CashRegister.atm;

public class CashRegister {
    private double purchase;
    private double payment;

    public CashRegister() {
        purchase = 0;
        payment = 0;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
    }

    public void calculateTax() {
        purchase = purchase + (purchase * 0.07);
    }

    public void enterPayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }

    public double getPurchase() {
        return purchase;
    }

    public double getPayment() {
        return payment;
    }
}
