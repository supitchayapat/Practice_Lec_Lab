public class MonsterBall extends Item {
    private int value;

    public MonsterBall(String name, int quantity, double price, double sell, int value) {
        super(name, quantity, price, sell);
        this.value = value;
    }

    public MonsterBall(String name, int quantity, double price, double sell) {
        super(name,quantity,price,sell);
        this.value = 999;
    }


    @Override
    public String toString() {
        return "MonsterBall{name='" + super.getName()
                + "', quatity=" + super.getQuantity()
                + ", price=" + super.getPrice()
                + ", sellFor=" + super.getSell()
                + ", ballValue=" + this.value
                + "}";
    }
}
