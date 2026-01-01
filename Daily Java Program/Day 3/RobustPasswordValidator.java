import java.util.Scanner;
public class RobustPasswordValidator {
	// condtiono for password
	static boolean isValid(String pwd, String user) {
		// At least one uppercase, lowercase, digit, special (!@#$%^&*). No spaces.
		
		// check length
		if(pwd.length() < 8 || pwd.length() > 20) {
			return false;
		}
		
		// check space if sapce invalid
		if(pwd.contains(" ")) {
			return false;
		}
		
		// Username check make sure password must not have username
		if(pwd.toLowerCase().contains(user.toLowerCase())) {
			return false;
		}
		
		//Check Character
		boolean hasUpper = false,
				hasLower = false,
				hasDigit = false,
				hasSpecial = false;
		
		String special  = "!@#$%^&*";
		
		// use wrapper class to validate
		for(int i=0; i<pwd.length(); i++) {
			char ch = pwd.charAt(i);
			
			if(Character.isUpperCase(ch)) hasUpper = true;
			else if(Character.isLowerCase(ch)) hasLower = true;
			else if(Character.isDigit(ch)) hasDigit = true;
			else if(special.indexOf(ch) != -1) hasSpecial = true;
		}
		return hasUpper && hasLower && hasDigit && hasSpecial;
	}
	
	// this method print why password is invalid
	static void feedback(String pwd, String user) {
		// check length
		if(pwd.length() < 8 || pwd.length() > 20) {
			System.out.println("- Password length must be 8 o 20");
		}
		// check space if sapce invalid
		if(pwd.contains(" ")) {
			System.out.println("- Must not contain space");
		}
		// Username check make sure password must not have username
		if(pwd.toLowerCase().contains(user.toLowerCase())) {
			System.out.println("- Password must not have username");
		}
		
		//Check Character
		boolean hasUpper = false,
				hasLower = false,
				hasDigit = false,
				hasSpecial = false;
		
		String special  = "!@#$%^&*";
				
		// use wrapper class to validate
		for(int i=0; i<pwd.length(); i++) {
			char ch = pwd.charAt(i);
			
			if(Character.isUpperCase(ch)) hasUpper = true;
			else if(Character.isLowerCase(ch)) hasLower = true;
			else if(Character.isDigit(ch)) hasDigit = true;
			else if(special.indexOf(ch) != -1) hasSpecial = true;
			}
		
		if(!hasUpper) {
			System.out.println("- Add at least one Uppercase Letter.");
		}
		
		if(!hasLower) {
			System.out.println("- Add at least one Lowercase Letter.");
		}
		
		if(!hasDigit) {
			System.out.println("- Add at least one Digit.");
		}
		
		if(!hasSpecial) {
			System.out.println("- Add more special character.");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// seperately asking username
		System.out.print("Username: ");
		String username = sc.nextLine();
		
		System.out.print("Password: ");
		String password = sc.nextLine();
		
		if(isValid(password, username)) {
			System.out.println("Valid password");
		}else {
			System.out.println("Invalid password");
			feedback(password, username);
		}
		
	}
}
