import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		
		System.out.println("Enter the sides");
		int sides = sc.nextInt();
		
		// circle
		if(sides == 0) {
//			System.out.println("it is circle");
			System.out.println("Enter the radius");
			double radius = sc.nextDouble();
			double area = 3.14 * radius * radius;
			System.out.printf("Area of the Circle is %.2f", area);
		}
		// triangle
		else if(sides == 3) {
			System.out.println("Enter the base and height");
			double base = sc.nextDouble();
			double height = sc.nextDouble();
			
			double area = (base * height)/2;
			System.out.printf("Area of the Triangle is %.2f", area);
		}
		
		// rectangle / square
		else if(sides == 4) {
			System.out.println("Enter the length");
			double length = sc.nextDouble();
			System.out.println("Enter the breadth");
			double breadth = sc.nextDouble();
			
			if(length == breadth) {
//				System.out.println("it is square");
				double area = length * length;
				System.out.printf("Area of the Square is %.2f", area);
			}
			else if(length != breadth) {
//				System.out.println("it is a rectangle");
				double area = length * breadth;
				System.out.printf("Area of the Rectangle is %.2f", area);
			}
		}
		else {
			System.out.println("Invalid side");
		}
	}
}
