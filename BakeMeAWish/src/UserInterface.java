import java.util.Map;
import java.util.Scanner;


public class UserInterface{
    public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   
	   // Object
	   CakeOrder co = new CakeOrder();

	   // no of orders
	   System.out.println("Enter number of cake orders to be added");
	   int noOfCake = sc.nextInt();
	   sc.nextLine();
	   
	   if(noOfCake<=0) {
		   System.out.println("No cake orders found");
		   return;
	   }
	   
	   // order details
	   System.out.println("Enter the cake order details (Order Id: CakeCost)");
	   
	   for(int i=0; i<noOfCake;i++) {
		   String details = sc.nextLine();
		   
		   String[] data = details.split(":");
		   String orderId = data[0];
		   double orderCost = Double.parseDouble(data[1]);
		   
		   co.addOrderDetails(orderId, orderCost);
		   
	   }
	   
	   // cost for filtering
	   System.out.println("Enter the cost to search the cake orders");
	   double cost = sc.nextDouble();
	   
       // Call method to filter orders above given cost
	   Map<String,Double> result = co.findOrdersAboveSpecifiedCost(cost);
	   
	   if(result.isEmpty()) {
		   System.out.println("No cake orders found");
	   }
	   else {
		   System.out.println("Cake Orders above the specified cost");
		   
		   // traverse the map
		   for(Map.Entry<String, Double> entry : result.entrySet()) {
			   System.out.println("Order ID: " + entry.getKey() + ", Cake Cost " + entry.getValue());
		   }
	   }

	}
}