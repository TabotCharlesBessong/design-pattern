class CashPayment extends PaymentProcessor {
  protected deductFunds(amount: number): void {
    console.log(`Charging ${amount} using Physical cash...`);
  }
}
