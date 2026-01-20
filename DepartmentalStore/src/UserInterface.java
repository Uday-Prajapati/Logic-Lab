import java.util.Scanner;

public class UserInterface {

		public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// Fill the code
		
		System.out.println("Enter the customer name");
		String name = sc.next();
		sc.nextLine();
		
		System.out.println("Enter the phone number");
		String phoneNo = sc.nextLine();
		
		System.out.println("Enter the street name");
		String streetName = sc.nextLine();
		
		System.out.println("Enter the bill amount");
		double billAmt = sc.nextDouble();
		
		System.out.println("Enter the distance");
		int distance = sc.nextInt();
		
		CustomerDetails cd = new CustomerDetails(name, phoneNo, streetName, billAmt, distance);
		
		// call method
		double bonusPoints = cd.calculateBonusPoints();
		double deliveryCharges = cd.deliveryCharge();
		// print
		System.out.println("Customer name: " + name);
		System.out.println("Phone number: " + phoneNo);
		System.out.println("Street name: " + streetName);
		System.out.println("Bonus points: " + bonusPoints);
		System.out.println("Delivery charge: " + deliveryCharges);
		
	}
}
