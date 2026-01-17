package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionQuestions {
	
	public static void checkStringAgainstRE(String re, String str) {
		Pattern pattern = Pattern.compile(re);
		Matcher matcher = pattern.matcher(str);
		boolean matches = matcher.matches();
		System.out.println(matches);
	}

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("Enter regular expression");
			Scanner sc = new Scanner(System.in);
			String re = sc.nextLine();
			
			System.out.println("Enter your string");
			String str = sc.nextLine();
			
			checkStringAgainstRE(re, str);
			
			System.out.println("Want to exit [Y/N]");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("Y")) {
				System.out.println("Thanks");
				break;
			}
		}
	}
}

// expression
//1. [a-zA-Z] - only one time aplhabet between a and z and A and Z
//2. [a-zA-Z]+ - ek ya ek se zada bar ayega a ya z or A ya Z
//3. [a-zA-Z]+ - zero ya ek se zada bar ayega a ya z or A ya Z

// 1. Create RE that accept aplhanumeric character only - [a-zA-Z0-9]+
// 2. Create RE that accept 10 digit number only - [0-9]{10}
// 3. Create RE expression tomatch email address
//  - ^[a-zA-Z0-9_.$%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$

// 4.Write a RE for matching username that contain numbers, letters and @,$ only.
// ^[a-zA-Z0-9@$]+$