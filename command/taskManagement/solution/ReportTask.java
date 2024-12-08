package command.taskManagement.solution;

public class ReportTask implements Command {
  private String reportName;

  public ReportTask(String reportName) {
    this.reportName = reportName;
  }

  @Override
  public void execute() {
    System.out.println("Generating report: " + reportName);
  }

  @Override
  public void cancel() {
    System.out.println("Canceling report generation: " + reportName);
  }
}
