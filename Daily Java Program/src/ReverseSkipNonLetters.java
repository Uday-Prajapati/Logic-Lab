//Reverse a String but skip non-letter characters
//	Task: Reverse only the letters in the string. Non-letters stay in place.
//	Example Input: "a,b$c"
//	Expected Output: "c,b$a"

import java.util.Scanner;
public class ReverseSkipNonLetters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter letter and non letter: ");
		String str = sc.nextLine();
		
		// convert the string to char array
		char[] arr = str.toCharArray();
		
		// two pointer
		int start = 0;
		int end = arr.length - 1;
		
		// while loop to check if both pointer meet
		while(start < end) {
			// check if character is not a letter
			if(!Character.isLetter(arr[start])){
				start++;
			}else if(!Character.isLetter(arr[end])) {
				end--;
			}else {
				// swap
				char temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		System.out.print("Reversed string: " + new String(arr));
	}
}
