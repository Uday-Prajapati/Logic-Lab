import java.util.Scanner;

class FishingCompetiton{
	private String name;
	private int age;
	private int bigFish;
	private int mediumFish;
	private int smallFish;
	
	public void setDetails(String input) {
		String[] data = input.split(":");
		
		name = data[0];
		age = Integer.parseInt(data[1]);
		bigFish = Integer.parseInt(data[2]);
		mediumFish = Integer.parseInt(data[3]);
		smallFish = Integer.parseInt(data[4]);
	}
	
	public void calculateCount(){
		if(age < 18) {
			System.out.println(age + " is an invalid age");
			return;
		}
		
		if(bigFish < 0) {
			System.out.println(bigFish + " is an invalid input");
			return;
		}
		
		if(mediumFish < 0) {
			System.out.println(mediumFish + " is an invalid input");
			return;
		}
		
		if(smallFish < 0) {
			System.out.println(smallFish + " is an invalid input");
			return;
		}
		
		int bigFishTotal = bigFish * 10;
		int mediumFishTotal = mediumFish * 6;
		int smallFishTotal = smallFish * 3;
		
		int totalPoints = bigFishTotal + mediumFishTotal + smallFishTotal;
		
		System.out.println(name + " scored " + totalPoints + " points");
	}
}

public class UserInterface{
	public static void main(String args[]) 
	{
		Scanner sc =new Scanner(System.in);
		//Fill the code
		System.out.println("Enter the details");
		String input = sc.nextLine();
		
		
		FishingCompetiton fc = new FishingCompetiton();
		
		fc.setDetails(input);
		fc.calculateCount();
		
	}
}
		
