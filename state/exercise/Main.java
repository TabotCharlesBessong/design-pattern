package state.exercise;

public class Main {
  public static void main(String[] args) {
    DirectionService service = new DirectionService(new DrivingMode());
    service.getEta(); // Output: Calculating ETA (driving)
    service.getDirection(); // Output: Calculating Direction (driving)

    service.setTravelMode(new WalkingMode());
    service.getEta(); // Output: Calculating ETA (walking)
    service.getDirection(); // Output: Calculating Direction (walking)
  }
}
