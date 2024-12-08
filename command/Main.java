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
// import command.taskManagement.problem.TaskScheduler;
import command.taskManagement.solution.EmailTask;
import command.taskManagement.solution.LogCleanupTask;
import command.taskManagement.solution.ReportTask;
import command.taskManagement.solution.TaskScheduler;

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

    // System.out.println("\n Task scheduler example without pattern");
    // TaskScheduler scheduler = new TaskScheduler();

    // scheduler.scheduleEmail("user@example.com");
    // scheduler.scheduleReport("Monthly Sales Report");
    // scheduler.scheduleLogCleanup();

    // scheduler.cancelTask("Report");

    System.out.println("\n Task scheduler example with pattern");
    TaskScheduler scheduler = new TaskScheduler();

    EmailTask emailTask = new EmailTask("user@example.com");
    ReportTask reportTask = new ReportTask("Monthly Sales Report");
    LogCleanupTask logCleanupTask = new LogCleanupTask();

    scheduler.addTask(emailTask); // Output: Sending email to: user@example.com
    scheduler.addTask(reportTask); // Output: Generating report: Monthly Sales Report
    scheduler.addTask(logCleanupTask); // Output: Cleaning up logs

    scheduler.cancelTask(reportTask); // Output: Canceling report generation: Monthly Sales Report
  }
}
