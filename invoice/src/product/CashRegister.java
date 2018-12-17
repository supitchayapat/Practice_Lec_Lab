package product;

public class CashRegister {
    private Invoice invoice;
    private Store store;

    public CashRegister(Store store) {
        this.store = store;
    }

    public void makeNewSale(Address address){
        invoice = new Invoice(address);
    }

    public void buy(int prodId, int quantity){
        Product prod = store.getProduct(prodId);
        invoice.addItem(prod, quantity);
    }
    public Invoice endSale(){
        return invoice;
    }
}
