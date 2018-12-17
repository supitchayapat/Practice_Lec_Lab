package observer;

public class CurrentCondition implements Observer {

    private double temperature;
    private double humidity;

    @Override
    public void update(double temp, double humid, double pressure) {
        this.temperature = temp;
        this.humidity = humid;
        display();
    }

    public void display(){
        System.out.println(("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity"));
    }
}
