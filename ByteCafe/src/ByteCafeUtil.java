public class ByteCafeUtil {

    public boolean validateOrderCode(String orderCode) throws InvalidBeverageOrderException {
        if (orderCode.matches("BC-\\d{4}")) {
            return true;
        } else {
            throw new InvalidBeverageOrderException(
                "The order code " + orderCode + " is invalid"
            );
        }
    }

    public boolean validateBeverageType(String beverageType) throws InvalidBeverageOrderException {
        if (beverageType.equals("Espresso") ||
            beverageType.equals("Latte") ||
            beverageType.equals("Cappuccino") ||
            beverageType.equals("Mocha")) {
            return true;
        } else {
            throw new InvalidBeverageOrderException(
                "The beverage type " + beverageType + " is invalid"
            );
        }
    }

    public boolean validateQuantity(int qty) throws InvalidBeverageOrderException {
        if (qty >= 1 && qty <= 30) {
            return true;
        } else {
            throw new InvalidBeverageOrderException(
                "The quantity " + qty + " is invalid"
            );
        }
    }

    public double calculateBill(String beverageType, double basePrice, int qty)
            throws InvalidBeverageOrderException {

        if (basePrice < 100) {
            throw new InvalidBeverageOrderException(
                "Invalid base price for " + beverageType
            );
        }

        double addonPercent = 0;

        if (beverageType.equals("Espresso")) {
            addonPercent = 5;
        } else if (beverageType.equals("Latte")) {
            addonPercent = 12;
        } else if (beverageType.equals("Cappuccino")) {
            addonPercent = 10;
        } else if (beverageType.equals("Mocha")) {
            addonPercent = 15;
        }

        double base = basePrice * qty;
        double addon = (base * addonPercent) / 100;
        double serviceFee = 60;

        return base + addon + serviceFee;
    }
}
