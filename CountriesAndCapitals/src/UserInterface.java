import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		// Write code here
		Scanner sc=new Scanner(System.in);
		Country c = new Country();
		
		while(true) {
			System.out.println("1.Add");
			System.out.println("2.Search");
			System.out.println("3.Exit");
			
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 1) {
				System.out.println("Enter the country name");
				String countryName = sc.nextLine();
				
				System.out.println("Enter the capital name");
				String capitalName = sc.nextLine();
				
				c.add(countryName, capitalName);
			}
			
			else if(choice == 2) {
				if(c.getCountryMap().isEmpty()) {
					System.out.println("The map is empty");
					
				}else {
					System.out.println("Enter the country name");
					String countryName = sc.nextLine();
					System.out.println(c.search(countryName));
				}	
			}
			else if(choice == 3) {
				System.out.println("Thank you for using the application");
				break;
			}
		}
		
	}
}
