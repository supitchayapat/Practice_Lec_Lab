public class Main {
    public static void main(String[] args) {

        CashRegister registerNoPattern = new CashRegister();

        registerNoPattern.recordPurchase(60);
        registerNoPattern.recordPurchase(40);
        registerNoPattern.calculateTaxTH();
        registerNoPattern.enterPayment(200);

        double change = registerNoPattern.giveChange();
        System.out.println(change);

        CashRegisterStrategy cashRegister = new CashRegisterStrategy(new NewyorkTax());
        cashRegister.recordPurchase(30);
        cashRegister.calculateTax();
        cashRegister.enterPayment(100);
        System.out.println(cashRegister.giveChange());
    }
}
