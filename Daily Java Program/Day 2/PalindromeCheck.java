//6. Palindrome Checker 
//Topic: Strings & Methods 
//Task: Write a method isPalindrome(String s) that checks if a string is a palindrome. Ignore case. 
//Example Input: "Madam" 
//Expected Output: Palindrome

import java.util.Scanner;
public class PalindromeCheck {
	
	static void isPalindrome(String s) {
		String rev = "";
		
		for(int i = s.length()-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String Character: ");
		String s = sc.nextLine();
		
		isPalindrome(s);
	}
}
