package chain_of_responsibility.CustomerSupport.problems;

public class SupportHandler {
  private String handlerName;

  public SupportHandler(String handlerName){
    this.handlerName = handlerName;
  }

  public void handleRequest(String request) {
    if (request.equals("Basic")) {
      System.out.println(handlerName + ": Handling basic request.");
    } else if (request.equals("Technical")) {
      System.out.println(handlerName + ": Forwarding to Level 2 Support.");
      new SupportHandler("Level 2 Support").handleRequest(request);
    } else if (request.equals("Complaint")) {
      System.out.println(handlerName + ": Forwarding to Manager.");
      new SupportHandler("Manager").handleRequest(request);
    } else {
      System.out.println(handlerName + ": Unable to handle request.");
    }
  }

}
