package product;

public class LineItem {
    private int quantity;
    private Product theProduct;

    public LineItem(Product aProduct, int aQuantity)
    {
        theProduct = aProduct;
        quantity = aQuantity;
    }


    public double getSubtotal(){
        return theProduct.getPrice() * quantity;
    }
    public String format(){
        return String.format("%-30s%8.2f%5d%8.2f",
                theProduct.getDescription(), theProduct.getPrice(),
                quantity, getSubtotal());
    }
}
