package command;

import command.fx.Button;

public class Main {
  public static void main(String[] args){
    // System.out.println("Starting");

    var service = new CustomerService();
    var command = new AddCustomerCommand(service);
    var button = new Button(command);
    button.click();
  }
}
