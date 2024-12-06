abstract class PaymentProcessor {
  // Template method: Defines the general workflow for processing a payment
  public processPayment(amount: number): void {
    this.validateDetails();
    this.deductFunds(amount);
    this.sendReceipt();
  }

  // Common steps
  private validateDetails(): void {
    console.log("Validating payment details...");
  }

  private sendReceipt(): void {
    console.log("Sending receipt to the customer...");
  }

  // Abstract method to be implemented by subclasses
  protected abstract deductFunds(amount: number): void;
}
