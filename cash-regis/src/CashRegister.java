public class CashRegister {
    private double payment;
    private double purchase;

    public CashRegister() {
        payment = 0;
        purchase = 0;
    }

    public void recordPurchase(double amount){
        purchase += amount;
    }

    public void calculateTaxTH(){
        purchase += purchase + (purchase * 0.07);
    }

    public void calculateTaxCA(){
        purchase += purchase + (purchase * 0.075);
    }

    public void calculateTaxNY(){
        if (purchase > 100){
            purchase += purchase + (purchase * 0.075);
        }
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
