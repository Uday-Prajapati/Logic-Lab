import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UserInterface {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	    //FILL THE CODE
		
		System.out.println("Enter the Manufacturing Date");
		String date = sc.nextLine();
		
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		f.setLenient(false);
		
		Date d;
		try {
			d = f.parse(date);
		}catch(Exception e){
			System.out.println(date + " is not a valid date");
			return;
		}
		
		System.out.println("Enter the Month");
		int month = sc.nextInt();
		
		// Use Calendar to add months
		Calendar c = Calendar.getInstance();
		c.setTime(d); 
		c.add(Calendar.MONTH, month);
		
		// Convert Calendar to Date using getTime     
		Date expiryDate = c.getTime();
		String result = f.format(expiryDate);
		
		System.out.println(result + " is the expiry date");
	}
}
