package chain_of_responsibility;

import chain_of_responsibility.CustomerSupport.problems.SupportHandler;

public class Main {
  public static void main(String[] args) {
    SupportHandler level1 = new SupportHandler("Level 1 Support");
    level1.handleRequest("Technical");
  }
}
