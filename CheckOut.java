// Grace Schultz
// 48761302
// Lab 2-Fall 2022

import java.util.Scanner;
public class CheckOut {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	// ask questions and set as doubles
	System.out.print("Enter price: ");
	double price = input.nextDouble();

	System.out.print("Enter quantity: ");
	int quantity = input.nextInt();

	System.out.print("Enter sales tax %: ");
	double salesTax = input.nextDouble();

	// create equations to fill in the blanks
	double subtotal = (price * quantity);
	double taxAmount = (subtotal * (salesTax / 100));
	double total = (subtotal + taxAmount);

	// use printf to format the spaces, decimals, and next line
	System.out.printf("Subtotal:   $%8.2f\n", subtotal);
	System.out.printf("Sales tax:  $%8.2f\n", taxAmount);
	System.out.printf("Total:      $%8.2f\n", total);

	}
}