package command;

import command.editor.BoldCommand;
import command.editor.History;
import command.editor.HtmlDocument;
import command.editor.UndoCommand;
import command.fx.Button;

public class Main {
  public static void main(String[] args){

    var service = new CustomerService();
    var command = new AddCustomerCommand(service);
    var button = new Button(command);
    button.click();

    var history = new History();
    var document = new HtmlDocument();
    document.setContent("Hello world!");

    var boldCommand = new BoldCommand(document,history);
    boldCommand.execute();
    System.out.println(document.getContent());

    var undoCommand = new UndoCommand(history);
    undoCommand.execute();
    System.out.println(document.getContent());
  }
}
