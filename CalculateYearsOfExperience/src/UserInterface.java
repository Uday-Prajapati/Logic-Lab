import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class UserInterface {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	    //FILL THE CODE
		System.out.println("Enter the date of joining");
		String joiningDate = sc.nextLine();
		
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		f.setLenient(false);
		
		// Create two Date objects
		// difference between these two dates in milliseconds as
		Date d1 = null;
		Date d2 = null;
		
		
		try {
			d1 = f.parse(joiningDate);
			d2 = f.parse("15/12/2020");
		}catch(Exception e) {
			return;
		}
		
		// calculate diff
		long diff =  d2.getTime() - d1.getTime();
		
//		difference between these two dates in milliseconds as
		long years = diff / (1000L * 60 * 60 * 24 * 365);
		
		System.out.println(years + " years of experience");
	
	}

}
