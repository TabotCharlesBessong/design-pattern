package observer.Market.problem;

public class Investor {
  private String name;

  public Investor(String name) {
    this.name = name;
  }

  public void checkStockPrice(StockMarket market) {
    System.out.println(name + " checking stock price: " + market.getStockPrice());
  }
}
