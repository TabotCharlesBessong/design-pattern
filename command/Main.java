package command;

import command.automation.solution.Command;
import command.automation.solution.Light;
import command.automation.solution.LightOffCommand;
import command.automation.solution.LightOnCommand;
import command.automation.solution.RemoteControl;
// import command.automation.problem.Light;
// import command.automation.problem.RemoteControl;
import command.editor.BoldCommand;
import command.editor.History;
import command.editor.HtmlDocument;
import command.editor.UndoCommand;
import command.fx.Button;

public class Main {
  public static void main(String[] args) {

    System.out.println("Ecommenrce example");
    var service = new CustomerService();
    var command = new AddCustomerCommand(service);
    var button = new Button(command);
    button.click();

    System.out.println("\nText editor example");
    var history = new History();
    var document = new HtmlDocument();
    document.setContent("Hello world!");

    var boldCommand = new BoldCommand(document, history);
    boldCommand.execute();
    System.out.println(document.getContent());

    var undoCommand = new UndoCommand(history);
    undoCommand.execute();
    System.out.println(document.getContent());

    // System.out.println("\nProblem example of light automation'");
    // Light livingRoomLight = new Light();
    // RemoteControl remote = new RemoteControl(livingRoomLight);

    // remote.pressOffButton();
    // remote.pressOnButton();

    System.out.println("\nSolution example of light automation'");

    Light livingRoomLight = new Light();

    Command lightOn = new LightOnCommand(livingRoomLight);
    Command lightOff = new LightOffCommand(livingRoomLight);

    RemoteControl remote = new RemoteControl();

    // Turn the light ON
    remote.setCommand(lightOn);
    remote.pressButton(); // Output: The light is ON

    // Undo the operation
    remote.pressUndoButton(); // Output: The light is OFF

    // Turn the light OFF
    remote.setCommand(lightOff);
    remote.pressButton(); // Output: The light is OFF
  }
}
