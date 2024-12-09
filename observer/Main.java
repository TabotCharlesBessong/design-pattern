package observer;

import observer.weather.solution.WeatherDisplay;
import observer.weather.solution.WeatherStation;

// import observer.weather.problem.WeatherDisplay;
// import observer.weather.problem.WeatherStation;

public class Main {
  public static void main(String[] args) {
    // WeatherStation station = new WeatherStation();
    // WeatherDisplay display1 = new WeatherDisplay(station);
    // WeatherDisplay display2 = new WeatherDisplay(station);

    // station.setTemperature(25.5);
    // display1.showTemperature(); // Each display manually checks
    // display2.showTemperature();

    WeatherStation station = new WeatherStation();

    WeatherDisplay display1 = new WeatherDisplay(station);
    WeatherDisplay display2 = new WeatherDisplay(station);

    station.setTemperature(25.5); // All displays are notified automatically
    station.setTemperature(30.0);
    System.out.println("Station: " + display1 + ", " + display2);
  }
}
