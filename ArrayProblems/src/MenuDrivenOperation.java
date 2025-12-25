//Scenario 10: Menu-Driven Array Operations ⭐ (VERY IMPORTANT)
//
//Scenario:
//Create a menu-driven program to perform operations on an array.
//
//Menu:
//Insert element
//Delete element
//Display array
//Exit
//
//Concepts Tested:
// do while, switch, arrays, loops

import java.util.Scanner;

public class MenuDrivenOperation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
        int choice;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Insert element");
            System.out.println("2. Delete element");
            System.out.println("3. Display array");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1: // INSERT
                    System.out.print("Enter index to insert: ");
                    int insertIndex = sc.nextInt();
                    System.out.print("Enter element to insert: ");
                    int element = sc.nextInt();

                    if (insertIndex < 0 || insertIndex > arr.length) {
                        System.out.println("Invalid index");
                        break;
                    }

                    int[] newArr = new int[arr.length + 1];

                    for (int i = 0; i < insertIndex; i++) {
                        newArr[i] = arr[i];
                    }

                    newArr[insertIndex] = element;

                    for (int i = insertIndex; i < arr.length; i++) {
                        newArr[i + 1] = arr[i];
                    }

                    arr = newArr;
                    System.out.println("Element inserted successfully");
                    break;

                case 2: // DELETE
                    System.out.print("Enter index to delete: ");
                    int deleteIndex = sc.nextInt();

                    if (deleteIndex < 0 || deleteIndex >= arr.length) {
                        System.out.println("Invalid index");
                        break;
                    }

                    int[] delArr = new int[arr.length - 1];
                    int j = 0;

                    for (int i = 0; i < arr.length; i++) {
                        if (i == deleteIndex)
                            continue;
                        delArr[j] = arr[i];
                        j++;
                    }

                    arr = delArr;
                    System.out.println("Element deleted successfully");
                    break;

                case 3: // DISPLAY
                    System.out.println("Array elements:");
                    for (int num : arr) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;

                case 4: // EXIT
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
