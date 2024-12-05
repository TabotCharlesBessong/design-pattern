package memento;

// Incharge of the state of the editor
public class EditorState {
  private final String content;

  // acting as the constructor for creating a new state
  public EditorState(String content){
    this.content = content;
  }


  // The getter method to retrieve the current state of the editor
  public String getContent(){
    return content;
  }
}
