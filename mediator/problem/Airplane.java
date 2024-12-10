package mediator.problem;

public class Airplane {
  private String name;

  public Airplane(String name) {
    this.name = name;
  }

  public void sendMessage(Airplane airplane, String message) {
    System.out.println(this.name + " to " + airplane.getName() + ": " + message);
  }

  public String getName() {
    return name;
  }
}
