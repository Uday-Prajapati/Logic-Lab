//3: Online Shopping – Find Total Bill
//
//Scenario:
//An e-commerce website stores prices of items added to a cart in an array.
//
//Task:
//Store item prices in an array
//Calculate total bill amount
//Display total
//
//Concepts Tested:
//Array traversal, sum calculation

public class OnlineShopping {

    public static void main(String[] args) {

        int[] priceOfItem = {100, 200, 300, 400};
        int sum = 0;

        for (int i = 0; i < priceOfItem.length; i++) {
            sum = sum + priceOfItem[i];
        }
        
        double avg = (double) sum / priceOfItem.length;
        
//        for(int price : priceOfItem) {
//            sum += price;
//        }
        System.out.println("Average is: " + avg);
        System.out.println("Total Bill is: " + sum);
    }
}

