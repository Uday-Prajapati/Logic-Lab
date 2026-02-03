import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ByteCafeUtil util = new ByteCafeUtil();

        try {
            System.out.println("Enter beverage order details");
            String input = sc.nextLine();

            String[] data = input.split(":");

            String orderCode = data[0];
            String beverageType = data[1];
            double basePrice = Double.parseDouble(data[2]);
            int qty = Integer.parseInt(data[3]);

            util.validateOrderCode(orderCode);
            util.validateBeverageType(beverageType);
            util.validateQuantity(qty);

            double total = util.calculateBill(beverageType, basePrice, qty);

            System.out.println(
                "Total bill for " + beverageType + " beverages: " + total
            );

        } catch (InvalidBeverageOrderException e) {
            System.out.println(e.getMessage());
        }
    }
}
