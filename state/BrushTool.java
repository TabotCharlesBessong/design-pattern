package state;

public class BrushTool implements Tool {
  @Override
  public void mouseDown(){
    System.out.println("BrushTool: Mouse Down");
  }

  @Override
  public void mouseUp(){
    System.out.println("BrushTool: Mouse Up");
  }
}
