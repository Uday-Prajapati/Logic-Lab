import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer Name");
        String name = sc.nextLine();

        System.out.println("Enter Phone Number");
        long phoneNo = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter address");
        String address = sc.nextLine();

        // CustomerDetails object 
        CustomerDetails cd = new CustomerDetails(name, phoneNo, address);

        System.out.println("Enter Bero Type");
        String type = sc.nextLine();

        // validation
        if (!type.equals("Steel Bero") && !type.equals("Wooden Bero")) {
            System.out.println(type + " is an invalid bero type");
            return;
        }
        
        // discount object
        Discount discountObj = new Discount();

        if (type.equals("Wooden Bero")) {

            System.out.println("Enter Bero Colour");
            String colour = sc.nextLine();

            System.out.println("Enter Wood Type");
            String woodType = sc.nextLine();

            WoodenBero wb = new WoodenBero(type, colour, woodType);
            wb.calculatePrice();

            double discount = discountObj.calculateDiscount(wb);
            double totalPrice = wb.getPrice() - discount;

            System.out.printf("Amount needs to be paid %.2f", totalPrice);
        }

        else if (type.equals("Steel Bero")) {

            System.out.println("Enter Bero Colour");
            String colour = sc.nextLine();

            System.out.println("Enter Bero Height");
            int height = sc.nextInt();

            SteelBero sb = new SteelBero(type, colour, height);
            sb.calculatePrice();

            double discount = discountObj.calculateDiscount(sb);
            double totalPrice = sb.getPrice() - discount;

            System.out.printf("Amount needs to be paid %.2f", totalPrice);
        }
    }
}
