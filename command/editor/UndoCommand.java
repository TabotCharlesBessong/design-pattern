package command.editor;

public class UndoCommand implements Command {
  private History history;

  public UndoCommand(History history) {
    this.history = history;
  }
  @Override
  public void execute() {
    if (history.size() > 0){
      System.out.println("Undoing command");
      history.pop().unexecute();
    }
  }
}
