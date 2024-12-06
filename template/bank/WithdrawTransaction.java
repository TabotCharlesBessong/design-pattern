package template.bank;

public class WithdrawTransaction extends BankTransaction{
  @Override
  protected void executeTransaction(){
    System.out.println("Withdrawing money from account");
  }
}
