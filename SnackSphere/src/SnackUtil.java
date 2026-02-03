public class SnackUtil {
	public boolean validateOrderCode(String orderCode) throws InvalidSnackOrderException {
		if(orderCode.matches("SNK-\\d{4}")) {
			return true;
		}else {
			throw new InvalidSnackOrderException("The order code "+orderCode+" is invalid");
		}
	}
	
	public boolean validateSnackType(String snackType) throws InvalidSnackOrderException {
		if(snackType.equals("NutMix")||
				snackType.equals("ChocoBlast") ||
				snackType.equals("ProteinsBites") ||
				snackType.equals("FruitFusion")) {
			return true;
		}else {
			throw new InvalidSnackOrderException("The snack type "+snackType+" is invalid");
		}
	}
	
	public boolean validateUnits(int units) throws InvalidSnackOrderException{
		if(units >= 1 && units <= 100) {
			return true;
		}else {
			throw new InvalidSnackOrderException("The order unit "+units+" is invalid");
		}
	}
	
	public double calculateTotalCost(String snackType, double basePrice, int units) throws InvalidSnackOrderException{
		if(basePrice < 120) {
			throw new InvalidSnackOrderException("The cost is invalid");
		}
		
		double addonPercent = 0;
		if(snackType.equals("NutMix")) {
			addonPercent = 8;
		}
		else if(snackType.equals("ChocoBlast")){
			addonPercent = 12;
		}
		else if(snackType.equals("ProteinsBites")){
			addonPercent = 15;
		}
		else if(snackType.equals("FruitFusion")){
			addonPercent = 10;
		}
		
		double baseCost = basePrice * units;
		double addonCharge = (baseCost * addonPercent) / 100;
		double shipping = 75;
		
		return baseCost + addonCharge + shipping;
	}
}

