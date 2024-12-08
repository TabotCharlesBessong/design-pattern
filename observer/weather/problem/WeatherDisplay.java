package observer.weather.problem;

public class WeatherDisplay {
  private WeatherStation station;

  public WeatherDisplay(WeatherStation station) {
    this.station = station;
  }

  public void showTemperature() {
    System.out.println("Temperature: " + station.getTemperature());
  }
}
