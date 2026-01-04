import java.util.Scanner;
public class UserInterface {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);   
        
        System.out.println("Enter the length of the room(in m)");
        int length = sc.nextInt();
        if(length <= 0) {
        	System.out.println("Invalid length");
        	return;
        }
        
        System.out.println("Enter the breadth of the room(in m)");
        int breadth = sc.nextInt();
        if(breadth <= 0) {
        	System.out.println("Invalid breadth");
        	return;
        }
        
        System.out.println("Enter the plant area of a single plant(in cm2)");
        int plantArea = sc.nextInt();
        if(plantArea <= 0) {
        	System.out.println("Invalid plant area");
        	return;
        }
        
        // floor area in m2
        int floorArea = length * breadth;
        
        // total plants
        double totalPlantArea = (floorArea * 100*100) / plantArea;
        
        // round off
        int totalPlants = ((int) totalPlantArea / 10) * 10;
        
        // total oxygen
        double totalOxygen = totalPlants * 0.9;
        
        System.out.println("Total number of plants is " + totalPlants);
        System.out.printf("Total oxygen production is %.2f litres%n", totalOxygen);
    }
}
