package sample;

public class ThaiSystem {
    private double slung;
    public ThaiSystem(){
        this.slung = 0;
    }

    public double getSlung() {
        return slung;
    }

    public void setFromKg(double kg){
        this.slung = (kg * 1000)/3.75;
    }

    public void setFromEnglish(double lb){
        this.slung = (lb/35.2739619)/3.75;
    }

    public void setFromThai(double tamlung){
        this.slung = tamlung/16;
    }

    public double toBaht(){
        return this.slung / 4;
    }

    public double toTamlung(){
        return (this.slung /4) /4;
    }

    public double toChang(){
        return ((this.slung /4) /4)/20;
    }

    public double toHaab(){
        return (((this.slung /4) /4)/20)/50;
    }
}
