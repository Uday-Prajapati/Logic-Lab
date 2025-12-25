//4.Count frequency of each letter (a–z)
//	Task: Given a string, count how many times each letter a–z appears (Assume all characters are lowercase; skip non-letters). Print letters with non-zero counts.
//	Example Input: "bab!!" (Assume all letters in String are lowercase.)
//	Expected Output: b:2, a:1

import java.util.Scanner;
public class LetterFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		int[] freq = new int[26];
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				freq[ch - 'a']++; // important line 
			}
		}
		
		// print the string
		for(int i = 0; i<26; i++) {
			if(freq[i] > 0) {
				System.out.println((char)(i+'a') + ":" + freq[i] + " ");
			}
		}
	}
}
