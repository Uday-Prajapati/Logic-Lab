import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PizzaUtil util = new PizzaUtil();
		
		try {
			System.out.println("Enter pizza order details");
			String details = sc.nextLine();
			
			String[] data = details.split(":");
			
			String orderId = data[0];
			util.validateOrderId(orderId);
			
			String pizzaType = data[1];
			util.validatePizzaType(pizzaType);
			
			double basePrice = Double.parseDouble(data[2]);
			int quantity = Integer.parseInt(data[3]);
			util.validateQuantity(quantity);
			
			double finalBill = util.calculateFinalBill(pizzaType, basePrice, quantity);
			
			System.out.println("Total bill for " + pizzaType + " pizzas: " + finalBill);
			
		}catch(InvalidPizzaOrderException e) {
			System.out.println(e.getMessage());
		}
	}
}
