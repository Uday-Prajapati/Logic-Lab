import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		
		System.out.println("Enter the day");
		int day = sc.nextInt();
		
		// validation
		if(day <= 0 || day > 30) {
			System.out.println(day + " is invalid day");
			return;
		}
		
		// pell series
		int p0 = 1, p1 = 2, p2 = 0;
		
		if(day == 1) {
			p2 = p0;
		}
		else if(day == 2) {
			p2 = p1;
		}
		else {
			for(int i = 3; i<=day; i++) {
				p2 = 2 * p1 + p0;
				p0 = p1;
				p1 = p2;
			}
		}
		System.out.println("Number of eggs in " + day + "th day is " + p2);
	}
}
