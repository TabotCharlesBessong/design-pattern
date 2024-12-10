package mediator;

import mediator.problem.Airplane;

public class Main {
  public static void main(String[] args) {
    Airplane plane1 = new Airplane("Plane 1");
    Airplane plane2 = new Airplane("Plane 2");
    Airplane plane3 = new Airplane("Plane 3");

    // Direct communication between airplanes
    plane1.sendMessage(plane2, "Requesting permission to land.");
    plane2.sendMessage(plane1, "Permission granted.");
    plane3.sendMessage(plane1, "I need to land too!");
  }
}
