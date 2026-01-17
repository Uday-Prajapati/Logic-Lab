import java.util.Scanner;

public class UserInterface 
{
	
	public static boolean isValidSentence(String sentence) {
		for(int i=0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if(!((Character.isLetter(ch) || ch == ' '))) {
				return false;
			}
		}
		return true;
	}
	
	// reversed
	public static String reverseWord(String words){
		String rev = "";
        for (int i = words.length() - 1; i >= 0; i--) {
            rev += words.charAt(i);
        }
        return rev;
	}

	public static void main(String args[]) 
	{
		Scanner sc =new Scanner(System.in);
		//Fill the code
		System.out.println("Enter the sentence");
		String sentence = sc.nextLine();
		
		// ensure if @ not there
		if(!isValidSentence(sentence)) {
			System.out.println(sentence + " is an invalid sentence");
			return;
		}
		
		String[] words = sentence.split(" ");
		
		if(words.length <= 2) {
			System.out.println("Invalid Length");
			return;
		}
		
		// reverse middle words
		int left = 1;
		int right = words.length - 2;

		while (left <= right) {
		    if (left == right) {
		        words[left] = reverseWord(words[left]);
		    } else {
		        String temp = reverseWord(words[left]);
		        words[left] = reverseWord(words[right]);
		        words[right] = temp;
		    }
		    left++;
		    right--;
		}
		
		String temp = words[0];
		words[0] = words[words.length-1];
		words[words.length-1] = temp;
		
		System.out.println(String.join(" ", words));
	}
	
}	
