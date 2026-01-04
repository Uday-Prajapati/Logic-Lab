import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String res = (a == b && b == c) 
				? "All numbers are equal"
				: "The smallest number is " +
				((a<=b && a<=c) ? a : (b<=c ? b : c));
		System.out.println(res);
		
	}
}
