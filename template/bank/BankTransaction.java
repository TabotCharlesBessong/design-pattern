package template.bank;

public abstract class BankTransaction {
  public final void processTransaction() {
    authenticateUser();
    executeTransaction();
    sendNotification();
  }

  // shared steps
  private void authenticateUser() {
    System.out.println("Authenticating user...");
  }

  private void sendNotification(){
    System.out.println("Sending notification...");
  }

  protected abstract void executeTransaction();
}
