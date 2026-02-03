import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SnackUtil util = new SnackUtil();
		
		try {
			System.out.println("Enter snack order details");
			String input = sc.nextLine();
			
			String[] data = input.split(":");
			
			String orderCode = data[0];
			util.validateOrderCode(orderCode);
			
			String snackType = data[1];
			util.validateSnackType(snackType);
			
			double basePrice = Double.parseDouble(data[2]);
			int unit = Integer.parseInt(data[3]);
			util.validateUnits(unit);
			
			double totalCost = util.calculateTotalCost(snackType, basePrice, unit);
			
			System.out.println("Tital cost for " + snackType+ " boxes:" + totalCost);
			
		}
		catch(InvalidSnackOrderException e) {
			System.out.println(e.getMessage());
		}
	}
}
