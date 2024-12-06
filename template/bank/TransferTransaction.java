package template.bank;

public class TransferTransaction extends BankTransaction{
  @Override
  protected void executeTransaction(){
    System.out.println("Transfering money from account to another");
  }
}
