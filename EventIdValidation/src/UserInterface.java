import java.util.Scanner;
public class UserInterface 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Fill code here 
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		System.out.println("Enter your id");
		String id = sc.nextLine();
		
		String idregex = "^SPC[0-9]{3}(0[1-9]|1[0-2])(AM|PM)$";
		
		if(!id.matches(idregex)) {
			System.out.println(id + " is an Invalid ID");
			return;
		}+
		
		String seatNumber = id.substring(3,6);
		String time = id.substring(6,8);
		String zone = id.substring(8);
		
		// remove leading zero
		int hours = Integer.parseInt(time);
		
		System.out.println("Hi " + name + " your seat number is " + seatNumber +
	            " and the event starts at " + hours + zone);
	}
}