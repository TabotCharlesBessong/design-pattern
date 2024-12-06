package template;

import template.bank.BankTransaction;
import template.bank.DepositTransaction;
import template.bank.TransferTransaction;
import template.bank.WithdrawTransaction;
import template.geometry.Circle;
import template.geometry.Rectangle;
import template.geometry.Shape;
import template.geometry.Triangle;

public class Main {
  public static void main(String[] args) {
    System.out.println("Starting");

    // Geometry example
    Shape circle = new Circle();
    Shape rectangle = new Rectangle();
    Shape triangle = new Triangle();

    System.out.println("Drawing a circle:");
    circle.draw();

    System.out.println("\nDrawing a rectangle:");
    rectangle.draw();

    System.out.println("\nDrawing a triangle:");
    triangle.draw();

    // Finance example
    BankTransaction withdraw = new WithdrawTransaction();
    BankTransaction deposit = new DepositTransaction();
    BankTransaction transfer = new TransferTransaction();

    System.out.println("Processing Withdraw Transaction:");
    withdraw.processTransaction();

    System.out.println("\nProcessing Deposit Transaction:");
    deposit.processTransaction();

    System.out.println("\nProcessing Transfer Transaction:");
    transfer.processTransaction();
  }
}
