package command.taskManagement.solution;

public class EmailTask implements Command {
  private String email;

  public EmailTask(String email) {
    this.email = email;
  }

  @Override
  public void execute() {
    System.out.println("Sending email to: " + email);
  }

  @Override
  public void cancel() {
    System.out.println("Canceling email to: " + email);
  }
}
