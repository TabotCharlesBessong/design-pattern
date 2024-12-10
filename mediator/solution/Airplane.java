package mediator.solution;

public class Airplane {
  private String name;
  private AirTrafficControl atc;

  public Airplane(String name, AirTrafficControl atc) {
    this.name = name;
    this.atc = atc;
    atc.registerAirplane(this);
  }

  public void sendMessage(String message) {
    System.out.println(this.name + " sends: " + message);
    atc.sendMessage(message, this);
  }

  public void receiveMessage(String message, String senderName) {
    System.out.println(this.name + " received from " + senderName + ": " + message);
  }

  public String getName() {
    return name;
  }
}
