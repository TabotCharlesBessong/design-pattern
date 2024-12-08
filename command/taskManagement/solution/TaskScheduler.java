package command.taskManagement.solution;

import java.util.ArrayList;
import java.util.List;

public class TaskScheduler {
  private List<Command> tasks = new ArrayList<>();

  public void addTask(Command task) {
    tasks.add(task);
    task.execute();
  }

  public void cancelTask(Command reportTask) {
    reportTask.cancel();
    tasks.remove(reportTask);
  }
}
