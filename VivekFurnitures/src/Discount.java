public class Discount {
	
	public double calculateDiscount(Bero bObj) {
		// Fill the code
		double discount = 0;
		
		if(bObj instanceof SteelBero) {
			discount = bObj.getPrice() * 0.10;
		}
		else if(bObj instanceof WoodenBero) {
			discount = bObj.getPrice() * 0.15;
		}
		
		return discount;
		
	}
}
