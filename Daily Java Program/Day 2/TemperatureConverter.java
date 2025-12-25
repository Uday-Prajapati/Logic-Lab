//1. Temperature Converter
//
//Topic: Variables & Operators
//Task: Convert temperature from Celsius to Fahrenheit and vice versa. Ask the user which conversion they want.
//Example Input:
//Choice: CtoF
//Value: 37
//Expected Output:
//Fahrenheit = 98.6

import java.util.Scanner;
public class TemperatureConverter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// taking choice
		System.out.print("Enter choice (CtoF or FtoC): ");
		String choice = sc.next();
		
		// taking temperature value
		System.out.print("Enter temperature: ");
		double value = sc.nextDouble();
		
		// calculating celsius to fahrenheit
		// formula : f = (c * 9/5) + 32;
		if(choice.equalsIgnoreCase("CtoF")) {
			double fahrenheit = (value * 9/5) + 32;
			System.out.println("Fahrenheit = " + fahrenheit);
		}
		
		// calculating fahrenheit to celsius
		// formula : f = (c * 9/5) + 32;
		else if (choice.equalsIgnoreCase("FtoC")) {
			double celsius = (value * 9/5) + 32;
			System.out.println("Celsius = " + celsius);
		}
		else {
			System.out.println("Invalid Choice");
		}
	}
}
