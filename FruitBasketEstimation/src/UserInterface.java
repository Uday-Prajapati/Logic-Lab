import java.util.Scanner;
import java.util.stream.Stream;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FruitBasketUtility utility = new FruitBasketUtility();

        while (true) {

            System.out.println("Select an option:");
            System.out.println("1.Add Fruit to Basket");
            System.out.println("2.Calculate Bill");
            System.out.println("3.Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter the fruit name");
                    String fruitName = sc.nextLine();

                    System.out.println("Enter weight in Kgs");
                    int weight = sc.nextInt();

                    System.out.println("Enter price per Kg");
                    int price = sc.nextInt();
                    sc.nextLine();
                    
                    // add fruit info to list
                    FruitBasket fb = new FruitBasket(fruitName, weight, price);
                    utility.addToBasket(fb);
                    break;

                case 2:
                	//calculate estimate
                    if (utility.getFruitBasketList().isEmpty()) {
                        System.out.println("Your basket is empty. Please add fruits.");
                    } else {
                        Stream<FruitBasket> stream =
                                utility.getFruitBasketList().stream();

                        int bill = utility.calculateBill(stream);
                        System.out.println("The estimated bill amount is Rs " + bill);
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using the application.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
