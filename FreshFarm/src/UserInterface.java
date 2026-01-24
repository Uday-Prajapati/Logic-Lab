import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class UserInterface {
	public static void main(String [] args)
	{	
		//FILL THE CODE HERE
		Scanner sc=new Scanner(System.in);
		
		CartonUtility cu = new CartonUtility();
		
		List<Carton> list = new ArrayList<>();
		
		System.out.println("Enter the number of cartons");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num<=0) {
			System.out.println("Invalid");
			return;
		}else {
			System.out.println("Enter carton details");
			
			for(int i=0; i<num; i++) {
				String details = sc.nextLine();
				String[] parts = details.split("/");
				
				String name = parts[0];
				int quantity = Integer.parseInt(parts[1]);
				double cost = Double.parseDouble(parts[2]);
				
				if(quantity <= 0) {
					System.out.println("Quantity number should be a valid number");
					return;
				}
				
				// store the details
				Carton c = new Carton();
				c.setProductName(name);
				c.setQuantity(quantity);
				c.setProductCost(cost);
				
				list.add(c);
			}
			
			cu.setCartonList(list);

	        Carton maxCarton = cu.findMax(cu.convertToStream());

	        System.out.println(
	                maxCarton.getProductName() +
	                " had the highest quantity with " +
	                maxCarton.getQuantity() +
	                " nos"
	        );
		}
	}
}
