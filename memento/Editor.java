package memento;

public class Editor {
  private String content;

  // create a new state of the editor
  public EditorState createState(){
    return new EditorState(content);
  }

  public void restoreState(EditorState state){
    content = state.getContent();
  }

  public String getContent(){
    return content;
  }

  public void setContent(String content){
    this.content = content;
  }
}
