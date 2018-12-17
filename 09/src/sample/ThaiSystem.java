package sample;

public class ThaiSystem {

    private double tl;

    public ThaiSystem() {
        this.tl = 0;
    }

    public double getTl() {
        return tl;
    }

    public void setTamleung(double tl) {
        this.tl = tl;
    }

    public void setFromEnglishSystem(double lb) {
        this.tl = lb * 10.4525;
    }

    public void setFromMetricSystem(double kg) {
        this.tl = kg / 0.06;
    }

    public double toBaht() {
        return this.tl / 4;
    }

    public double toSaleung() {
        return toBaht() / 4;
    }
}
