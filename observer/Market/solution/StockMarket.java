package observer.Market.solution;

public class StockMarket extends Subject {
  private double stockPrice;

  public double getStockPrice() {
    return stockPrice;
  }

  public void setStockPrice(double stockPrice) {
    this.stockPrice = stockPrice;
    notifyObservers(stockPrice); // Notify all observers when the price changes
  }
}
