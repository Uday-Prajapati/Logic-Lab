import java.util.HashSet;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ClassHouseFormation chf = new ClassHouseFormation();
		// Write code here
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		sc.nextLine();
		
		if(n<=0) {
			System.out.println("Invalid input");
		}else {
			System.out.println("Enter the details");
			
			for(int i=0; i<n; i++) {
				String details = sc.nextLine();
				chf.addName(details);
			}
		}
		
		// for teams and display
		HashSet<String> output = chf.formTeam();
		for(String s : output) {
			System.out.println(s);
		}
	
	}
}