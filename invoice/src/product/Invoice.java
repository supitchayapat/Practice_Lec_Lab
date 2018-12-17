package product;

import java.util.ArrayList;

public class Invoice {
    private double total;
    private Address billingAddress;
    private ArrayList<LineItem> items;

    public Invoice(Address billingAddress) {
        items = new ArrayList<>();
        this.billingAddress = billingAddress;
    }

    public void addItem(Product aProduct, int quantity){
        LineItem anItem = new LineItem(aProduct, quantity);
        items.add(anItem);
    }

    public double getTotal(){
        double total = 0;
        for (LineItem item : items)
        {
            total = total + item.getSubtotal();
        }
        return total;
    }

    public String format(){
        String r =  "                     I N V O I C E\n\n"
                + billingAddress.format()
                + String.format("\n\n%-30s%8s%5s%8s\n",
                "Description", "Price", "Qty", "Total");

        for (LineItem item : items)
        {
            r = r + item.format() + "\n";
        }

        r = r + String.format("\nAMOUNT DUE: $%8.2f", getTotal());

        return r;
    }
}
