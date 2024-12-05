package state;

import state.abuse.Stopwatch;

public class Main {
  public static void main(String[] args){
    var canvas = new Canvas();
    // canvas.setCurrentTool(new SelectionTool());
    // canvas.setCurrentTool(new BrushTool());
    canvas.setCurrentTool(new EraserTool());
    canvas.mouseDown();
    canvas.mouseUp();

    var stopwatch = new Stopwatch();
    // stopwatch.start();
    // stopwatch.pause();
    stopwatch.click();
    stopwatch.click();
    stopwatch.click();
  }
}
