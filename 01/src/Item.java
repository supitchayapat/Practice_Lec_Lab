public class Item {
    private String name;
    private int quantity;
    private double price;
    private double sell;

    public Item(String name, int quantity, double price, double sell) {
        this.name = name;
        this.quantity = quantity;
        this.price = price; // ราคาซื้อ
        this.sell = sell; // ราคาขาย
    }

    public void sell(int quatity){
        this.quantity -= quatity;
    }

    public void buy(int quatity){
        this.quantity += quatity;
    }

    @Override
    public String toString() {
        return "Item{name='" + this.name
                + "', quantity=" + this.quantity
                + ", price=" + this.price
                + ", sellFor=" + this.sell
                + "}";
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity += quantity;
    }

    public double getSell() {
        return sell;
    }

    public double getPrice() {
        return price;
    }
}
