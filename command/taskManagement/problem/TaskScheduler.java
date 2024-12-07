package command.taskManagement.problem;

import java.util.ArrayList;
import java.util.List;

public class TaskScheduler {
  private List<String> scheduledTasks = new ArrayList<>();

  public void scheduleEmail(String email) {
    System.out.println("Scheduling email: " + email);
    scheduledTasks.add("Email: " + email);
  }

  public void scheduleReport(String reportName) {
    System.out.println("Scheduling report generation: " + reportName);
    scheduledTasks.add("Report: " + reportName);
  }

  public void scheduleBackup(String backupName) {
    System.out.println("Scheduling backup: " + backupName);
    scheduledTasks.add("Backup: " + backupName);
  }
  public void scheduleLogCleanup() {
    System.out.println("Scheduling log cleanup");
    scheduledTasks.add("Log Cleanup");
  }

  public void cancelTask(String taskName) {
    System.out.println("Canceling task: " + taskName);
    scheduledTasks.removeIf(task -> task.contains(taskName));
  }
}
