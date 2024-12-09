package observer.weather.solution;

public class WeatherStation extends Subject {
  private double temperature;

  public double getTemperature() {
    return temperature;
  }

  public void setTemperature(double temperature) {
    this.temperature = temperature;
    notifyObservers(); // Notify all observers of the change
  }
}
