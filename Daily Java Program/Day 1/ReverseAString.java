//1.Reverse a String
//	Task: Print the reverse of a given string.
//	Example Input: "Mumbai"
//	Expected Output: "iabmuM"


import java.util.Scanner;
public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string character: ");
		String str = sc.nextLine();
		
		String reverse = ""; // storing the value in this empty string
		
		for(int i = str.length()-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.print("Reversed String: " + reverse);
	}

}
