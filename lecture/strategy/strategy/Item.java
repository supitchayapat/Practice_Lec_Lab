package strategy;

public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
//        this.price = (price > 0) ? price = 0 : 0;
        if (price < 0)
            this.price = 0;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
