package CashRegister.atm;

public interface Observer {
    void update(double purchase,double payment,double change);
}
