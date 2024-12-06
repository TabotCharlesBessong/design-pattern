package template.geometry;

public abstract class Shape {
  // Template method: Defines the steps to draw any shape
  public final void draw() {
    selectColor();
    setBorder();
    drawShape(); // Abstract step to be implemented by subclasses
  }

  // Shared steps
  private void selectColor() {
    System.out.println("Selecting default color...");
  }

  private void setBorder() {
    System.out.println("Setting default border...");
  }

  // Abstract step: Must be implemented by subclasses
  protected abstract void drawShape(); // Correctly declared as abstract
}
