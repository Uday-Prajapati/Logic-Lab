import java.util.Scanner;
public class UserInterface 
{
	public static void main(String args[]) 
	{
		//Fill the code	
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the name");
			String name = sc.next();
			
			System.out.println("Enter the age");
			int age = sc.nextInt();
			
			System.out.println("Enter the gender");
			String gender = sc.next();
			
			System.out.println("Enter the blood group");
			sc.nextLine();
			String bloodGroup = sc.nextLine();
			
			System.out.println("Enter the phone no");
			long phoneNo = sc.nextLong();
			
			DonorDetails dd = new DonorDetails(name, age, gender, gender, phoneNo);
			System.out.println("Name:" + name);
			System.out.println("Age:"+age);
			System.out.println("Gender:"+gender);
			System.out.println("Blood Group:"+bloodGroup);
			System.out.println("Phone no:"+phoneNo);
		}
		
		
	}
}
