package strategy;

public class Cashier {
    private double money;

    public Cashier(double money) {
        this.money = money;
    }

    public void sell(ShoppingCart cart, PaymentStrategy payment) {
        double total = cart.calculateTotal();
        if (payment.pay(total)) {
            money += total;
        }
    }

    public double getMoney(){
        return money;
    }
}
