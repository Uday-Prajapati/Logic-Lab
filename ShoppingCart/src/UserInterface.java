import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Products p = new Products();
		// code here
		int choice;
		
		while(true) {
			System.out.println("1.Add");
			System.out.println("2.Display");
			System.out.println("3.Exit");
			
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 1) {
				System.out.println("Enter the product");
				String productName = sc.nextLine();
				p.addProductToList(productName);
			}
			else if(choice == 2) {
				if(p.getProductList().isEmpty()) {
					System.out.println("The list is empty");
				}else {
					p.sortProductList();
					for(String product : p.getProductList()) {
						System.out.println(product);
					}
				}
			}
			else if(choice == 3) {
				System.out.println("Thank you for using the application");
				break;
			}
		}
		
	}
}
