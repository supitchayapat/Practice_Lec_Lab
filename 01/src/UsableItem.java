public class UsableItem extends Item {
    private double plusHp;
    private double plusDamage;
    private double plusDefense;

    public UsableItem(String name, int quantity, double price, double sell, double plusHP, double plusDMG, double plusDEF) {
        super(name, quantity, price, sell);
        this.plusDamage = plusDMG;
        this.plusHp = plusHP;
        this.plusDefense = plusDEF;
    }

    public double getPlusDamage() {
        return plusDamage;
    }

    public double getPlusHp() {
        return plusHp;
    }

    public double getPlusDefense() {
        return plusDefense;
    }

    @Override
    public String toString() {
        return "Usable Item{name='" + super.getName()
                + "', quatity=" + super.getQuantity()
                + ", price=" + super.getPrice()
                + ", sellFor=" + super.getSell()
                + "}";
    }
}
