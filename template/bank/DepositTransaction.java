package template.bank;

public class DepositTransaction extends BankTransaction {
  @Override
  protected void executeTransaction() {
    System.out.println("Transferring money to another account...");
  }
}
