package strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashierTest {

    ShoppingCart cart;
    Cashier cashier;
    Account account;
    PaymentStrategy promptPay;
    PaymentStrategy creditCard;

    @BeforeEach
    void init(){
        cart = new ShoppingCart();
        cashier = new Cashier(9999);
        account = new Account("God");
    }

    @Test
    void sell_ShouldIncreaseMoney_WhenUsePromptPayStrategy(){
        account.deposit(1000);

        cart.addItem(new Item("Mouse",500));

        promptPay = new PromptPay("080-123-9999",account);

        cashier.sell(cart,promptPay);

        assertEquals(9999+500,cashier.getMoney());
        assertEquals(1000-500,account.getBalance());
    }

    @Test
    void sell_ShouldIncreaseMoney_WhenUseCreditCardStrategy(){
        account.deposit(100000);

        cart.addItem(new Item("Hauwei Y9 2019",10300));
        cart.addItem(new Item("Ipad Pro 2018", 1000));

        creditCard = new CreditCard("888-444-2136-1",account,28900);

        cashier.sell(cart,creditCard);

        assertEquals((9999+10300+1000),cashier.getMoney());
        assertEquals(10300+1000,((CreditCard) creditCard).getDebt());
        assertEquals(100000,account.getBalance());

    }

    @Test
    void sell_ShouldNotIncreaseMoney_WhenBalanceInPromptPayLessThanCost(){
        account.deposit(100);

        promptPay = new PromptPay("080-123-9999",account);

        cart.addItem(new Item("Mouse",500));

        cashier.sell(cart,promptPay);

        assertEquals(9999,cashier.getMoney());
        assertEquals(100,account.getBalance());
    }

    @Test
    void sell_ShouldNotIncreaseMoney_WhenFullDebt(){
        account.deposit(100000);

        cart.addItem(new Item("Hauwei Y9 2019",10300));
        cart.addItem(new Item("Ipad Pro 2018", 1000));

        creditCard = new CreditCard("888-444-2136-1",account,2000);

        cashier.sell(cart,creditCard);

        assertEquals(9999,cashier.getMoney());
        assertEquals(0,((CreditCard) creditCard).getDebt());
        assertEquals(100000,account.getBalance());
    }

}