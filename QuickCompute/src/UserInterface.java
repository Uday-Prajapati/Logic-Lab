 import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		// code here
		Scanner sc=new Scanner(System.in);
		NumAvg na = new NumAvg();
		
		while(true) {
			System.out.println("1.Add number");
			System.out.println("2.Find average");
			System.out.println("3.Exit");
			
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 1) {
				System.out.println("Enter the number");
				int number = sc.nextInt();
				sc.nextLine();
				// add the number
				na.addNum(number);
			}
			else if(choice == 2) {
				if(na.getNumSet().isEmpty()) {
					System.out.println("The set is empty");
				}
				else {
					System.out.println(na.calAvg());
				}
			}
			else if(choice == 3) {
				System.out.println("Thank you for using the application");
				break;
			}
		}
	}
}
