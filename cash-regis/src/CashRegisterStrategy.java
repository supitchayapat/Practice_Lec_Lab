public class CashRegisterStrategy {
    private double payment;
    private double purchase;

    private TaxCalculater taxCalculater;

    public CashRegisterStrategy(TaxCalculater taxCal) {
        payment = 0;
        purchase = 0;

        taxCalculater = taxCal;
    }

    public void calculateTax(){
        purchase += purchase + taxCalculater.calculateTax(purchase);
    }

    public void recordPurchase(double amount){
        purchase += amount;
    }

    public void enterPayment(double amount){
        payment += amount;
    }

    public double giveChange(){
        double change = payment-purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}
