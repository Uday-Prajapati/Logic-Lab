import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		// validation , digit must be of 4
		if(num < 1000 || num > 9999) {
			System.out.println(num + " is an invalid number");
			return;
		}
		
		// reverse
		int temp = num; // storing value of num to temp
		int rev = 0;
		
		while(temp != 0) {
			int digit = temp % 10;
			rev = rev * 10 + digit;
			temp = temp / 10;
		}
		System.out.println("Reversed number is " + rev);
		
		// expand
		int tempRev = rev; // storing rev value into tempRev
		// highest power of 10
		int place = 1;
		while(place <= tempRev / 10) { // extract digit
			place = place * 10;
		}
		
		boolean first = true;
		
		while(place > 0) {
			int digit = tempRev / place; // remove curent place digit
			
			if(digit != 0) {
				if(!first) {
					System.out.print("+"); // plus after unit tens
				}
				System.out.print(digit * place); // expand value
				first = false;
			}
			
			tempRev = tempRev % place;
			place = place / 10;
		}
	}
}
