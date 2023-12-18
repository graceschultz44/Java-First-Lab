// Grace Schultz
// 48761302
// Lab 2-Fall 2022

import java.util.Scanner;
public class PlanetaryAge {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	// ask question and take in the answer
	System.out.print("What is your current age? ");
	int currentAge = input.nextInt();

	System.out.println("    Year Sun Orbit Years Age on Earth");

	// create the equations to determine the various ages
	//set as doubles to fit number format
	double mercurySun = currentAge * (1/250.0);
	double mercuryEarth = currentAge * (25/6.0);
	double venusSun = currentAge * (31/3000.0);
	double venusEarth = currentAge * (9677/6000.0);
	double earthSun = currentAge * (1/60.0);
	double earthEarth = currentAge;
	double marsSun = currentAge * (47/1500.0);
	double marsEarth = currentAge * (3191/6000.0);
	double jupiterSun = currentAge * (59/300.0);
	double jupiterEarth = currentAge * (127/1500.0);
	double saturnSun = currentAge * (49/100.0);
	double saturnEarth = currentAge * (17/500.0);
	double uranusSun = currentAge * (7/5.0);
	double uranusEarth = currentAge * (71/6000.0);
	double neptuneSun = currentAge * (41/15.0);
	double neptuneEarth = currentAge * (37/6000.0);
	double plutoSun = currentAge * (1243/300.0);
	double plutoEarth = currentAge * (1/250.0);

	//use printf to format the columns
	//%15.2f inserts in the sun age with 15 spaces and 2 decimal points
	//%12.2f\n inserts in the earth age with 12 spaces, 2 decimal points
	//and inserts a new line
	System.out.printf(" Mercury %15.2f %12.2f\n", mercurySun, mercuryEarth);
	System.out.printf("   Venus %15.2f %12.2f\n", venusSun, venusEarth);
	System.out.printf("   Earth %15.2f %12.2f\n", earthSun, earthEarth);
	System.out.printf("    Mars %15.2f %12.2f\n", marsSun, marsEarth);
	System.out.printf(" Jupiter %15.2f %12.2f\n", jupiterSun, jupiterEarth);
	System.out.printf("  Saturn %15.2f %12.2f\n", saturnSun, saturnEarth);
	System.out.printf("  Uranus %15.2f %12.2f\n", uranusSun, uranusEarth);
	System.out.printf(" Neptune %15.2f %12.2f\n", neptuneSun, neptuneEarth);
	System.out.printf("   Pluto %15.2f %12.2f\n", plutoSun, plutoEarth);
}
}