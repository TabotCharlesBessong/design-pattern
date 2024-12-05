package memento;

import java.util.ArrayList;
import java.util.List;

public class History {
  // store all states of the editor in a stack
  private List<EditorState> states = new ArrayList<>();

  // add all states
  public void push(EditorState state){
    states.add(state);
  }

  // remove and return the most recent state
  public EditorState pop(){
    return states.isEmpty() ? null : states.remove(states.size() - 1);
  }
}
