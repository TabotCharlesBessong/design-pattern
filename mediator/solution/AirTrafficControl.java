package mediator.solution;

public interface AirTrafficControl {
  void sendMessage(String message, Airplane airplane);
  void registerAirplane(Airplane airplane);
}
