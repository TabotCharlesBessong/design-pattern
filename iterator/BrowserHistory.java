package iterator;

public class BrowserHistory {
  private String[] urls = new String[10];
  private int count;

  public void push(String url) {
    urls[count++] = url;
  };

  public String pop() {
    count--;
    return urls[count];
  }

  public String[] getUrls() {
    return urls;
  }

  public Iterator createIterator() {
    return new ArrayIterator(this);
  }

  public class ArrayIterator implements Iterator {
    private BrowserHistory history;
    private int count;
    public ArrayIterator(BrowserHistory history){
      this.history = history;
    }

    @Override
    public boolean hasNext() {
      return count < history.count;
    }

    @Override
    public String current() {
      return history.urls[count];
    }

    @Override
    public void next() {
      count++;
    }
  }
  
}
