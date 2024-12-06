package command.fx;

public class Button {
  private String label;
  private Command command;

  public Button(Command command){
    this.command = command;
  }

  public void click() {
    command.execute();
    System.out.println("Button clicked: " + label);
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label){
    this.label = label;
  }
}
