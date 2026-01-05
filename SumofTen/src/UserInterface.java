import java.util.Scanner;
public class UserInterface {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Fill code here 
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
				
		if(num < 0) {
			System.out.println(num + " is a negative number");
		}else {
			
			// add 10 to num
			int sum = 0;
			
			for(int i = 0; i< 10; i++) {
				sum = sum + (num+i);
			}
			
			System.out.println("The sum of ten numbers is " + sum);
		}
	}
}
