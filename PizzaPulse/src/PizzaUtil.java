public class PizzaUtil {

	public boolean validateOrderId(String orderId) throws InvalidPizzaOrderException {
		if(orderId.matches("PZ-\\d{3}")) {
			return true;
		}else {
			throw new InvalidPizzaOrderException("The order ID " + orderId + " is invalid");
		}
	}
	
	public boolean validatePizzaType(String pizzaType) throws InvalidPizzaOrderException {
		if(pizzaType.equals("Margherita") ||
				   pizzaType.equals("Pepperoni") ||
				   pizzaType.equals("Veggie") ||
				   pizzaType.equals("BBQ Chicken")) {
				    return true;
		}else {
			throw new InvalidPizzaOrderException("The pizza type " + pizzaType + " is invalid");
		}
	}
	
	public boolean validateQuantity(int quantity) throws InvalidPizzaOrderException {
		boolean flag = false;
		
		if(quantity > 0 && quantity <= 50) {
			flag = true;
		}else {
			throw new InvalidPizzaOrderException("The quantity " + quantity + " is invalid"); 
		}
		return flag;
	}	
	public double calculateFinalBill(String pizzaType, double basePrice, int quantity) throws InvalidPizzaOrderException {
		// formula: finalBill = baseCost + toppingCharge + deliveryFee
		if(basePrice<200) {
			throw new InvalidPizzaOrderException("Invalid base price for " + pizzaType);
		}
		
		double toppingPercent = 0;
		
		if(pizzaType.equals("Margherita")) {
			toppingPercent = 10;
		}
		else if(pizzaType.equals("Pepperoni")) {
			toppingPercent = 20;
		}
		else if(pizzaType.equals("Veggie")) {
			toppingPercent = 15;
		}
		else if(pizzaType.equals("BBQ Chicken")) {
			toppingPercent = 25;
		}
		double baseCost = basePrice * quantity;
		double toppingCharge = (baseCost * toppingPercent) / 100;
		double deliveryFee = 100;
		
		return baseCost + toppingCharge + deliveryFee;

	}		
}
	
