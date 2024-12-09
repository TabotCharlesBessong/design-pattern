package observer.Market.solution;

public class Investor implements Observer {
  private String name;

  public Investor(String name) {
    this.name = name;
  }

  @Override
  public void update(double stockPrice) {
    System.out.println(name + " received stock price update: " + stockPrice);
  }
}
