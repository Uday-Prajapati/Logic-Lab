import java.util.Scanner;
public class UserInterface 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Fill code here 
		// customer name
		System.out.println("Enter the name");
		String name = sc.next();
		
		// // room no
		System.out.println("Enter the number of rooms you needed");
		int roomNo = sc.nextInt();
		
		// validation
		while(roomNo <= 0) {
			System.out.println("Please enter a valid number");
			roomNo = sc.nextInt();
		}
		
		// phone number
		System.out.println("Enter the phone number");
		long phoneNo = sc.nextLong();
		
		// calculate rent
		int rent = roomNo*500;
		System.out.println("Pay Rs. " + rent+ " for booking");
		System.out.println("Your booking has been confirmed");
	}
}