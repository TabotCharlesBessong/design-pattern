package observer.weather.solution;

public class WeatherDisplay implements Observer {
  private WeatherStation station;

  public WeatherDisplay(WeatherStation station) {
    this.station = station;
    station.addObserver(this); // Subscribe to updates
  }

  @Override
  public void update() {
    System.out.println("Updated Temperature: " + station.getTemperature());
  }
}
