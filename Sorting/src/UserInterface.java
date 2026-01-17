import java.util.*;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the products count");
        int count = sc.nextInt();

        if (count <= 0) {
            System.out.println("Invalid count");
            return;
        }

        List<Product> productList = new ArrayList<>();

        System.out.println("Enter Product details");
        sc.nextLine(); // consume newline

        for (int i = 0; i < count; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(":");

            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            double price = Double.parseDouble(parts[2]);

            Product p = new Product(id, name, price);
            productList.add(p);
        }

        System.out.println("1.Sort By Id");
        System.out.println("2.Sort By Price");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();

        if (choice == 1) {
            Collections.sort(productList, new SortById());
            System.out.println("After Sorting By Id");
            for (Product p : productList) {
                System.out.println(p);
            }
        } 
        else if (choice == 2) {
            Collections.sort(productList, new SortByPrice());
            System.out.println("After Sorting By Price");
            for (Product p : productList) {
                System.out.println(p);
            }
        } 
        else {
            System.out.println("Invalid choice");
        }
    }
}
