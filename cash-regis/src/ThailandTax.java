public class ThailandTax implements TaxCalculater {
    @Override
    public double calculateTax(double purchase) {
        return purchase * 0.07;
    }
}
