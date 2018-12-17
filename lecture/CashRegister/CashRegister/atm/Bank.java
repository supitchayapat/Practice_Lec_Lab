package CashRegister.atm;

import java.util.HashMap;

public class Bank {
    private HashMap<Integer,Customer> customers;

    public void transfer(int idC1, int  idC2, double amount){
        Customer c1 = customers.get(idC1);
        Customer c2 = customers.get(idC2);

        c1.withdraw(amount);
        c2.deposit(amount);
    }

    public boolean checkIdPin(int id, int pin){
        return false;
    }

    public void deposit(int id, double amount){
        Customer c = customers.get(id);

        c.deposit(amount);
    }


}
