package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private double temperature;
    private double humidity;
    private double pressure;

    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurement(double temp,double humid,double pressure){
        this.temperature = temp;
        this.humidity = humid;
        this.pressure = pressure;
        measurementsChanged();
    }
}
