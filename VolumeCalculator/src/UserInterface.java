import java.util.Scanner;
public class UserInterface {
	
	public static void main(String[] arg)
    {
        // Fill the code
		Scanner sc = new Scanner(System.in);
		VolumeCalculator vc = new VolumeCalculator();
		
		while(true) {
			System.out.println("Enter the choice");
			System.out.println("1.Find Volume For Cylinder");
			System.out.println("2.Find Volume For Cuboid");
			
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter the radius");
				double radius = sc.nextDouble();
				
				System.out.println("Enter the height");
				int height = sc.nextInt();
				
				// call method
				double volume = vc.calculateVolume(radius, height);
				System.out.printf("Volume of the Cylinder is %.2f\n", volume);
			
			}
			else if(choice == 2) {
				System.out.println("Enter the length");
				int length = sc.nextInt();
				
				System.out.println("Enter the breadth");
				int breadth = sc.nextInt();
				
				System.out.println("Enter the height");
				int height = sc.nextInt();
				
				// callmethod
				double volume = vc.calculateVolume(length, breadth, height);
				System.out.printf("Volume of the cuboid is %.2f\n", volume);
			}
		}
    }
}

