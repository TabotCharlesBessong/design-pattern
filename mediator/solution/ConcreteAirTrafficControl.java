package mediator.solution;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAirTrafficControl implements AirTrafficControl {
  private List<Airplane> airplanes = new ArrayList<>();

  @Override
  public void sendMessage(String message, Airplane sender) {
    for (Airplane airplane : airplanes) {
      if (airplane != sender) {
        airplane.receiveMessage(message, sender.getName());
      }
    }
  }

  @Override
  public void registerAirplane(Airplane airplane) {
    airplanes.add(airplane);
  }
}
