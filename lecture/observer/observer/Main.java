package observer;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        WeatherData data = new WeatherData();

        CurrentCondition currentCondition = new CurrentCondition();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        data.registerObserver(currentCondition);
        data.registerObserver(statisticsDisplay);

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Please select menu [i] to insert data to program ; [e] to exit program.");
            String command = sc.next();
            if (command.equals("i")){
                System.out.print("Please enter [temperature] [humidity] [pressure] : ");
                Double temp = sc.nextDouble();
                Double humid = sc.nextDouble();
                Double pressure = sc.nextDouble();
                data.setMeasurement(temp,humid,pressure);
            }else if (command.equals("e")){
                System.out.println("Bye");
                break;
            }

        }

    }
}
