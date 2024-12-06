package template;

import template.geometry.Circle;
import template.geometry.Rectangle;
import template.geometry.Shape;
import template.geometry.Triangle;

public class Main {
  public static void main(String[] args) {
    System.out.println("Starting");
    Shape circle = new Circle();
    Shape rectangle = new Rectangle();
    Shape triangle = new Triangle();

    System.out.println("Drawing a circle:");
    circle.draw();

    System.out.println("\nDrawing a rectangle:");
    rectangle.draw();

    System.out.println("\nDrawing a triangle:");
    triangle.draw();
  }
}
