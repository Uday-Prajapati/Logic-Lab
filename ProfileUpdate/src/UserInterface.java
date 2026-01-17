import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserInterface 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Fill code here 
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		// pan card
		System.out.println("Enter your PAN number");
		String panNo = sc.nextLine();
		
		String panRegex = "^[A-Z]{5}[0-9]{4}[A-Z]$";
		
		if(!panNo.matches(panRegex) ) {
			System.out.println(panNo + " is an invalid PAN number");
			return;
		}
		
		// email id
		System.out.println("Enter your E-mail ID");
		String emailId = sc.nextLine();
		
		String emailRegex = "^[a-z]{5,10}@digitec\\.com$";
		
		if(!emailId.matches(emailRegex)) {
			System.out.println("Invalid E-mail ID");
			return;
		}
		
		System.out.println("Profile of " + name + " updated successfully");
	}
}