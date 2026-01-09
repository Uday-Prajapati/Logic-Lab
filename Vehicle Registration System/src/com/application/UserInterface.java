package com.application;
import java.util.*;
 
public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleRegistry registry = new VehicleRegistry();
 
        System.out.println("Welcome to Vehicle Registration System");
 
        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("1. Add Vehicle Details");
            System.out.println("2. Update Registration Fee");
            System.out.println("3. Remove Vehicle");
            System.out.println("4. Search Vehicles by Partial Registration Number");
            System.out.println("5. Calculate Total Fee in a Given Range");
            System.out.println("6. Exit\n");
            System.out.print("Enter your choice: ");
 
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
 
            switch (choice) {
                case 1:
                    System.out.print("Enter Registration Number: ");
                    String regNum = sc.nextLine();
                    System.out.print("Enter Registration Fee: ");
                    double fee = sc.nextDouble();
                    registry.addVehicleDetails(regNum, fee);
                    break;
 
                case 2:
                    System.out.print("Enter Registration Number to update fee: ");
                    String updateRegNum = sc.nextLine();
                    System.out.print("Enter new Registration Fee: ");
                    double newFee = sc.nextDouble();
                    if (registry.updateRegistrationFee(updateRegNum, newFee)) {
                        System.out.println("Registration fee updated successfully.");
                    } else {
                        System.out.println("Registration number not found. Fee update failed.");
                    }
                    break;
 
                case 3:
                    System.out.print("Enter Registration Number to remove: ");
                    String removeRegNum = sc.nextLine();
                    if (registry.removeVehicle(removeRegNum)) {
                        System.out.println("Vehicle removed successfully.");
                    } else {
                        System.out.println("Vehicle not found. Remove failed.");
                    }
                    break;
 
                case 4:
                    System.out.print("Enter partial registration number to search: ");
                    String partial = sc.nextLine();
                    List<String> results = registry.searchVehiclesByPartialNumber(partial);
                    if (results.isEmpty()) {
                        System.out.println("No vehicles found matching '" + partial + "'.");
                    } else {
                        System.out.println("Vehicles matching '" + partial + "': " + String.join(", ", results));
                    }
                    break;
 
                case 5:
                    System.out.print("Enter minimum fee: ");
                    double minFee = sc.nextDouble();
                    System.out.print("Enter maximum fee: ");
                    double maxFee = sc.nextDouble();
                    double totalFee = registry.findTotalFeeInRange(minFee, maxFee);
                    if (totalFee > 0) {
                        System.out.println("Total Registration Fee in the range " + minFee + " to " + maxFee + " INR: " + totalFee);
                    } else {
                        System.out.println("No vehicles found in this range.");
                    }
                    break;
 
                case 6:
                    System.out.println("Exiting Vehicle Registration System. Goodbye!");
                    sc.close();
                    return;
 
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}