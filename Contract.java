// Grace Schultz
// 48761302
// Lab 2-Fall 2022

import java.util.Scanner;
public class Contract {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	//ask questions and gather the answers using input.nextDouble();
	System.out.print("Enter contract hourly rate: ");
	double hourlyRate = input.nextDouble();

	System.out.print("Enter cost of health insurance/month: ");
	double insuranceCost = input.nextDouble();

	System.out.print("Enter total holidays per year: ");
	double totalHolidays = input.nextDouble();

	System.out.print("Enter total vacation days per year: ");
	double totalVacation = input.nextDouble(); 

	//calculate all of the formulas so that they can be used in the prints
	double grossIncome = 52 * 5 * 8 * hourlyRate;
	double incomeTax = grossIncome * 0.22;
	double employmentTax = grossIncome * 0.15;
	double unpaidHolidays = totalHolidays * (hourlyRate * 8);
	double unpaidVacation = totalVacation * (hourlyRate * 8);
	double healthInsurance = insuranceCost * 12;
	double netIncome = grossIncome - (incomeTax + employmentTax + unpaidHolidays + unpaidVacation + healthInsurance);

	//use printf to format the spacing and numbers
	//"," adds to the larger numbers that require a ","
	//.2f specifies that their should be 2 decimal points
	//\n returns to the next line
	System.out.printf("        Gross contract income  $ %,.2f\n", grossIncome);

	System.out.printf("             Income tax (%s)  $  %,.2f\n", "22%", incomeTax);

	System.out.printf("    Self employment tax (%s)  $  %,.2f\n", "15%", employmentTax);

	System.out.printf("              Unpaid holidays  $   %,.2f\n", unpaidHolidays);

	System.out.printf("              Unpaid vacation  $   %,.2f\n", unpaidVacation);

	System.out.printf("      Annual health insurance  $  %,.2f\n", healthInsurance);

	System.out.printf("          Net contract income  $  %,.2f\n", netIncome);
	}
}