public class CaliforniaTax implements TaxCalculater {
    @Override
    public double calculateTax(double purchase) {
        return purchase * 0.075;
    }
}
