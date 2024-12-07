package command.automation.problem;

public class RemoteControl {
  public Light light;

  public RemoteControl(Light light) {
    this.light = light;
  }

  public void pressOnButton(){
    light.turnOn();
  }

  public void pressOffButton(){
    light.turnOff();
  }
}
