package observer;

import observer.Market.solution.Investor;
import observer.Market.solution.StockMarket;
// import observer.Market.problem.Investor;
// import observer.Market.problem.StockMarket;
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

    // StockMarket market = new StockMarket();
    // Investor investor1 = new Investor("Alice");
    // Investor investor2 = new Investor("Bob");

    // market.setStockPrice(100.50);
    // investor1.checkStockPrice(market);
    // investor2.checkStockPrice(market);

    // market.setStockPrice(105.75);
    // investor1.checkStockPrice(market); // Investors must manually check
    // investor2.checkStockPrice(market);

    StockMarket market = new StockMarket();

    Investor investor1 = new Investor("Alice");
    Investor investor2 = new Investor("Bob");

    market.addObserver(investor1);
    market.addObserver(investor2);

    market.setStockPrice(100.50); // Both investors notified
    market.setStockPrice(105.75); // Both investors notified
  }
}
