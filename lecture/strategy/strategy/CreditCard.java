package strategy;

public class CreditCard implements PaymentStrategy {
    private String cardId;
    private int point;
    private double credit;
    private double debt; // dept per month
    private double totalDebt; // calculate by month
    private Account account;

    public CreditCard(String cardId, Account account, double credit) {
        this.cardId = cardId;
        this.account = account;
        this.credit = credit;
        debt = 0;
        totalDebt = 0;
        point = 0;
    }

    @Override
    public boolean pay(double cost) {
        if (debt + cost < credit) {
            debt += cost;
            point += (int) (cost / 1000) * 10;
            return true;
        }
        return false;
    }

    public double getDebt() {
        return debt;
    }
}
