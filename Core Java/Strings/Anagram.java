import java.util.Arrays;

public class Anagram {

	static void CheckAnagram(String s1,  String s2) {
		
		// compare length
		if(s1.length() != s2.length()) {
			System.out.println("Not Anagram");
			return;
		}
		
		// convert char to array
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		// sort the array
		Arrays.sort(a);
		Arrays.sort(b);
		
		// compare sorted array using equals
		if(Arrays.equals(a,b)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
		
	}
	public static void main(String[] args) {
		CheckAnagram("java","avaj");
	}
}
