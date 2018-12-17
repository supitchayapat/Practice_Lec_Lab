package CashRegister.atm;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CashRegisterUnitTest {

    CashRegister register;
    public double change;

    @BeforeEach
    void setUp() {
        register = new CashRegister();
    }

    @Test
    void giveChange_WhenCall(){
        register.recordPurchase(60);
        register.recordPurchase(40);
        register.calculateTax(); // 100+7
        register.enterPayment(200);
        change = register.giveChange(); //200-107=93
        assertEquals(93,change);

        register.recordPurchase(25);
        register.recordPurchase(105);
        register.calculateTax(); // 105+25+(103*0.07)
        register.enterPayment(200);
        change = register.giveChange();
        assertEquals(200-(105+25+(130*0.07)),change);
    }
}