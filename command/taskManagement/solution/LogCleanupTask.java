package command.taskManagement.solution;

public class LogCleanupTask implements Command {
  @Override
  public void execute() {
    System.out.println("Cleaning up logs");
  }

  @Override
  public void cancel() {
    System.out.println("Canceling log cleanup");
  }
}
