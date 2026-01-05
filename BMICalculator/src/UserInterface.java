import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args){
		//Fill the code here
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter weight in kg");
		double weight = sc.nextDouble();
		
		System.out.println("Enter height in cm");
		double height = sc.nextDouble();
		
		// formula
		double BMI = weight/ Math.pow(height/100, 2);
		double Reduce = BMI - 25;
		double Gain = 18.5 - BMI;
		
		if(BMI >= 25) {
			System.out.printf("Your BMI is %.2f. You are overweight%n", BMI);
			System.out.printf("Reduce %.2f to be fit", Reduce);
			
		}
		else if(BMI < 25 && BMI >= 18.5) {
			System.out.printf("Your BMI is %.2f. You are fit and healthy", BMI);
		}
		else if(BMI < 18.5) {
			System.out.printf("Your BMI is %.2f. You are underweight%n", BMI);
			System.out.printf("Gain %.2f to be fit", Gain);
		}
	}
}
