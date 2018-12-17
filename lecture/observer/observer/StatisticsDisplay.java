package observer;

public class StatisticsDisplay implements Observer {

    private double prevTemp;
    private double maxTemp = Double.MIN_VALUE;
    private double minTemp = Double.MAX_VALUE;

    @Override
    public void update(double temp, double humid, double pressure) {
        if (prevTemp == 0)
            prevTemp = temp;
        if (temp < minTemp )
            minTemp = temp;
        if (temp > maxTemp )
            maxTemp = temp;
        double avg = (prevTemp + temp)/2;
        prevTemp = avg;
        display();
    }

    public void display(){

        System.out.println(("Average temperature: " + prevTemp + "F degrees"));

        System.out.println(("Maximum temperature: " + maxTemp + "F degrees"));
        System.out.println(("Minimum temperature: " + minTemp + "F degrees"));
    }
}
