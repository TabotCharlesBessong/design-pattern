function main() {
  console.log("Processing Credit Card Payment:");
  const creditCardPayment = new CreditCardPayment();
  creditCardPayment.processPayment(100);

  console.log("\nProcessing PayPal Payment:");
  const paypalPayment = new PayPalPayment();
  paypalPayment.processPayment(200);

  console.log("\nProcessing Crypto Payment:");
  const cryptoPayment = new CryptoPayment();
  cryptoPayment.processPayment(300);
}

main();
