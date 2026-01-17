import java.util.Scanner;

public class UserInterface 
{
	
	public static void main(String args[]) 
	{
	
		Scanner sc =new Scanner(System.in);
		//Fill the code
		System.out.println("Enter the training id");
		String trainingId = sc.nextLine();
		
		if(trainingId.length() != 9) {
			System.out.println(trainingId + " is an invalid training id");
			return;
		}
		
		
		// first 4 digit year
		String year = trainingId.substring(0,4);
		
		if(!year.equals("2021")) {
			System.out.println(year + " is an invalid year");
			return;
		}
		
		// 5th and 6th digit
		String teamCode = trainingId.substring(4,6);
		String team = "";
		
		switch(teamCode) {
		case "01":
			team = "LP";
			break;
			
		case "02":
			team = "TA";
			break;
		
		case "03":
			team = "CT";
			break;
			
		case "04":
			team = "PT";
			break;
			
		case "05":
			team = "TT";
			break;
			
		default:
			System.out.println(teamCode + " is an invalid team code");
			return;
		}
		
		// last 3 digit
		String lastDigit = trainingId.substring(6,9);
		int rollNo = Integer.parseInt(lastDigit);
		
		if( rollNo < 1 || rollNo > 999) {
			System.out.println(lastDigit + " is an invalid roll number");
			return;
		}
		
		// generate id
		String employeeId = "SIET"+team+lastDigit;
		System.out.println("Employee Id: " + employeeId);
	}
}	
