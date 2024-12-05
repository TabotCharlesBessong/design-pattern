package state;

public class SelectionTool implements Tool {
  
  @Override
  public void mouseDown(){
    System.out.println("SelectionTool: mouseDown");
  }

  @Override
  public void mouseUp(){
    System.out.println("SelectionTool: mouseUp");
  }
}
