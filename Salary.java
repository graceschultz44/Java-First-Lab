// Grace Schultz
// 48761302
// Lab 2-Fall 2022

import java.util.Scanner;
public class Salary {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	// ask questions and take in answers
	System.out.printf("Enter annual salary: ");
	double annualSalary = input.nextDouble();

	System.out.printf("Enter income tax rate: ");
	double taxRate = input.nextDouble();

	// create equations 
	double incomeTax = (annualSalary * (taxRate / 100.0));
	double fica = (annualSalary * (7.5 / 100.0));
	double netIncome = (annualSalary - (incomeTax + fica));

	// use printf to print a $, ",", 2 decimals, and a new line
	System.out.printf("  Income tax $ %,.2f\n", incomeTax);
	System.out.printf(" FICA (%s) $  %,.2f\n","7.5%", fica);
	System.out.printf("  Net income $ %,.2f\n", netIncome);
}
}