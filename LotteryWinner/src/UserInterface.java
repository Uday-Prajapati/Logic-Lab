import java.util.Scanner;
public class UserInterface 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Fill code here 
		
		System.out.println("Enter the ticket Id");
		String ticketId = sc.next();
		
		System.out.println("Enter the unlucky code");
		char unluckyCode = sc.next().charAt(0);
		
		int count = 0;
		
		// check each character
		for(int i = 0; i<ticketId.length(); i++) {
			if(ticketId.charAt(i) == unluckyCode) {
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println(ticketId + " is lucky ticket");
		}
		else if(count < 3) {
			System.out.println(ticketId + " is partially lucky");
		}
		else {
			System.out.println(ticketId + " is unlucky ticket");
		}
	}
}