import java.util.Scanner;
public class UserInterface
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Fill code here 
		System.out.println("Enter Alex points");
		int alexPoint = sc.nextInt();
		if(alexPoint < 0 || alexPoint > 50) {
			System.out.println(alexPoint+ " is an invalid number");
			return;
		}
		
		System.out.println("Enter Nikil points");
		int nikilPoint = sc.nextInt();
		if(nikilPoint < 0 || nikilPoint > 50) {
			System.out.println(nikilPoint + " is an invalid number");
			return;
		}
		
		System.out.println("Enter Sam points");
		int samPoint = sc.nextInt();
		if(samPoint < 0 || samPoint > 50) {
			System.out.println(samPoint + " is an invalid number");
			return;
		}
        
		// tie logic
		if(alexPoint == nikilPoint || nikilPoint == samPoint || alexPoint == samPoint) {
			System.out.println("The game is a tie");
			return;
		}
		
		// winner
		if(alexPoint > nikilPoint && alexPoint > samPoint) {
			System.out.println("Alex scored " + alexPoint + " points and won the game");
		}
		else if(nikilPoint > alexPoint && nikilPoint > samPoint) {
			System.out.println("Nikil scored " + nikilPoint + " points and won the game");
		}
		else {
			System.out.println("Sam scored " + samPoint + " points and won the game");
		}
    }
}
