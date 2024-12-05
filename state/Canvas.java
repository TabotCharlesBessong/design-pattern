package state;

public class Canvas {
  private Tool currentTool;
  public void mouseDown(){
    currentTool.mouseDown();
  }

  public void mouseUp(){
    currentTool.mouseUp();
  }

  public void setCurrentTool(Tool cureenTool){
    this.currentTool = cureenTool;
  }

  public Tool getCurrentTool() {
    return currentTool;
  }
}
