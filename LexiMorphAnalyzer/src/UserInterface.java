import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInterface {
	
	public static boolean isValid(String str) {
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(!((ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'))){
				return false;
			}
		}
		return true;
	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input: ");
		String input = sc.nextLine();
		
		// 1. validate
		if(!isValid(input)) {
			System.out.println(input + " is an invalid input");
			return;
		}
		
//		2. normalize
		input = input.toLowerCase();
		
//		3. count frequency
		int[] freq = new int[26];
		for(int i=0; i<input.length(); i++) {
			freq[input.charAt(i) - 'a']++;	
		}
		
		StringBuilder sb = new StringBuilder();
		boolean[] visited = new boolean[26];
		
//		Group A
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			int index = ch - 'a';
			
			if(!visited[index] && freq[index] >= 3) {
				sb.append(ch);
				visited[index] = true;
			}
		}
		
//		Group B
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			int index = ch - 'a';
			
			if(!visited[index] && freq[index] == 2) {
				sb.append(ch);
				visited[index] = true;
			}
		}
		
//		Group C
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			int index = ch - 'a';
			
			if(!visited[index] && freq[index] == 1) {
				sb.append(ch);
				visited[index] = true;
			}
		}
		
//		4. append remaining one
		 boolean[] addedOnce = new boolean[26];
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            int index = ch - 'a';

	            if (addedOnce[index]) {
	                sb.append(ch);
	            } else {
	                addedOnce[index] = true;
	            }
	        }
		
//		5. count that appears twice
		int countTwice = 0;
		for(int i=0; i<26; i++) {
			if(freq[i] == 2) {
				countTwice++;
			}
		}
		
//		6. insert count at 25%
		if(countTwice > 0) {
			int position = (sb.length() * 25) / 100;
			sb.insert(position, countTwice);
		}
		
		System.out.println("Transformed output: " + sb);
	}
}

