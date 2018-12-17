public class Misc extends Item {
    public Misc(String name, int quantity, double price, double sell) {
        super(name, quantity, price, sell);
    }

    public Misc(String name, int quantity, double sell){
        super(name, quantity,0,sell);
    }

    @Override
    public String toString() {
        return "Misc{name='" + super.getName()
                + "', quantity=" + super.getQuantity()
                + ", sellFor=" + super.getSell()
                + "}";
    }
}
